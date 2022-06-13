package com.envoydigital.controllers;

import java.util.List;

import javax.annotation.Resource;

import org.jboss.logging.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.envoydigital.model.Product;
import com.envoydigital.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductListController {
	
	private static Logger LOG = Logger.getLogger(ProductListController.class);
	
	@Resource
	ProductService productService;

	@RequestMapping("/list")
	public String productList(Model model) {
		List<Product> products = (List<Product>) productService.getProducts();
		
		for(Product product : products) {
			LOG.info("Product Name:: " + product.getName());
		}
		model.addAttribute("products", products);
		return "productList";
	}
	
}
 