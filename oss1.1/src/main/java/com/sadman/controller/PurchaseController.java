package com.sadman.controller;

import com.sadman.dto.CustomerDetailsDto;
import com.sadman.service.OrderService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Sadman on 8/6/2015.
 */
public class PurchaseController extends HttpServlet {

    private int oid;
    private String code;
    public void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            oid = Integer.parseInt(request.getParameter("oid"));
            code = request.getParameter("code");

            OrderService orderService = new OrderService();
            if(orderService.varifyPurchase(oid, code)) {
                orderService.updateOrderPlacedToOrderPurchased(oid);

            }

            response.sendRedirect("/oss/cart");
        }catch (Exception e) {}
    }

}
