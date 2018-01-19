package main.webapp.action.impl.form;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

import main.webapp.action.Action;

@Component
public class GoHomeAction implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response){
		return "home";
	}

}
