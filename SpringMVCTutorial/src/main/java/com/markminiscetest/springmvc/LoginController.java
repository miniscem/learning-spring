package com.markminiscetest.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.markminiscetest.jee.LoginService;

//tell spring this is a controller to handle web requests via annotation

@Controller
public class LoginController {
	
	//dependency provided by spring, and injected within the controller.
	//spring creates the instance of LoginService and provides it to the LoginController. 
	@Autowired
	LoginService loginService;  
	
	//Example 1: return simple response body.
	//by default, the dispatcherServlet is expecting the name of a view.
	//@RequestBody annotation tells the dispatcherServlet that controller is sending
	//a simple response body.
	@RequestMapping(value="/login/test")
	@ResponseBody 
	public String sayHello(){
		return "Hello World from spring LoginController controller"; 
	}
	
	
	//Example 2: return a view, not just simple request body (Example 1)
	//no ResponseBody annotation, dispatcherServlet knows it needs to resolve a view.
	//it resolves the view using the bean in todo-servlet.xml.
	@RequestMapping(value="/login", method=RequestMethod.GET)	
	public String showLoginPage(){
		return "login";
	}	
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String handleLoginRequest(@RequestParam String name, @RequestParam String password, ModelMap model){
		//model is available to the view. within jsp, access model by ${key}
		//example ${name}
		boolean userIsValid = loginService.validateUser(name, password);  
		
		if(userIsValid){ 
			return "welcome"; 
		}
		
		model.put("errorMessage", "Invalid credentials");
		return "login";
	}
}
