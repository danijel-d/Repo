package net.javap.firstwebp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorlServlet
 */
@WebServlet("/hello")
public class HelloWorlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	@Override
	   protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
	         throws ServletException, IOException {
	      resp.setContentType("text/plain");
	      resp.getWriter().write("Hello World! Maven Web Project Example.");
	   }
}
