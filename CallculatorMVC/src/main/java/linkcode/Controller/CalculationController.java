package linkcode.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import linkcode.model.Calculation;

/**
 * Servlet implementation class CalculationController
 */
@WebServlet("/CalculationController")
public class CalculationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String str1=request.getParameter("num1");
		String str2=request.getParameter("num2");
		int n1=Integer.parseInt(str1);
		int n2=Integer.parseInt(str2);
		
		Calculation calci=new Calculation();
		calci.setNum1(n1);
		calci.setNum2(n2);
		
		String c=request.getParameter("Calci");
		int result=0;
		String str=null;
		
		if(c.equals("Add"))
		{
			calci.setResult(calci.getNum1()+calci.getNum2());
			str="add";
		}
		else if(c.equals("Sub"))
		{
			calci.setResult(calci.getNum1()-calci.getNum2());
			str="sub";
		}
		else if(c.equals("Multiply"))
		{
			calci.setResult(calci.getNum1()*calci.getNum2());
			str="multiply";
		}
		else if(c.equals("Divide"))
		{
			calci.setResult(calci.getNum1()/calci.getNum2());
			str="divide";
		}
		
		PrintWriter pw=response.getWriter();
		pw.println("<table border='2 px'>");
		pw.println("<tr><td>Number1</td>");
		pw.println("<td>"+calci.getNum1()+"</td></tr>");
		
		pw.println("<tr><td>Number2</td>");
		pw.println("<td>"+calci.getNum2()+"</td></tr>");
		
		pw.println("<tr><td>"+str+"</td>");
		pw.println("<td>"+calci.getResult()+"</td></tr>");

		
		pw.println("</table>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
