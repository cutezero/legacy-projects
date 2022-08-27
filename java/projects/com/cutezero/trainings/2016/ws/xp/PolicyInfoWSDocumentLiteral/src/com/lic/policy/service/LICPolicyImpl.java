package com.lic.policy.service;

import javax.jws.WebService;

import com.lic.policy.types.MemberCard;
import com.lic.policy.types.MemberInfo;

@WebService(endpointInterface="com.lic.policy.service.LICPolicy", serviceName="LICPolicyService")
public class LICPolicyImpl {

	public MemberCard enroll(MemberInfo mInfo){
		MemberCard card= new MemberCard();
		card.setMemberId(mInfo.getAge());
		card.setName(mInfo.getName());
		return card;
	}
}
