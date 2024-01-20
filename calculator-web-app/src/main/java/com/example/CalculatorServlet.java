package com.example;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int num1 = Integer.parseInt(request.getParameter("num1"));
            int num2 = Integer.parseInt(request.getParameter("num2"));
            int result = num1 + num2;
            request.setAttribute("result", result);
        } catch (NumberFormatException e) {
            request.setAttribute("result", "Invalid input. Please enter valid numbers.");
        }
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
