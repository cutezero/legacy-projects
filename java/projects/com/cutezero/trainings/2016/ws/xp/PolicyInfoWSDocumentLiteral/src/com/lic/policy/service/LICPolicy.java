package com.lic.policy.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;

import com.lic.policy.types.MemberCard;
import com.lic.policy.types.MemberInfo;

@SOAPBinding(parameterStyle=ParameterStyle.BARE)
@WebService(name="licPolicy", targetNamespace="http://lic.com/policy/service")
public interface LICPolicy {

	@WebResult(name="memberCard", targetNamespace="http://lic.com/policy/types")
	@WebMethod(action="http://lic.com/policy/service#enroll")
	MemberCard enroll(@WebParam(name="memberInfo", targetNamespace="http://lic.com/policy/types")MemberInfo mInfo);
}
