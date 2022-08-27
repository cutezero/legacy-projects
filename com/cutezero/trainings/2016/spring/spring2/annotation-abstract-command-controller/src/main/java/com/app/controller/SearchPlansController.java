package com.app.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.dto.RechargePlanDto;
import com.app.dto.SearchPlansForm;

@Controller
public class SearchPlansController {

	@RequestMapping("/get-plans.cfn")
	public String getPlans(SearchPlansForm form, BindingResult errors, Model map ){
		//fetch the data from DB
		List<RechargePlanDto> plans= null;
		
		plans= Arrays.asList(new RechargePlanDto(form.getPlanName(), form.getAmount(), 89, form.getValidity(), form.getProviderName()+"-"+form.getPlanType()),
				new RechargePlanDto("AIR99", 99, 89, 0, "Unlimited validity"),
				new RechargePlanDto("AI78", 78, 89, 0, "2GB Internet"),
				new RechargePlanDto("AIR245", 245, 89, 0, "7GB Datapack"));
		System.out.println("Error count : "+errors.getErrorCount());
		System.out.println("Error count : "+errors.toString());
		map.addAttribute("plans", plans);
		return "recharge-plans";
	}
}
