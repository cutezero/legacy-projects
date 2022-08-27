package com.mr.beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class FindPlanReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object target, Method method, Object[] args) throws Throwable {
		int age = (int) args[0];
		int zip = (int) args[1];
		String gender = (String) args[2];
		int coverageType = (int) args[3];
		int networkType = (int) args[4];
		int coPay = (int) args[5];
		if (method.getName().equals("findPlan")) {
			System.out.println("Original Logic Running");
			System.out.println("Age : " + age + ", zip : " + zip + ", gender : " + gender + ", coverageType : "
					+ coverageType + ", Network type : " + networkType + ", copay : " + coPay);
		}
		else
		{
			throw new Exception("wrong input");
		}
		return new String[] { "Medical Plan1", "MedicalPlan2" };
	}

}
