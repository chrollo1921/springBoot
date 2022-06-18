package com.envoydigital.service;

import com.envoydigital.forms.ProductEntryForm;
import com.envoydigital.model.Product;

public interface ProductService {

	Iterable<Product> getProducts();
	Product getProductForId(Long id);
	Product save(Product product);
	Product saveProductFromEntry(ProductEntryForm productEntry);
}
