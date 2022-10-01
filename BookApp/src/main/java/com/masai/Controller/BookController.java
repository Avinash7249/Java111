package com.masai.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Entity.Book;
import com.masai.Service.BookService;



@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@PostMapping(value = "/bookservice/books")
	public ResponseEntity<Book> Save(@RequestBody Book book ){
		
		return new ResponseEntity<Book>(bookService.addBook(book),HttpStatus.ACCEPTED);
		
	}
	
	@PutMapping(value="/bookservice/books/{id}")
    public ResponseEntity<Book> deleteBook(@RequestBody Book book , @PathVariable("id") Integer id){
		
		return new ResponseEntity<Book>(bookService.DeleteBook(book),HttpStatus.ACCEPTED);
		
	}
	
	@PutMapping(value="/bookservice/books/{id}")
    public ResponseEntity<Book> Updatebook(@RequestBody Book book , @PathVariable("id") Integer id){
		
		return new ResponseEntity<Book>(bookService.UpdateBook(book),HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping(value="/bookservice/books")
    public ResponseEntity<List<Book>> getall(){
		
		return new ResponseEntity<List<Book>>(bookService.GetAllbooks(),HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping(value="/bookservice/books/{id}")
    public ResponseEntity<Book> getallById(@PathVariable("id") Integer id){
		
		return new ResponseEntity<Book>(bookService.particularbookbyid(id),HttpStatus.ACCEPTED);
		
	}
	
	

}
