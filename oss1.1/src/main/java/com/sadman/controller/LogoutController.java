package com.sadman.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Sadman on 8/4/2015.
 */
public class LogoutController extends HttpServlet {

    public void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getSession().removeAttribute("customerDetailsDto");

        if(request.getSession().getAttribute("lastVisitedPage") != null) {
            response.sendRedirect(request.getSession().getAttribute("lastVisitedPage").toString());
        }else {
            response.sendRedirect("/oss");
        }
    }

}
