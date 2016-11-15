package com.blacktierental.springapp.repository;

import java.util.List;

import com.blacktierental.springapp.domain.Product;

public class InMemoryProductDao implements ProductDao{
	
	private List<Product> productList;
	
	public InMemoryProductDao(List<Product> productList) {
		this.productList = productList;
	}

	@Override
	public List<Product> getProductList() {
		return productList;
	}

	@Override
	public void saveProduct(Product prod) {
	}
	
	
}
