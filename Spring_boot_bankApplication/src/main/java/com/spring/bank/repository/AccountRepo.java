package com.spring.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.bank.model.Account;

public interface AccountRepo  extends JpaRepository<Account, Long>{

}
