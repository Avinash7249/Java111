package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Dao.AuthorDao;
import com.masai.Dao.BookDao;
import com.masai.Entity.Author;
import com.masai.Entity.Book;
import com.masai.exception.BooktNotFound;

@Service
public class AuthorServiceImpl implements AuthorService{
	
	@Autowired
	private AuthorDao authordao;
	
	@Autowired
	private BookDao bookdao;

	@Override
	public Author saveAuthor(Author author) {
		
		return authordao.save(author);
	}

	@Override
	public Book saveBook(Book book) {
		
		
		
		return bookdao.save(book);
	}

	

	
	
	

}
