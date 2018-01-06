package main.webapp.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;

/**
 * Servlet Filter implementation class AuthFilter
 */
@WebFilter("/pl/*")
public class AuthFilter implements Filter {

	private static final String CREATE = "create";
	private static final String READ = "read";
	private static final String UPDATE = "update";
	private static final String DELETE = "delete";

	private static List<String> creates = new ArrayList<>();
	private static List<String> reads = new ArrayList<>();
	private static List<String> updates = new ArrayList<>();
	private static List<String> deletes = new ArrayList<>();

	static {
		//creates
		//rreads
		//updates
		updates.add("/addRegDate");
		//deletes
	}

	/**
	 * Default constructor.
	 */
	public AuthFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("FILTER: PATH = " + ((HttpServletRequest) request).getPathInfo());
		if (isPathAttainable((HttpServletRequest) request, (HttpServletResponse) response)) {
			chain.doFilter(request, response);
		} else {
			((HttpServletResponse) response).sendRedirect("/CEPiK/");
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

	private boolean isPathAttainable(HttpServletRequest request, HttpServletResponse response) {
		String path = request.getPathInfo();
		if (creates.contains(path)) {
			return hasPermission(request, response, CREATE);
		} else if (reads.contains(path)) {
			return hasPermission(request, response, READ);
		} else if (updates.contains(path)) {
			return hasPermission(request, response, UPDATE);
		} else if (deletes.contains(path)) {
			return hasPermission(request, response, DELETE);
		} else {
			return true;
		}

	}

	private boolean hasPermission(HttpServletRequest request, HttpServletResponse response, String permissionType) {
		User user = ((User) request.getSession(true).getAttribute("user"));
		if (user != null) {
			switch (permissionType) {
			case CREATE:
				return user.isCreatePermission();
			case READ:
				return user.isReadPermission();
			case UPDATE:
				return user.isUpdatePermission();
			case DELETE:
				return user.isDeletePermission();
			default:
				return false;
			}
		} else {
			return false;
		}
	}

}
