package com.in28minutes.springboot.web.application.springbootwebapplicationbootstrapjquery.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

//@Controller 
//public class WelcomeController {
//	@RequestMapping("/welcome")
//	public String loginMessage() {
//		return "welcome";
//	}
//}

@RestController
public class WelcomeController {
	
	@Autowired(required = false)
	
	@RequestMapping("/index")
    public ModelAndView IndexPage(HttpSession session) {
    	
    	//@SuppressWarnings("unchecked")
		//String messages = session.getAttribute("MY_SESSION_MESSAGES").toString();

    	//System.out.print(messages);		
    	
        ModelAndView modelAndView = new ModelAndView();
        //modelAndView.addObject("SESSION_MESSAGES", messages);
        modelAndView.setViewName("index");
        return modelAndView;
    }
	
    @RequestMapping("/welcome")
    public ModelAndView welcome(HttpSession session) {
    	
    	//@SuppressWarnings("unchecked")
		//String messages = session.getAttribute("MY_SESSION_MESSAGES").toString();
    	//System.out.print(messages);		
  	
        ModelAndView modelAndView = new ModelAndView();
        //modelAndView.addObject("SESSION_MESSAGES", messages);
        modelAndView.setViewName("welcome");
        return modelAndView;
    }
    
    @PostMapping("/persistMessage")
	public String persistMessage(@RequestParam("msg") String msg, HttpServletRequest request) {
		@SuppressWarnings("unchecked")
		String messages = msg;
		if (messages == "")
		{
			messages = "Asif";
		}
		request.getSession().setAttribute("MY_SESSION_MESSAGES", messages);
		return "redirect:/";
	}    
}