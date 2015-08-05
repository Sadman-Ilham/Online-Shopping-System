package com.sadman.controller;

import com.sadman.dto.CustomerDetailsDto;
import com.sadman.service.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Sadman on 8/3/2015.
 */
public class SignupController extends HttpServlet {

    private String firstName = "";
    private String lastName = "";
    private String email = "";
    private String password = "";
    private String gender = "";
    private String dob = "";
    private String phone = "";
    private String address = "";

    public void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            firstName = request.getParameter("firstName");
            lastName = request.getParameter("lastName");
            email = request.getParameter("email");
            password = request.getParameter("password");
            gender = request.getParameter("gender");
            dob = request.getParameter("birthday_day") + "/" + request.getParameter("birthday_month") + "/" + request.getParameter("birthday_year");
            phone = request.getParameter("phone");
            address = request.getParameter("address");

            CustomerService customerService = new CustomerService();
            customerService.insertNewCustomer(firstName, lastName, email, password, gender, dob, phone ,address);

            response.sendRedirect("/oss");
        }catch(Exception e) {
            System.out.println(e);
        }
    }

}
