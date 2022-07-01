package com.asm.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.asm.entity.Account;

import javax.persistence.Entity;

public interface AccountDAO extends JpaRepository<Account, String> {
	@Query("SELECT a from Account a WHERE a.email =?1 AND a.password=?2")
	public Account findByEmailANDPassword(String username, String password);
	
	@Query("SELECT a from Account a WHERE a.email =?1")
	public Account findByEmail(String username);
	
	@Query("SELECT a from Account a WHERE a.username =?1")
	public Account findByUserName(String username);
	
	@Query("SELECT a FROM Account a WHERE a.username LIKE ?1"
			+"OR a.fullname LIKE ?1"
			+"OR a.email LIKE ?1")
	List<Account> findByKeyWord(String keyword);
}

