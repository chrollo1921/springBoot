package com.envoydigital.controllers;

import java.util.List;

import javax.annotation.Resource;

import org.jboss.logging.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.envoydigital.model.Product;
import com.envoydigital.service.ProductService;

@RestController
public class RestProductListController {

	private static final Logger LOG = Logger.getLogger(RestProductListController.class);
	@Resource
	private ProductService productService;
	

	@GetMapping("/products/list")
	public List<Product> getAllProducts(){
		
		List<Product> products = (List<Product>) productService.getProducts();
		
		return products;
		
	}
	
	
}
