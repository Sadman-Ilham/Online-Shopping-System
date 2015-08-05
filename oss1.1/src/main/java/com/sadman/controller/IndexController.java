package com.sadman.controller;

import com.sadman.dto.ProductDto;
import com.sadman.service.ProductService;
import com.sadman.service.URLService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Sadman on 7/24/2015.
 */
public class IndexController extends HttpServlet{

    private List<ProductDto> productsByRatings, productsBySale, productsByView;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            URLService urlService = new URLService();
            urlService.saveURL(request);

            ProductService productService = new ProductService();
            productsByRatings = productService.getProductByRatings();
            productsBySale = productService.getProductBySale();
            productsByView = productService.getProductByView();

            request.setAttribute("productsByRatings", productsByRatings);
            request.setAttribute("productsBySale", productsBySale);
            request.setAttribute("productsByView", productsByView);

            RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
            dispatcher.forward(request, response);
        }catch (Exception e){}
    }

}
