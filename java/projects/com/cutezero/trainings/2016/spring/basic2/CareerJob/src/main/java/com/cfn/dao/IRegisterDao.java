package com.cfn.dao;

import javax.servlet.http.HttpServletRequest;

import com.cfn.models.RegisterPerson;

public interface IRegisterDao {

	void register(RegisterPerson register, HttpServletRequest request);
}
