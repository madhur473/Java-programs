package linkcode.shop.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import linkcode.shop.model.Bill;
import linkcode.shop.model.Product;

/**
 * Servlet implementation class PrintBillController
 */
@WebServlet("/PrintBillController")
public class PrintBillController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrintBillController() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        List<Product> lstproduct = (List<Product>) session.getAttribute("data");
        List<Bill> lstbill = (List<Bill>) session.getAttribute("bill");

        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.println("<!DOCTYPE html>");
        pw.println("<html>");
        pw.println("<head>");
        pw.println("<title>Shopping Bill</title>");
        pw.println("<link rel='stylesheet' type='text/css' href='styles.css'>");
        pw.println("</head>");
        pw.println("<body>");
        Bill bilobj = lstbill.get(0);

        pw.println("<h1>Final Bill</h1>");
        pw.println("<h3> Bill Number: " + bilobj.getBillNumber() + "</h3>");
        pw.println("<h3> Bill Date: " + bilobj.getBillDate() + "</h3>");
        pw.println("<table style=\"border: 1px solid black; width: 100%; text-align: center;\">");
        pw.println("<tr>");
        pw.println("<th style=\"border: 1px solid black;\">Product ID</th>");
        pw.println("<th style=\"border: 1px solid black;\">Product Name</th>");
        pw.println("<th style=\"border: 1px solid black;\">Price</th>");
        pw.println("<th style=\"border: 1px solid black;\">Quantity</th>");
        pw.println("</tr>");

        for (Product pobj : lstproduct) {
            pw.println("<tr>");
            pw.println("<td style=\"border: 1px solid black;\">" + pobj.getProdId() + "</td>");
            pw.println("<td style=\"border: 1px solid black;\">" + pobj.getpName() + "</td>");
            pw.println("<td style=\"border: 1px solid black;\">" + pobj.getProdPrice() + "</td>");
            pw.println("<td style=\"border: 1px solid black;\">" + pobj.getProdQty() + "</td>");
            pw.println("</tr>");
        }

        pw.println("</table>");


       // Bill bilobj = lstbill.get(0);
        pw.println("<table>");
        pw.println("<tr><th>Total</th><th>CGST</th><th>SGST</th><th>Final Total</th></tr>");
        pw.println("<tr>");
      //pw.println("<td>" + bilobj.getBillNumber() + "</td>");
      //pw.println("<td>" + bilobj.getBillDate() + "</td>");
        pw.println("<td>" + bilobj.getTotal() + "</td>");
        pw.println("<td>" + bilobj.getCgst() + "</td>");
        pw.println("<td>" + bilobj.getSgst() + "</td>");
        pw.println("<td>" + bilobj.getFinalTotal() + "</td>");
        pw.println("</tr>");
        pw.println("</table>");
        pw.println("<h1>THANK YOU VISIT AGAIN!!!!</h1>");

        pw.println("</body>");
        pw.println("</html>");
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
