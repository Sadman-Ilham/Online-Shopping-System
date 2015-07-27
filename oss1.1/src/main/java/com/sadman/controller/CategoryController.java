package com.sadman.controller;

import com.sadman.service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Sadman on 7/27/2015.
 */
public class CategoryController extends HttpServlet {

    private String categoryType;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            categoryType = request.getParameter("type");

            ProductService productService = new ProductService();
            productService.getProductByCategory(categoryType);
        }catch (Exception e){}
    }

}
