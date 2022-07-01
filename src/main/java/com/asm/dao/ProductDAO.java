package com.asm.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.asm.entity.Product;
import javax.persistence.Entity;



public interface ProductDAO extends JpaRepository<Product, Integer> {

	@Query("SELECT p FROM Product p WHERE p.category.id=?1")
	Page <Product> findByCategoryId(Pageable pageable,int cate);
	
	@Query("SELECT p FROM Product p WHERE p.id=?1")
	Product findbyProductId(int Id);
	
	

	
}
