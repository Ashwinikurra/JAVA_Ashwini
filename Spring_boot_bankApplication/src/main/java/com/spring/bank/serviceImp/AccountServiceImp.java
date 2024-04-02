package com.spring.bank.serviceImp;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.spring.bank.Dto.AccountDto;
import com.spring.bank.mapper.AccountMapper;
import com.spring.bank.model.Account;
import com.spring.bank.repository.AccountRepo;
import com.spring.bank.service.AccountService;

@Service
public class AccountServiceImp implements AccountService {

	private AccountRepo accountRepo;
	
	
	public AccountServiceImp(AccountRepo accountRepo) {
		super();
		this.accountRepo = accountRepo;
	}


	@Override
	public AccountDto createAccount(AccountDto acountDto) {
		System.out.println(acountDto.getAcoountHolderName());
	 Account account= AccountMapper.maptoAccount(acountDto);
	System.out.println("hi"+ account.getAcoountHolderName());
	 Account savedAccount= accountRepo.save(account);
	 
		return AccountMapper.mapToAccountDto(savedAccount);
	}


	@Override
	public AccountDto getAccountById(Long id) {
		Account account=accountRepo
				.findById(id).orElseThrow(()-> new RuntimeException("Account does not exists"));
		
		return AccountMapper.mapToAccountDto(account);
	}


	@Override
	public AccountDto Deposite(Long id, double amount) {
		
		Account account=accountRepo
				.findById(id).orElseThrow(()-> new RuntimeException("Account does not exists"));
		
		double total =account.getBalance()+amount;
		account.setBalance(total);
		Account savedAccount= accountRepo.save(account);
		return  AccountMapper.mapToAccountDto(savedAccount);
	}


	@Override
	public AccountDto withdraw(long id, double amount) {
		
		Account  account=accountRepo.
				          findById(id).orElseThrow(()-> new RuntimeException("account doest not exists"));
		if(account.getBalance()<amount) {
			throw new RuntimeException("insufficient amount");
		}
		double total=account.getBalance()- amount;
		account.setBalance(total);
		Account savedAccount= accountRepo.save(account);
		
		return AccountMapper.mapToAccountDto(savedAccount);
	}


	@Override
	public List<AccountDto> getAllAccount() {
	List<Account> accounts= 	accountRepo.findAll();
	return accounts.stream().map((account)-> AccountMapper.mapToAccountDto(account))
			            .collect(Collectors.toList());
            	
	}


	@Override
	public void deleteById(long id) {
		Account  account=accountRepo.
		          findById(id).orElseThrow(()-> new RuntimeException("account doest not exists"));
	 accountRepo.deleteById(id);
	 
	}

	
}
