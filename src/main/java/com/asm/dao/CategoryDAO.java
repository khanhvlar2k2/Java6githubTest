package com.asm.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.asm.entity.Category;
import com.asm.entity.Product;

import java.util.List;

import javax.persistence.Entity;



public interface CategoryDAO extends JpaRepository<Category, Integer> {
//	@Query("SELECT c FROM Category p WHERE p.products.id=?1")
//	List <Category> findByProductId(int cate);
}
