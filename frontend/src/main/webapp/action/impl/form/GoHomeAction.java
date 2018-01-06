package main.webapp.action.impl.form;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.webapp.action.Action;

public class GoHomeAction implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response){
		return "home";
	}

}
