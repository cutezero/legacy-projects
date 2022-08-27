package com.cfn.spring.mvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cfn.spring.mvc.dao.IEmpDao;
import com.cfn.spring.mvc.model.Employee;

@Controller
public class EmployeeController {

	@Autowired
	private IEmpDao employeeDao;
	
	@RequestMapping(value="add")
	public ModelAndView addEmployee(){
		return new ModelAndView("addEmployee");
	}
	
	@RequestMapping(value="save", method=RequestMethod.POST)
	public ModelAndView saveEmployee(HttpServletRequest request){
		Employee e= new Employee();
		e.setEmpId(Integer.parseInt(request.getParameter("empid")));
		e.setEmpName(request.getParameter("empname"));
		e.setEmpAge(Integer.parseInt(request.getParameter("empage")));
		e.setSalary(Long.parseLong(request.getParameter("empsalary")));
		e.setEmpAddress(request.getParameter("empaddress"));
		
		employeeDao.addEmployee(e);
		return new ModelAndView("index", "message", "Employee added/updated Succesfully to Database");
	}
	
	@RequestMapping(value="employees")
	public ModelAndView listEmployees(ModelMap map){
		List<Employee> list= employeeDao.listEmployeess();
		map.addAttribute("employees", list);		
		return new ModelAndView("employeesList");
	}
	
	@RequestMapping(value="edit" )
	public ModelAndView editEmployee(@RequestParam("id") int empid){
				
		return new ModelAndView("editEmployee", "eid", empid);
	}
	
	@RequestMapping(value="delete" )
	public ModelAndView deleteEmployee(@RequestParam("id") int empid, ModelMap map){
		Employee e= new Employee();
		e.setEmpId(empid);
		employeeDao.deleteEmployee(e);
		
		List<Employee> list= employeeDao.listEmployeess();
		map.addAttribute("employees", list);	
		
		return new ModelAndView("employeesList");
	}
}
