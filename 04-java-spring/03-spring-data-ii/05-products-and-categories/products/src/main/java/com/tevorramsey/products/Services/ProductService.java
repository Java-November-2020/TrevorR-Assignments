package com.tevorramsey.products.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tevorramsey.products.Models.Association;
import com.tevorramsey.products.Models.Category;
import com.tevorramsey.products.Models.Product;
import com.tevorramsey.products.Repositories.AssociationRepository;
import com.tevorramsey.products.Repositories.CategoryRepository;
import com.tevorramsey.products.Repositories.ProductRepository;
@Service
public class ProductService {
	private CategoryRepository cRepo;
	private ProductRepository pRepo;
	private AssociationRepository aRepo;
	
	public ProductService(CategoryRepository cRepo,ProductRepository pRepo,AssociationRepository aRepo) {
		this.cRepo = cRepo;
		this.pRepo = pRepo;
		this.aRepo = aRepo;
	}
	public List<Category> getAllCategory(){
		return this.cRepo.findAll();
	}
	public List<Product> getAllProduct(){
		return this.pRepo.findAll();
	}
	public Category findCategoryById(Long id) {
		return this.cRepo.findById(id).orElse(null);
	}
	public Product findProductById(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	public Category createCategory(Category category) {
		return this.cRepo.save(category);
	}
	public Product createProduct(Product product) {
		return this.pRepo.save(product);
	}
	public void addCategory(Category category, Product product) {
		List<Category> addCategory = product.getCategories();
		addCategory.add(category);
		this.pRepo.save(product);
	}
	public void addProduct(Category category, Product product) {
		List<Product> addProduct = category.getProducts();
		addProduct.add(product);
		this.cRepo.save(category);
	}
	public List<Category> findCategoriesNotInProduct(Product product) {
		return cRepo.findByProductsNotContains(product);
	}
	public List<Product> findProductsNotInCategory(Category category) {
		return pRepo.findByCategoriesNotContains(category);
	}
	public Association addAssociation(Association association) {
		return this.aRepo.save(association);
	}
}
