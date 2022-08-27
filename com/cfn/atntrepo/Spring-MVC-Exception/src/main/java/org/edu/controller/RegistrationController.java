package org.edu.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.edu.entities.Student;
import org.edu.entities.User;
import org.edu.service.StudentService;
import org.edu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {
	@Autowired
	private StudentService studentService;

	@Autowired
	private UserService userService;

	@Autowired
	@Qualifier("userValidator")
	private Validator validator;

	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(validator);
	}

	@RequestMapping("register")
	public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("register");
		mav.addObject("user", new User());
		return mav;
	}

	@RequestMapping(value = "/display-home", method = RequestMethod.POST)
	public String addUser(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("user") @Validated User user, BindingResult errors, Model model) {

		if (validator.supports(user.getClass())) {
			validator.validate(user, errors);
			if (errors.hasErrors()) {
				return "register";
			}
		}

		userService.register(user);
		return "home";
	}

	@RequestMapping("/postlogin")
	public ModelAndView addStudents(ModelAndView model, @ModelAttribute("user") User user) {
		List<Student> listStudents = studentService.getAllStudents();
		model.addObject("listStudents", listStudents);
		model.setViewName("postlogin");
		return model;
	}

}
