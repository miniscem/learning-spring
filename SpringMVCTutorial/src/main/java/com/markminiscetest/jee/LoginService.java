package com.markminiscetest.jee;

import org.springframework.stereotype.Service;

//tell spring that this is a bean, and it should manage the service via @Service annotation
@Service
public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("in28Minutes") && password.equals("dummy");
	}

}