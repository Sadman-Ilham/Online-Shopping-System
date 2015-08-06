package com.sadman.controller;

import com.sadman.dto.CustomerDetailsDto;
import com.sadman.dto.ProductDto;
import com.sadman.service.OrderService;
import com.sadman.service.ProductService;
import com.sadman.service.URLService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Sadman on 8/6/2015.
 */
public class OrderController extends HttpServlet {

    private int productId;
    private int quantity;
    private String customerPhone;
    private String deliveryPlace;

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            URLService urlService = new URLService();
            urlService.saveURL(request);

            CustomerDetailsDto customer = (CustomerDetailsDto) request.getSession().getAttribute("sessionUser");

            productId = Integer.parseInt(request.getParameter("pid"));
            quantity = Integer.parseInt(request.getParameter("qn"));
            customerPhone = request.getParameter("cp");
            deliveryPlace = request.getParameter("dp");

            ProductService productService = new ProductService();
            ProductDto product = productService.getProductById(productId);

            OrderService orderService = new OrderService();
            orderService.placeOrder(customer.getCustomerId(), product.getId(), quantity, (product.getPrice() - ((product.getSale()*product.getPrice())/100)), deliveryPlace, customerPhone);

            response.sendRedirect("/oss/cart");
        }catch (Exception e) {
            System.out.println(e);
        }
    }

}
