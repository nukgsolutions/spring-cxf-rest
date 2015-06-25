package com.nukg.services.impl;
import org.springframework.beans.factory.annotation.Autowired;

import com.nukg.dao.ProductDao;
import com.nukg.model.Product;
import com.nukg.services.ProductService;

public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductDao prodcutDao;
	
public Product getProduct(String id) {
	System.out.println("product id="+id);
	return prodcutDao.getProduct(id);
}
	
	
	public Product saveProduct(Product product) {
		return prodcutDao.saveProduct(product);
		
	}

}
