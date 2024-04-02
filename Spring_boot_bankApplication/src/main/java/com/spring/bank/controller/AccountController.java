package com.spring.bank.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.bank.Dto.AccountDto;
import com.spring.bank.service.AccountService;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {
	
	private AccountService accountService;

	public AccountController(AccountService accountService) {
		super();
		this.accountService = accountService;
	 }
	
//add account rest API
	@PostMapping("/account")
	public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto accountDto){
	System.out.println(accountDto.toString());	
		return new ResponseEntity<>(accountService.createAccount(accountDto),HttpStatus.CREATED);
	}
	
//get Account by rest API
	@GetMapping("/{id}")
	public ResponseEntity<AccountDto> getAccountById(@PathVariable Long id){
		AccountDto accountDto= accountService.getAccountById(id);
		return ResponseEntity.ok(accountDto);
	}
// deposite rest API
	  
	@PutMapping("/{id}/deposite")
	public ResponseEntity<AccountDto> deposite( @PathVariable long id, 
			                                           @RequestBody Map<String, Double>  request){
		Double amount= request.get("amount");
		AccountDto accountDto=accountService.Deposite(id, amount);
	
		return ResponseEntity.ok(accountDto);
		
	}
//withdraw rest Api
	public ResponseEntity<AccountDto> withdraw(@PathVariable long id, 
            @RequestBody Map<String, Double>  request){
		
		double amount= request.get("amount");
		AccountDto accountDto= accountService.withdraw(id, amount);
		
		return ResponseEntity.ok(accountDto);
		
	}
// get all Accounts rest api
	@GetMapping
	public ResponseEntity<List<AccountDto>> getAllAccounts(){
		List<AccountDto> accounts= accountService.getAllAccount();
		
		return ResponseEntity.ok(accounts);
		
	}
// Delete Account rest api
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteAccount(@PathVariable long id){
		accountService.deleteById(id);
		
		return ResponseEntity.ok("account is deleted sucessfully");
		
	}
}
	
