package com.blacktierental.springapp.repository;

import java.util.List;
import com.blacktierental.springapp.domain.Product;

public interface ProductDao {

    public List<Product> getProductList();

    public void saveProduct(Product prod);

}