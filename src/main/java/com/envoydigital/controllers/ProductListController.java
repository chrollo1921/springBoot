package com.envoydigital.controllers;

import java.util.Currency;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.jboss.logging.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.envoydigital.forms.ProductEntryForm;
import com.envoydigital.model.Price;
import com.envoydigital.model.Product;
import com.envoydigital.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductListController {

	private static Logger LOG = Logger.getLogger(ProductListController.class);

	@Resource
	ProductService productService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String productList(Model model, HttpServletRequest request) {
		List<Product> products = (List<Product>) productService.getProducts();
		Map<Currency, Price> price = null;

		for (Product product : products) {
			LOG.info("Product Name:: " + product.getName());
			price = product.getPrices();
		}
		model.addAttribute("products", products);
		model.addAttribute("price", price);

		return "productList";
	}

	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public String getEditProduct(Model model, HttpServletRequest request, ProductEntryForm productEntryForm,
			@RequestParam(value = "productId") String productId, @RequestParam(value="productName", required = false) String ProductName) {
		
		LOG.info("Product ID::" + productId);
		Product product = productService.getProductForId(Long.parseLong(productId));
		if(Objects.nonNull(product)) {
			model.addAttribute("productEntryForm", productEntryForm);
			model.addAttribute("product", product);
			
			return "productEdit";
		}else {
			return "errorPage";
		}
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String productEdit(@Valid @ModelAttribute("productEntryForm") ProductEntryForm productEntryForm, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model,HttpServletRequest request) {

		if(bindingResult.hasErrors()) {
			LOG.info("Binding Result has errors, Validation Failed");
			return "/";
		}
		
		LOG.info("productID: " + productEntryForm.getProductId());
		LOG.info("productName: " + productEntryForm.getProductName());
		LOG.info("productDescription:: " + productEntryForm.getProductDescription());
		
		productService.saveProductFromEntry(productEntryForm);
		return "productEdit";
	}
	
}
