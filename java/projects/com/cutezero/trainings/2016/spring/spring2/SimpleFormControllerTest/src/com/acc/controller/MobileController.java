package com.acc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.acc.bo.MobileBo;
import com.acc.dto.MobileDto;
import com.acc.service.MobileService;

public class MobileController extends SimpleFormController{

	private MobileService mobileService;
	
	public void setMobileService(MobileService mobileService) {
		this.mobileService = mobileService;
	}

	@Override
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		
		MobileDto dto=(MobileDto)command;
		if(dto.getBrand().trim()==null || dto.getMinPrice()==0 || dto.getMaxPrice()==0)
		{
			return showForm(request, response, errors);
		}
		List<MobileBo> mlist=mobileService.getSearchedMobile(dto);
		ModelAndView mv=new ModelAndView();
		mv.addObject("mob",mlist);
		mv.setViewName("mobile");
		return mv;
	}
}
