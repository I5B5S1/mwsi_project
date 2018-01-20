package main.webapp.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class LostSouls
 */
@WebFilter("/*")
public class LostSouls implements Filter {

	/**
	 * Default constructor.
	 */
	public LostSouls() {
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
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		String uri = ((HttpServletRequest) request).getRequestURI();
		if (uri.startsWith("/CEPiK/pl") || uri.equals("/CEPiK/")
				|| "/TableCreatorServlet".equals(((HttpServletRequest) request).getPathInfo())){
			chain.doFilter(request, response);
		} else{
			((HttpServletResponse) response).sendRedirect("/CEPiK/");
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
