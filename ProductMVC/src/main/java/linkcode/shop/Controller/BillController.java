package linkcode.shop.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
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
 * Servlet implementation class BillController
 */
@WebServlet("/BillController")
public class BillController extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BillController() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int billNumber = 99999;
        java.util.Date billDate = new java.util.Date();
        float total = 0;
        float cgst = 0;
        float sgst = 0;
        float finalTotal = 0;
        
        HttpSession session = request.getSession(true);
        List<Product> lstproduct = (List<Product>) session.getAttribute("data");
        PrintWriter pw = response.getWriter();
        pw.println("<h1>Final List</h1>");
        for (Product pobj : lstproduct) {
            total += pobj.getProdPrice() * pobj.getProdQty(); // Accumulate total for each product
        }
        cgst = total * 0.06f;
        sgst = total * 0.06f;
        finalTotal = total + cgst + sgst;        
        Bill bilobj = new Bill(billNumber, billDate, total, cgst, sgst, finalTotal);
        List<Bill> billlst = (List<Bill>) session.getAttribute("bill");
        if (billlst == null) {
            billlst = new LinkedList<>();
        }
        billlst.add(bilobj);        
        session.setAttribute("bill", billlst);        
        response.sendRedirect("PrintBillController");
        
        
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
