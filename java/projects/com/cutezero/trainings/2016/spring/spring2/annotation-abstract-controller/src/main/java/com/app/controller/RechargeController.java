package com.app.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.dto.RechargePlanDto;

@Controller
public class RechargeController {

	@RequestMapping("/plans.cfn")
	public String rechargeMobile(Model model, @RequestParam("provider") String provider) throws Exception{
		List<RechargePlanDto> plans= null;
		switch (provider) {
		case "jio":
			plans=Arrays.asList(new RechargePlanDto("JIO149", 149, 0, 28, "0 validity denotes UNLIMITED"),
					new RechargePlanDto("JIO299", 299, 0, 56, "UNLIMITED 4G for 56days"),
					new RechargePlanDto("JIO399", 399, 399, 0, "Freedom value"),
					new RechargePlanDto("JIO5999", 5999, 0, 365, "UNLIMITED everything for 365 days and 100SMS per day"));
			break;

		case "airtel":
			plans=Arrays.asList(new RechargePlanDto("AIRT100", 100, 90.68f, 0, "0 validity denotes UNLIMITED"),
					new RechargePlanDto("AIRT149", 149, 0, 28, "UNLIMITED 4G for 28days"),
					new RechargePlanDto("AIRT199", 199, 199, 0, "Full Talk value"),
					new RechargePlanDto("AIRT2999", 2999, 0, 91, "UNLIMITED everything for 91 days"));
			break;
			
		case "vodafone":
			plans=Arrays.asList(new RechargePlanDto("Voda100", 100, 90.68f, 0, "0 validity means UNLIMITED"),
					new RechargePlanDto("SUpernet49", 49, 0, 28, "UNLIMITED 4G for 28days"),
					new RechargePlanDto("VODA199", 199, 199, 0, "Full vodafone value"),
					new RechargePlanDto("VODA2999", 2999, 0, 91, "UNLIMITED vodafone for 91 days"));
			break;
			
		case "idea":
			plans=Arrays.asList(new RechargePlanDto("IDEAVALUE", 100, 90.68f, 0, "0 validity denotes UNLIMITED"),
					new RechargePlanDto("IDEA4G", 149, 0, 28, "UNLIMITED 4G for 28days"),
					new RechargePlanDto("IDEA199", 199, 199, 0, "Full Idea use for Unlimited"),
					new RechargePlanDto("SUPERPack", 2999, 0, 91, "UNLIMITED Idea for 91 days"));
			break;
			
		case "bsnl":
			plans=Arrays.asList(new RechargePlanDto("BSNL99", 99, 80.50f, 0, "0 validity denotes UNLIMITED"),
					new RechargePlanDto("BSNL249", 249, 0, 28, "UNLIMITED 3G for 28days"),
					new RechargePlanDto("BSNL299", 299, 199, 0, "Full Talk time with validyty"),
					new RechargePlanDto("BSNL3999", 3999, 0, 84, "UNLIMITED Broadband with router for 84 days"));
			break;
			
		default:
			throw new Exception("No plans available for your input");
//			break;
		}
//		model.addAllAttributes(Arrays.asList("PLAN1", "2G", "3G", "4G", "Internet", "Call"));
		model.addAttribute("plans", plans);
		return "recharge-plans";
	}
}
