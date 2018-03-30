package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	
	// First testing set.
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	
	
	
	
	
	// Second testing set.	
	@RequestMapping("/showform2")
	public String showform2() {
		return "modeldemo-form";
	}
	
	
	@RequestMapping("/processNewForm")
	public String processNewForm(HttpServletRequest request, Model model) {
		// read the request parameter from the HTML form	
		String theName = request.getParameter("studentName");
		
		// convert the data to all caps
		theName = theName.toUpperCase();
		
		// create the message
		String result = "Yo " + theName;
		
		// add message to the model
		model.addAttribute("message", result);
		
		return "model-demo";		
	}
	
	
	
	// Third testing set.
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(
			@RequestParam("studentName") String theName, 
			Model model) {	
		
		// convert the data to all caps
		theName = theName.toUpperCase();
		
		// create the message
		String result = "RequestParameter in method signature working for " + theName;
		
		// add message to the model
		model.addAttribute("message", result);
		
		return "model-demo";		
	}
}