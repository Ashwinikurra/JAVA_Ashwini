package com.spring.bank.mapper;

import com.spring.bank.Dto.AccountDto;
import com.spring.bank.model.Account;

public class AccountMapper {


	public static Account maptoAccount(AccountDto accountDto){
		Account account=new Account(
				accountDto.getId(),
				accountDto.getAcoountHolderName(),
				accountDto.getBalance()
				);
		
		return account;
		
	}
	public static AccountDto mapToAccountDto(Account account)
	{
		System.out.println("HELLO"+account.getAcoountHolderName());
		AccountDto accountDto= new  AccountDto(
				account.getId(),
				account.getAcoountHolderName(),
				account.getBalance());
		return accountDto;
		
	}

}
