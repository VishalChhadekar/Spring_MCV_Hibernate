package com.spring.mvc.controller;

import java.util.List;

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

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

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

	@RequestMapping("/singup")
	public String singUp(@ModelAttribute User user, Model model) {
		int result = userDao.saveUser(user);
		System.out.println("User saved ID: " + result);
		return "singing";
	}

	@RequestMapping("/viewUsers")
	public String getAllUsers(Model model) {
		List<User> allUser = userDao.getAllUser();
		model.addAttribute("allUsers", allUser);
		return "view_users";
	}
}
