package com.sadman.controller;

import com.sadman.dto.CustomerDetailsDto;
import com.sadman.dto.CustomerDto;
import com.sadman.service.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Sadman on 8/4/2015.
 */
public class LoginController extends HttpServlet {

    private String email = "";
    private String password = "";
    public void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            email = request.getParameter("email");
            password = request.getParameter("password");

            CustomerService customerService =  new CustomerService();
            CustomerDto customerDto = customerService.varifyCustomer(email, password);
            if(customerDto != null) {
                CustomerDetailsDto customerDetailsDto = customerService.getCustomerById(customerDto.getId());

//                request.getSession().setAttribute("customerDetailsDto", customerDetailsDto);
                request.getSession().setAttribute("sessionUser", customerDetailsDto);
                // System.out.println(customerDetailsDto.getFirstName() + " :: Login Successful!");
            }
            if(request.getSession().getAttribute("lastVisitedPage") != null) {
                response.sendRedirect(request.getSession().getAttribute("lastVisitedPage").toString());
            }else {
                response.sendRedirect("/oss");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
