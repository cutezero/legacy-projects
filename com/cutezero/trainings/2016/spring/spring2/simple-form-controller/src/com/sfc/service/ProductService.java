package com.sfc.service;

import com.sfc.dao.ProductDao;
import com.sfc.dto.ProductDtoIn;

public class ProductService {

	private ProductDao productDao;

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
	
	public int addProduct(ProductDtoIn product){
		return productDao.addproduct(product);
		
	}
}
