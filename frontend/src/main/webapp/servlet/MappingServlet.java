//package main.webapp.servlet;
//
//import java.io.IOException;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//import main.webapp.action.ActionFactory;
//import model.User;
//
///**
// * Servlet implementation class MappingServlet
// */
//@WebServlet("/pl/*")
//public class MappingServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		doPost(request, response);
//
//	}
//
//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
////		System.out.println("CONTEXT PATH = " + request.getContextPath());
////		System.out.println("Request URI  = " + request.getRequestURI());
//		System.out.println(ActionFactory.getAction(request));
//		HttpSession session = request.getSession(true);
//		System.out.println("USER = " + session.getAttribute("user"));
//		if (request.getRequestURI().endsWith("/login")) {
//
//			if (session.getAttribute("user") == null) {
//				request.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request, response);
//			} else {
//				response.sendRedirect("/CEPiK/");
//			}
//		} else if (request.getRequestURI().endsWith("/loginCredentials")) {
//			//if credentials check out with DB
//			if(true){
//				// invoke login method and set the retrned(?) object as "user" -
//				// session.setAttribute ("user" ..)
//			session.setAttribute("user",
//					new User((String) request.getAttribute("username"), (String) request.getAttribute("password")));
//			response.sendRedirect("/CEPiK/");
//			} else {
////				response.sendRedirect("/CEPiK/pl/login");
//				response.setCharacterEncoding("UTF-8");
//				request.getRequestDispatcher("/WEB-INF/view/login.jsp").include(request, response);
//				response.getWriter().append("Wprowadzony login lub has³o s¹ niepoprawne!");
//			}
//
//		} else {
//			System.out.println("KONIEC MAPPING");
//			response.sendRedirect("/CEPiK/");
//		}
//	}
//}
