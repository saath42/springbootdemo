package com.boot.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	/*
	 * @RequestMapping("/")
	 * 
	 * @ResponseBody public String index() { return
	 * "Welcome to spring boot raz"; }
	 */

	@RequestMapping("/greeting")
	public String greeting(
			@RequestParam(value = "name", required = false, defaultValue = "raz") String name,
			Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}

	// view controller in mvc config will provide the template.
	/*@RequestMapping("/login")
	public String login() {
		return "login";
	}
*/
}
