package com.utc.dip.controller;

import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.utc.dip.model.Student;

@Controller
public class StudentController {
	
	@RequestMapping(value="/student",method=RequestMethod.GET)
	 public ModelAndView student() {
	      return new ModelAndView("student", "command", new Student());
	   }
	
	
	
	@RequestMapping(value="/addStudent",method=RequestMethod.POST)
	public String addStudent(@ModelAttribute("SpringWeb") Student student,ModelMap model) {
		
		model.addAttribute("name",student.getName());
		model.addAttribute("age",student.getAge());
		model.addAttribute("id",student.getId());
//	   model.addAttribute("address",getAddress() );
//	   model.addAttribute("mobile", getMobile());
//	  model.addAttribute("gender",getGender());
	   
		return "result";
		
		
	}
}
