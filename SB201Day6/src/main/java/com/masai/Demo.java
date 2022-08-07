package com.masai;

import java.awt.PageAttributes.MediaType;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/studentapp") 
public class Demo {
	

	@GetMapping(value = "/product")
	
	public List<Product> getProduct() {
		
    List<Product> product = new ArrayList<Product>();
		
    Product pro=new Product();
	pro.setBrand("Puma");
	pro.setCategory("siliper");
	pro.setId(2);
	pro.setManufacturer_id(23);
	pro.setName("Pushpa");
	pro.setPrice(400);
	pro.setRegistration_number(200);
	
	Product pro1=new Product();
	pro1.setBrand("Puma");
	pro1.setCategory("siliper");
	pro1.setId(5);
	pro1.setManufacturer_id(63);
	pro1.setName("Pushparaj");
	pro1.setPrice(700);
	pro1.setRegistration_number(300);
	
	product.add(pro1);
	product.add(pro);
	
	return product;
	}
	
	@GetMapping(value = "/product/{id}/{price}")
	public Product getProduct(@PathVariable("id") Integer id,@PathVariable("price") Integer price) {
	    Product pro=new Product();
		pro.setBrand("Puma");
		pro.setCategory("siliper");
		pro.setId(id);
		pro.setManufacturer_id(23);
		pro.setName("Pushpa");
		pro.setPrice(price);
		pro.setRegistration_number(200);
		
	return pro;
	}
	
	@PostMapping(value = "/product")
	public String saveProductDetails(@RequestBody Product pro) {
	
	return "Student stored ,"+pro;
	}
	
	
	@PutMapping(value = "/product/{id}")
	public Product updateProductDetails(@RequestBody Product pro,@PathVariable("id")int id) {
	pro.setId(pro.getId()+id);
	return pro;
	}

	@DeleteMapping(value = "/product/{id}")
	public ResponseEntity<Product> deleteProductDetails(@PathVariable("id")int id) {
		
		 Product product = productRepository.findById(id);
			      

	      employeeRepository.delete(product);
		
		
	return null;
	}



}
