package com.tevorramsey.products.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tevorramsey.products.Models.Category;
import com.tevorramsey.products.Models.Product;

public interface ProductRepository extends CrudRepository<Product,Long>{
	List<Product> findAll();

	List<Product> findByCategoriesNotContains(Category category);
}
