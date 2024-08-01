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

@WebServlet("/DisplayallController")
public class DisplayallController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public DisplayallController() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RegisterDaoImpl bdao = new RegisterDaoImpl();
        List<Register> lst = bdao.displayAll();

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<title>Display All Records</title>");
        out.println("<style>");
        out.println("/* Add your CSS styles here */");
        out.println("body {");
        out.println("    font-family: Arial, sans-serif;");
        out.println("    background-color: white;");
        out.println("    font-size: 19px;");
        out.println("}");
        out.println("table {");
        out.println("    border-collapse: collapse;");
        out.println("    width: 100%;");
        out.println("}");
        out.println("th, td {");
        out.println("    border: 1px solid #ddd;");
        out.println("    padding: 8px;");
        out.println("    text-align: left;");
        out.println("}");
        out.println("th {");
        out.println("    background-color: #f2f2f2;");
        out.println("}");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h2>All Records</h2>");
        out.println("<table>");
        out.println("<tr><th>Account Number</th><th>First Name</th><th>Username</th><th>Balance</th></tr>");

        for (Register robj : lst) {
            out.println("<tr>");
            out.println("<td>" + robj.getAccNumber() + "</td>");
            out.println("<td>" + robj.getAccFname() + "</td>");
            out.println("<td>" + robj.getAccUname() + "</td>");
            out.println("<td>" + robj.getAccBal() + "</td>");
            out.println("</tr>");
        }

        out.println("</table>");
        out.println("<div style=\"text-align: center;\">");
        out.println("<form action=\"Home.html\">");
        out.println("<input type=\"submit\" value=\"Go Back\" style=\"padding: 10px 20px; font-size: 16px; background-color: black; color: white;\">"); // Changed button background and text color
        out.println("</form>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
