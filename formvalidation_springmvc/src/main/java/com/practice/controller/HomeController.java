package com.practice.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.practice.model.SignUpForm;

@Controller
public class HomeController {

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {

		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);

		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	@ModelAttribute("signUpForm")
	public SignUpForm setSignUpForm() {
		return new SignUpForm();
	}

	@GetMapping("/showSignUpForm")
	public String showForm() {
		return "signup";
	}

	@PostMapping("/saveSignUpForm")
	public String saveUser(@Valid @ModelAttribute("signUpForm") SignUpForm signUpForm, BindingResult result,
			Model model) {

		System.out.println("FirstName : " + signUpForm.getFirstName());
		System.out.println("LastName : " + signUpForm.getLastName());
		System.out.println("Username : " + signUpForm.getUserName());
		System.out.println("Password : " + signUpForm.getPassword());
		System.out.println("Email : " + signUpForm.getEmail());

		if (result.hasErrors()) {
			return "signup";
		}
		model.addAttribute("message", "User SignUp successfully.");
		model.addAttribute("user", signUpForm);

		return "success";
	}
}
