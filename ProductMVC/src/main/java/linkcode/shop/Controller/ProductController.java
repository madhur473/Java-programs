package linkcode.shop.Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import linkcode.shop.model.Product;

/**
 * Servlet implementation class PoductController
 */
@WebServlet("/ProductController")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Product> lstproduct;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductController() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init() {
    	lstproduct =new LinkedList<Product>();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int prodId=Integer.parseInt(request.getParameter("prodId"));
		String pName=request.getParameter("pName");
		int prodQty=Integer.parseInt(request.getParameter("prodQty"));
		int prodPrice=Integer.parseInt(request.getParameter("prodPrice"));
		
		Product prodObj=new Product(prodId, pName, prodQty, prodPrice);
		lstproduct.add(prodObj);
		
		HttpSession session = request.getSession(true);
		session.setAttribute("data", lstproduct);
		response.sendRedirect("ProductCart");		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
