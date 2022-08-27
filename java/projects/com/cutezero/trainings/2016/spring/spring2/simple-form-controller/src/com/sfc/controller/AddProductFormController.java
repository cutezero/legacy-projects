package com.sfc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.sfc.dto.ProductDtoIn;
import com.sfc.service.ProductService;

public class AddProductFormController extends SimpleFormController{

	private ProductService productService;
	
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	@Override
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		int dbResult=0;
		String responseMessage= null;
		ProductDtoIn productDto= null;
		ModelAndView mav= null;
		
		System.out.println("controller");
		
		productDto=(ProductDtoIn) command;
		
		dbResult=productService.addProduct(productDto);
		responseMessage="Successfully saved with Product ID : "+dbResult;
		
		mav= new ModelAndView();
		mav.addObject("responseMessage", responseMessage);
//		mav.addObject("errors", errors);
		mav.setViewName("add-product-response");
		
		return mav;
	}

	
}
