package org.edu.controller;

import java.io.IOException;
import java.util.List;

import javax.validation.Valid;

import org.edu.entities.Student;
import org.edu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SaveStudentController {

	@Autowired
	StudentService studentService;
	
	
	@RequestMapping("/save-students")
	public String dopost(Model model) {
		model.addAttribute("student", new Student());
		return "add-students";
	}
	
	
	@RequestMapping("/add-students")
	public String newStudent(@Valid Student student, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return "add-students";
		}
		studentService.saveStudent(student);
		List<Student> listStudents = studentService.getAllStudents();
		model.addAttribute("listStudents", listStudents);
		
		model.addAttribute("student", new Student());
		return "postlogin";

	}
	
	
	@RequestMapping(value = "/students")
	public ModelAndView listEmployee(ModelAndView model) throws IOException {
		List<Student> listStudents = studentService.getAllStudents();
		model.addObject("listStudents", listStudents);
		model.setViewName("postlogin");
		return model;
	}
}
