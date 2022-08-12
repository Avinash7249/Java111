package com.masai.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Integer AuthorId;
	private String  name ;
	private Integer age ;
	private String  address ;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy = "author")
	List<Book> books=new ArrayList<>();


}
