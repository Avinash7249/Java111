package com.masai.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.Entity.Author;
import com.masai.Entity.Book;
import com.masai.exception.BooktNotFound;
@Service
public interface AuthorService {
	
	public Author saveAuthor(Author author);

	public Book saveBook(Book book);
	
	

}
