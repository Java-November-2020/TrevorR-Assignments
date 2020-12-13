package com.tevorramsey.products.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tevorramsey.products.Models.Category;
import com.tevorramsey.products.Models.Product;

public interface CategoryRepository extends CrudRepository<Category,Long> {
	List<Category> findAll();

	List<Category> findByProductsNotContains(Product product);
}
