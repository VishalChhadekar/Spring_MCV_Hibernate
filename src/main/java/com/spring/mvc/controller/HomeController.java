package com.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.mvc.dao.UserDao;
import com.spring.mvc.entity.User;

@Controller
public class HomeController {
	@Autowired
	private UserDao userDao;

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("Home url mapping by controller");
		model.addAttribute("name", "Lucifer");
		return "home";
	}

	@RequestMapping("/services")
	public String services() {
		System.out.println("Services url");
		return "services";
	}

	@RequestMapping(path = "/singup", method = RequestMethod.POST)
	public String singUp(@ModelAttribute User user, Model model) {
		int result = userDao.saveUser(user);
		System.out.println("User saved ID: " + result);
		return "singing";
	}
}
