package bank.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bank.dao.RegisterDaoImpl;
import bank.model.Login;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName=request.getParameter("accUname");
		String password=request.getParameter("accPassword");
		
		Login lobj=new Login(userName, password);
		List<Login> lstLogin=new ArrayList<Login>();
		lstLogin.add(lobj);
		
		RegisterDaoImpl rdao=new RegisterDaoImpl();
		boolean b=rdao.validateUser(lstLogin);
		if(b=true)
		{
			response.sendRedirect("Home.html");
		}
		else
		{
			response.sendRedirect("Error.html");

		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
