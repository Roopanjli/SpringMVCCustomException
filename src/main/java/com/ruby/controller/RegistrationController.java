package com.ruby.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ruby.bean.RegistrationBean;
import com.ruby.exception.UserDefinedException;

@Controller
public class RegistrationController {
	@ModelAttribute("profession")
	public List<String> populateProfessionList()
	{
		List <String>profession = new ArrayList<String>(); 
		profession.add("Devloper");
		profession.add("Manager");
		profession.add("Architect");
		
		return profession;
	}
	@ModelAttribute("hobby")
	public List<String> populateHobbyList(){
	List<String> hobby=new ArrayList<String>();
	hobby.add("Painting");
	hobby.add("Cricket");
	hobby.add("Music");
	hobby.add("Eating");
	return hobby;
	
		}
	@RequestMapping(value="/RegistrationPage")
	public ModelAndView registration() {
		return new ModelAndView("registrationForm","rb",new RegistrationBean());
}
	@RequestMapping(value="/Operation" , method=RequestMethod.POST)
	public String proccessing(@Valid @ModelAttribute("rb") RegistrationBean rb ,BindingResult result ) throws Exception {
		if(result.hasErrors()) {
			System.out.println("if loop");
			return "registrationForm";
		}
		else if (rb.getFirstName().length()<5) {
			throw new Exception();
		}
		else if (rb.getLastName().length()<5) {
			throw new UserDefinedException("CUstom Exception","Last name should have more then 5 letter");
		}
		return"success";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}