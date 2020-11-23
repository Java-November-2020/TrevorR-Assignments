package com.trevorramsey.books.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.trevorramsey.books.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book,Long>{
	List<Book> findAll();
}
