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
import linkcode.shop.model.Product;

@WebServlet("/ProductCart")
public class ProductCart extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ProductCart() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession();
        List<Product> lstproduct = (List<Product>) session.getAttribute("data");

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>Confirm List</title>");
        out.println("<style>");
        out.println("body { font-family: Arial, sans-serif; background-color: #f5f5f5; margin: 0; padding: 0; }");
        out.println("table { width: 80%; margin: 20px auto; border-collapse: collapse; }");
        out.println("th, td { border: 1px solid #ddd; padding: 8px; text-align: left; }");
        out.println("th { background-color: #f2f2f2; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Confirm List</h1>");
        
        if (lstproduct != null && !lstproduct.isEmpty()) {
            out.println("<table>");
            out.println("<tr><th>Product Id</th><th>Product Name</th><th>Quantity</th><th>Price</th></tr>");
            for (Product pobj : lstproduct) {
                out.println("<tr>");
                out.println("<td>" + pobj.getProdId() + "</td>");
                out.println("<td>" + pobj.getpName() + "</td>");
                out.println("<td>" + pobj.getProdQty() + "</td>");
                out.println("<td>" + pobj.getProdPrice() + "</td>");
                out.println("</tr>");
            }
            out.println("</table>");
            out.println("<p>Do you want to add more products? If yes, <a href='ProductView.html'>click here</a>.</p>");
        } else {
            out.println("<p>No products added yet.</p>");
        }

        out.println("<br>");
        out.println("<br>Click Here <a href ='BillController'> Bill</a>");

        out.println("</body>");
        out.println("</html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
