package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Entity.Author;
import com.masai.Entity.Book;
import com.masai.service.AuthorService;

@RestController
public class AuthorController {
	
	@Autowired
	private AuthorService aservice;
	
	@PostMapping("/author")
	public ResponseEntity<Author> saveAuthor(@RequestBody Author author) {
		
		Author a=aservice.saveAuthor(author);
		
		return new ResponseEntity<Author>(a,HttpStatus.ACCEPTED);
		
	}
	@PostMapping("/authorb")
	public ResponseEntity<Book> saveBook(@RequestBody Book book) {
		
		Book a=aservice.saveBook(book);
		
		return new ResponseEntity<Book>(a,HttpStatus.ACCEPTED);
		
	}

}
