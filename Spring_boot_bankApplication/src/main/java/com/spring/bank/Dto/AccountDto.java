package com.spring.bank.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
public class AccountDto {

	 private long id ;
	 private String acoountHolderName;
	 private double balance;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAcoountHolderName() {
		return acoountHolderName;
	}
	public void setAcoountHolderName(String acoountHolderName) {
		this.acoountHolderName = acoountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public AccountDto(long id, String acoountHolderName, double balance) {
		super();
		this.id = id;
		this.acoountHolderName = acoountHolderName;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "AccountDto [id=" + id + ", acoountHolderName=" + acoountHolderName + ", balance=" + balance + "]";
	}
	 

	  
}
