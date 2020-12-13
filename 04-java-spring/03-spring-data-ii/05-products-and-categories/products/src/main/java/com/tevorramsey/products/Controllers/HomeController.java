package com.tevorramsey.products.Controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tevorramsey.products.Models.Association;
import com.tevorramsey.products.Models.Category;
import com.tevorramsey.products.Models.Product;
import com.tevorramsey.products.Services.ProductService;

@Controller
public class HomeController {
	private ProductService pService;
	public HomeController(ProductService pService) {
		this.pService = pService;
	}
	@RequestMapping("/")
	public String index() {
		return "redirect:/products/new";
	}
	@RequestMapping("/products/new")
	public String newProduct(@ModelAttribute("products") Product product) {
		return "newProduct.jsp";
	}
	@PostMapping("/products")
	public String product(@Valid @ModelAttribute("products")Product product, BindingResult result) {
		if(result.hasErrors()) {
			return "newProduct.jsp";
		}
		this.pService.createProduct(product);
		return "redirect:/categories/new";
	}
	@RequestMapping("/categories/new")
	public String newCategories(@ModelAttribute("categories")Category category) {
		return "newCategory.jsp";
	}
	@PostMapping("/categories")
	public String category(@Valid @ModelAttribute("categories")Category category, BindingResult result) {
		if(result.hasErrors()) {
			return"newCategory.jsp";
		}
		this.pService.createCategory(category);
		return "redirect:/products/new";
	}
	@RequestMapping("/categories/{id}")
	public String showCategory(@ModelAttribute("association")Association association,@PathVariable("id")Long id, Model model,Category category) {
		model.addAttribute("category",this.pService.findCategoryById(id));
		model.addAttribute("noProduct", this.pService.findProductsNotInCategory(category));
		return "showCategory.jsp";
	}
	@GetMapping("/products/{id}")
	public String showProduct(@ModelAttribute("association") Association association, @PathVariable("id")Long id, Model model,Product product) {
		model.addAttribute("product", this.pService.findProductById(id));
		model.addAttribute("noCategory",this.pService.findCategoriesNotInProduct(product));
		return "showProduct.jsp";
	}
	
	@PostMapping("/addCategory")
	public String addCategory(@ModelAttribute("association")Association association){
		this.pService.addAssociation(association);
		return "redirect:/products/new";
	}
	@PostMapping("/addProduct")
	public String addProduct(@ModelAttribute("association")Association association){
		this.pService.addAssociation(association);
		return "redirect:/products/new";
	}
	

}
