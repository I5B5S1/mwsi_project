package main.webapp.action.impl.logic;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jpa.entities.UserEntity;
import jpa.services.UserService;
import main.webapp.action.Action;

@Component
public class LoginAction implements Action {

	@Autowired
	private UserService userService;
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		try{
			 String username = request.getParameter("username");
			 String password = request.getParameter("password");
			 
		     UserEntity user = userService.getUser(username);
		     if(user.getPassword().equals(password)){
		    	 request.getSession(true).setAttribute("user", user);
		    	 return "/CEPiK/";
		     }
			
		}catch(Exception e){
		}
		request.setAttribute("loginFailure", "Niepoprawna nazwa uzytkownika lub haslo");
		return "login";
	}

}
