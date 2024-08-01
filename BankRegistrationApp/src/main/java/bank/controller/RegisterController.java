package bank.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bank.dao.RegisterDao;
import bank.model.Register;

/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int accNumber=Integer.parseInt(request.getParameter("accNumber"));
		String accFname=request.getParameter("accFname");
		String accUname=request.getParameter("accUname");
		String accPassword=request.getParameter("accPassword");
		float accBal=Float.parseFloat(request.getParameter("accBal"));
		
		Register regmodel=new Register(accNumber, accFname, accUname, accPassword, accBal);
		
		//this code is to save data in database
		//RegisterDao rdao=new RegisterDao();
		//List lst=new ArrayList<Register>();
		//lst.add(regmodel);
		//rdao.saverecord(lst);
		
		PrintWriter pw=response.getWriter();
		pw.println("<table>");
		pw.println("<tr><td>"+regmodel.getAccNumber()+"</td><td>"+regmodel.getAccFname()+"</td><td"+regmodel+"</td><td>"+regmodel.getAccUname()+"</td><td>"+regmodel.getAccBal());
		pw.println("</table>");
		
		pw.println("<a href='Home.html'>Home Page</a>");
	}
}
