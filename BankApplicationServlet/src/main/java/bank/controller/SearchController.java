package bank.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bank.dao.RegisterDaoImpl;
import bank.model.Register;

/**
 * Servlet implementation class SearchController
 */
@WebServlet("/SearchController")
public class SearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int accNumber=Integer.parseInt(request.getParameter("accNumber"));
        RegisterDaoImpl bdao=new RegisterDaoImpl();
        
        List<Register> lstrecord=bdao.retriveRecord(accNumber);
        PrintWriter pw=response.getWriter();
        if(lstrecord!=null)
        {
            Register robj=lstrecord.get(0);
            pw.println("<html>");
            pw.println("<head>");
            pw.println("<style>");
            pw.println("table { border-collapse: collapse; width: 100%; }");
            pw.println("th, td { border: 1px solid black; padding: 8px; text-align: left; }");
            pw.println("th { background-color: #f2f2f2; }");
            pw.println("</style>");
            pw.println("</head>");
            pw.println("<body>");
            pw.println("<h2>User Found!!</h2>");
            pw.println("<table>");
            pw.println("<tr><th>Account Number</th><th>First Name</th><th>User Name</th><th>Balance</th></tr>");
            pw.println("<tr><td>"+robj.getAccNumber()+"</td><td>"+robj.getAccFname()+"</td><td>"+robj.getAccUname()+"</td><td>"+robj.getAccBal()+"</td></tr>");
            pw.println("</table>");
            pw.println("</body>");
            pw.println("</html>");
        }
        else
        {
            response.sendRedirect("Error.html");
        }
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
