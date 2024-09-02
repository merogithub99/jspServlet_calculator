package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/WebCalculator")
public class CalculatorServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    public CalculatorServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("UI.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int length = Integer.parseInt(request.getParameter("length"));
        int breadth = Integer.parseInt(request.getParameter("breadth"));
        
        int area = length * breadth;
        
        request.setAttribute("area", area);
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}
