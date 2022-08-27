package com.app.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.app.bo.RechargeDetailsBo;
import com.app.btier.service.RechargeManagerService;

public class GetRechargeHistoryController extends AbstractController{

	private RechargeManagerService rechageService;
	
	public RechargeManagerService getRechageService() {
		return rechageService;
	}

	public void setRechageService(RechargeManagerService rechageService) {
		this.rechageService = rechageService;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav= null;
		List<RechargeDetailsBo> rechargeDetails= null;
		
		rechargeDetails= rechageService.getRechargeHistory();
		mav=new ModelAndView();
		mav.addObject("rechargeDetails", rechargeDetails);
		mav.setViewName("recharge-history");
		return mav;
	}

	
}
