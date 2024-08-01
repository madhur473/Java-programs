package linkcode.Controller;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.connector.Response;

import linkcode.model.Product;

/**
 * Servlet implementation class ProductController
 */
@WebServlet("/ProductController")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	List<Product> lstproduct;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	public void init() {
		lstproduct =new LinkedList<Product>();
		
	}
    public ProductController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int prodId = Integer.parseInt(request.getParameter("prodId"));
		String pName=request.getParameter("pName");
		int prodQty=Integer.parseInt(request.getParameter("prodQty"));
		float prodPrice=Float.parseFloat(request.getParameter("prodPrice"));

		Product prod =new Product(prodId, pName, prodQty, prodPrice);
		lstproduct.add(prod);
		
		HttpSession session=request.getSession();
		session.setAttribute("Product", lstproduct);
		response.sendRedirect("ProductView.jsp");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
