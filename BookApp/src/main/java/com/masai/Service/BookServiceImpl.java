package com.masai.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Entity.Book;
import com.masai.Repository.BookDao;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookDao bookDao;

	@Override
	public Book addBook(Book book) {
		
		Book s=bookDao.save(book);
		if(s==null) {
			System.out.println("Not Added Successfully");
		}
		
		return s;
	}

	@Override
	public Book DeleteBook(Book book) {
		
		
		Optional<Book> s=bookDao.findById(book.getBookId());
		if(s==null) {
			System.out.println("Not Found");
		}
		return s.get();
	}

	@Override
	public Book UpdateBook(Book book) {
		Optional<Book> s=bookDao.findById(book.getBookId());
		if(s!=null) {
			addBook(book);
		}
		return s.get();
	}

	@Override
	public List<Book> GetAllbooks() {
		
		List<Book> book=bookDao.findAll();
		return book;
	}

	@Override
	public Book particularbookbyid(Integer id) {
		
		Optional<Book> b=bookDao.findById(id);
		if(b==null) {
			System.out.println("Not Found");
		}
		return b.get();
	}

}
