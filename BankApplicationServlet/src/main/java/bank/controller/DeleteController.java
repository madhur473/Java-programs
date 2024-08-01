package bank.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bank.dao.RegisterDaoImpl;

@WebServlet("/DeleteController")
public class DeleteController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public DeleteController() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int accNumber = Integer.parseInt(request.getParameter("accNumber"));
        RegisterDaoImpl bdao = new RegisterDaoImpl();
        int i = bdao.deleteRecord(accNumber);
        PrintWriter pw = response.getWriter();
        if (i > 0) {
            pw.println("<h1> Record with account number " + accNumber + " deleted successfully.</h1>");
        } else {
            pw.println("<h1> Record with account number " + accNumber + " does not exist.</h1>");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
