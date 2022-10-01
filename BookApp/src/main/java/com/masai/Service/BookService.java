package com.masai.Service;

import java.util.List;

import com.masai.Entity.Book;

public interface BookService {
	
	public Book addBook(Book book) ;
	
	public Book DeleteBook(Book book);
	
	public Book UpdateBook(Book book);
	
	public List<Book> GetAllbooks();
	
	public Book particularbookbyid(Integer id);
	
		
	

}
