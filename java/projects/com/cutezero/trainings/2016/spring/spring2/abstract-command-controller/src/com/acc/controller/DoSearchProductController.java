package com.acc.controller;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.acc.dto.ProductInDto;
import com.acc.dto.response.ProductOutDto;

public class DoSearchProductController extends AbstractCommandController{

	@Override
	protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object command, BindException bindException)
			throws Exception {
		
		ProductInDto productInDto= (ProductInDto) command;
		ModelAndView mav= new ModelAndView();
		mav.addObject("productsResult", Arrays.asList(new ProductOutDto("Infinix Note 4", "Mobiles", "Infinix", 7999), new ProductOutDto(productInDto.getName(), productInDto.getCategory(), productInDto.getBrand(), productInDto.getMinPrice())));
		mav.setViewName("product-result");
		return mav;
	}

	
}
