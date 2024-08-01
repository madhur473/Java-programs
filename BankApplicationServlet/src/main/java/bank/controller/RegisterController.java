package bank.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bank.dao.RegisterDao;
import bank.dao.RegisterDaoImpl;
import bank.model.Register;



@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	
    public RegisterController() {
        super();
       
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int accNumber=Integer.parseInt(request.getParameter("accNumber"));
		String accFname=request.getParameter("accFname");
		String accUname=request.getParameter("accUname");
		String accPassword=request.getParameter("accPassword");
		float accBal=Float.parseFloat(request.getParameter("accBal"));
		
		Register regmodel=new Register(accNumber, accFname, accUname, accPassword, accBal);
		
		List<Register> lstRegister=new ArrayList<Register>();
		lstRegister.add(regmodel);
		
		//create object of dao class
		
		RegisterDao rdao=new RegisterDaoImpl();
		int i=rdao.createRecord(lstRegister);
		
		if(i>0)
		{
			response.sendRedirect("LoginView.html");
		}
		else
		{
			response.sendRedirect("Error.html");
		}
		
//		PrintWriter pw=response.getWriter();
//		pw.println("<table>");
//		pw.println("<tr><td>"+regmodel.getAccNumber()+"</td><td>"+regmodel.getAccFname()+"</td><td>"+regmodel.getAccBal()+"</td></tr>");
//		pw.println("</table>");
//		
//		pw.println("<a href='Home.html'>Home Page</a>");
		}

}
