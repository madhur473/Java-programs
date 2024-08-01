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

@WebServlet("/UpdateController")
public class UpdateController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public UpdateController() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int accNumber = Integer.parseInt(request.getParameter("accNumber"));
        float newBalance = Float.parseFloat(request.getParameter("newBalance"));

        RegisterDaoImpl bdao = new RegisterDaoImpl();
        Register register = new Register(accNumber, "", "", "", newBalance);

        int rowsAffected = bdao.updateRecord(register);

        PrintWriter pw = response.getWriter();
        pw.println("<!DOCTYPE html>");
        pw.println("<html>");
        pw.println("<head>");
        pw.println("<meta charset=\"UTF-8\">");
        pw.println("<title>Update Status</title>");
        pw.println("</head>");
        pw.println("<body>");
        pw.println("<h2>Update Status</h2>");
        if (rowsAffected > 0) {
            pw.println("<p>Record updated successfully.</p>");
        } else {
            pw.println("<p>Failed to update record.</p>");
        }
        pw.println("</body>");
        pw.println("</html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
