package com.envoydigital.forms;

import java.math.BigDecimal;
import java.util.Currency;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;


public class ProductEntryForm {

	
	private String productId;
	
	private String productName;
	
	private String productDescription;
	
	//private BigDecimal price;
	
	//private Currency currency;

	@NotEmpty
	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	
	@NotEmpty
	@Length(min = 1, max = 50)
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	
	@NotEmpty
	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

//	@NotEmpty
//	@Min(1)
//	@Pattern(regexp = "[0-9]+.[0-9]+")
//	public BigDecimal getPrice() {
//		return price;
//	}
//
//	public void setPrice(BigDecimal price) {
//		this.price = price;
//	}

//	@org.hibernate.validator.constraints.Currency(value = { "EUR, GBP" })
//	public Currency getCurrency() {
//		return currency;
//	}
//
//	public void setCurrency(Currency currency) {
//		this.currency = currency;
//	}
	
	
	
}
