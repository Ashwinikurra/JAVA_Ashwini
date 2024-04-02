package com.spring.bank.service;

import java.util.List;

import com.spring.bank.Dto.AccountDto;

public interface AccountService {
     AccountDto createAccount(AccountDto acount);
     
     AccountDto getAccountById(Long id);
     
     AccountDto Deposite(Long id , double amount);
     
     AccountDto withdraw(long id , double amount);
     
     List<AccountDto> getAllAccount();
     
     public void deleteById(long id);
}
