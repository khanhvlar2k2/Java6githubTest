package com.asm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.asm.entity.Account;
import com.asm.entity.Order;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;



public interface OrderDAO extends JpaRepository<Order, Integer> {
	
	Page<Order> findByAccount(Account account, Pageable pageable);
	
	@Query("SELECT o FROM Order o WHERE o.id=?1")
	Order findByOrderId(long Id);
	
}
