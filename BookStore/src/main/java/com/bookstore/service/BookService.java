package com.bookstore.service;


import java.util.List;

import com.bookstore.entity.Book;

public interface BookService {
	List<Book> findAll();
	/* Book findOne(Long id); */
   
}