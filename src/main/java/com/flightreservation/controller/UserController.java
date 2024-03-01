package com.flightreservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flightreservation.entity.User;
import com.flightreservation.repository.UserRepository;

@Controller
public class UserController {

	@Autowired
	private UserRepository userRepository;

	// http://localhost:8080/showReg
	@RequestMapping("/showReg")
	public String showReg() {
		return "login/showreg";
	}

	@RequestMapping("/saveReg")
	public String saveReg(@ModelAttribute User user, ModelMap model) {
		userRepository.save(user);
		model.addAttribute("msg", "registration successful");
		return "login/showreg";
	}

	// http://localhost:8080/showlogin
	@RequestMapping("/showlogin")
	public String showLogin() {
		return "login/login";
	}

	@RequestMapping("/verifyLogin")
	public String verifyLogin(@RequestParam("email") String email, @RequestParam("password") String password,ModelMap model) {
		User user = userRepository.findByEmail(email);
		if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
			return"searchflight";

		} else {
			model.addAttribute("msg", "invalid username/password");

			return "login/login";
		}
	}
}
