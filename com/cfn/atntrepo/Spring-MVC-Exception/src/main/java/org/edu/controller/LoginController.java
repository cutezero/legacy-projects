package org.edu.controller;

import java.util.List;

import org.edu.entities.Login;
import org.edu.entities.Student;
import org.edu.exce.UserNotFoundException;
import org.edu.service.StudentService;
import org.edu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@Autowired
	StudentService studentService;

	@Autowired
	UserService userService;

	@RequestMapping("/")
	public String showHomePage() {
		return "home";
	}

	@RequestMapping("/login")
	public String loginPage(Model model) {
		model.addAttribute("login", new Login());
		System.out.println("loginpage");
		return "login";
	}

	@RequestMapping("/dologin")
	@ExceptionHandler(UserNotFoundException.class)
	public ModelAndView loginPagedisplay(@ModelAttribute Login login) {
		ModelAndView mav = null;
		try {
			if (userService.validateUser(login.getUsername(), login.getPassword())) {
				mav = new ModelAndView("postlogin");
				List<Student> listStudents = studentService.getAllStudents();
				mav.addObject("listStudents", listStudents);
				mav.addObject("message", "login sucessfull");
			}
		} catch (UserNotFoundException exe) {
			mav = new ModelAndView("error");
			mav.addObject("exp", exe.getMessage());
		}
		return mav;
	}
}
