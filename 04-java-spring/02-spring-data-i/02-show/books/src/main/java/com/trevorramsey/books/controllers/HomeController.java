package com.trevorramsey.books.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.trevorramsey.books.models.Book;
import com.trevorramsey.books.services.BookService;

@Controller
public class HomeController {
	private BookService bService;
	
	public HomeController(BookService service) {
		this.bService=service;
	}
	@RequestMapping("/book/{id}")
	public String getBook(@PathVariable("id") Long id, Model model) {
		Book book= this.bService.getOneBook(id);
		model.addAttribute("book",book);
		return "book.jsp";
	}
	@RequestMapping(value="/book/{id}", method=RequestMethod.DELETE )
	public void deleteBook(@PathVariable("id") Long id) {
		this.bService.deleteBook(id);
	}
	@RequestMapping(value="/book/{id}", method=RequestMethod.PUT)
	 public Book update(@PathVariable("id") Long id, @RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages, Book book) {      
        return this.bService.updateBook(book);
    }
}
