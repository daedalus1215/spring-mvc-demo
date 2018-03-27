package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ModelDemoController {

	
	@RequestMapping("/showNewform")
	public String showNewForm() {
		return "modeldemo-form";
	}
	
	
	@RequestMapping("/processNewForm")
	public String processNewForm(HttpServletRequest request, Model model) {
//		// read the request parameter from the HTML form	
//		String theName = request.getParameter("studentName");
//		
//		// convert the data to all caps
//		theName = theName.toUpperCase();
//		
//		// create the message
//		String result = "Yo " + theName;
//		
//		// add message to the model
//		model.addAttribute("message", result);
		
		return "model-demo";		
	}
}
