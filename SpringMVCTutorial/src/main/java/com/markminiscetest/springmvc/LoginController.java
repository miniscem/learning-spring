package com.markminiscetest.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//tell spring this is a controller to handle web requests via annotation

@Controller
public class LoginController {
	
	
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
	@RequestMapping(value="/login")
	public String sayHelloLoginJspRedirect(){
		return "login";
	}
	
	
}
