package com.trevorramsey.books.services;



import org.springframework.stereotype.Service;

import com.trevorramsey.books.models.Book;
import com.trevorramsey.books.repositories.BookRepository;

@Service
public class BookService {
	private BookRepository bRepo;
	
	public BookService(BookRepository repo) {
		this.bRepo = repo;
	}
//	public List<book> getAllBooks(){
//		return this.bRepo.findall();
//	}
	public Book getOneBook(Long id){
		return this.bRepo.findById(id).orElse(null);
	}
	public void deleteBook(Long id) {
		this.bRepo.deleteById(id);
	}
	public Book updateBook(Book book) {
		return this.bRepo.save(book);
	}
	
}
	
