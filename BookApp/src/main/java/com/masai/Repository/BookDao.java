package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.Entity.Book;

@Repository
public interface BookDao extends JpaRepository<Book, Integer>{

}
