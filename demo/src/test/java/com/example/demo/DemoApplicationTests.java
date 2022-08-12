package com.example.demo;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;



import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entities.Product;
import com.example.demo.repos.ProductRepository;
@RunWith(SpringRunner.class)

@SpringBootTest
class DemoApplicationTests {
	
	@Autowired
	ProductRepository repository;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCreate() {
		Product product = new Product();
		product.setId(1);
		product.setName("Akita");
		product.setDesc(" is a powerful, independent, and dominant breed");
		product.setPrice(200d);
		repository.save(product);
		product.setId(2);
		product.setName("Bruno Jura hound");
		product.setDesc("  is generally a healthy breed with no known inherited health problems");
		product.setPrice(290d);
		repository.save(product);
		product.setId(3);
		product.setName("Manchester Terrier");
		product.setDesc("  is a breed of dog of the smooth-haired ");
		product.setPrice(500d);
		product.setId(4);
		product.setName("Valley bulldog");
		product.setDesc(" is not a purebred dog, but a cross between the English Bull Dog and the Boxer");
		product.setPrice(600d);
		repository.save(product);
		product.setId(5);
		product.setName("Boykin sapaniel");
		product.setDesc(" s best suited for owners that can spend plenty");
		product.setPrice(430d);
		repository.save(product);
		product.setId(6);
		product.setName("Manchester Terrier");
		product.setDesc("  is a breed of dog of the smooth-haired ");
		product.setPrice(500d);
		
	}
	
	@Test
	public void testRead() {
	Product product	= repository.findById(1).get();
	assertNotNull(product);
	assertEquals("Bon", product.getName());
	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>" + product.getDesc());
	System.out.println(">>>>>>>>>>>>>>>>>>>" + product.getDesc());
	}
	
	
	@Test
	public void testUpdate() {
	Product product = repository.findById(1).get();
		product.setPrice(1200d);
		repository.save(product);
	}
	
	@Test
public void testDelete() {
		if(repository.existsById(null)) {
			System.out.println("Deleting a product");
	repository.deleteById(null);
		
		}
}
	@Test
public void testCount() {
		
	System.out.println("Total record >>>>>>>>>>" + repository.count());
		
		}
}

