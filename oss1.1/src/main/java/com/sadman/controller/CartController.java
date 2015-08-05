package com.sadman.controller;

import com.sadman.dto.CartDto;
import com.sadman.dto.CustomerDetailsDto;
import com.sadman.dto.ProductDto;
import com.sadman.service.CartService;
import com.sadman.service.ProductService;
import com.sadman.service.URLService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sadman on 8/4/2015.
 */
public class CartController extends HttpServlet {

    private int productId;
    private List<CartDto> cartList;
    private List<ProductDto> cartProductList;

    public void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            URLService urlService = new URLService();
            urlService.saveURL(request);

            productId = Integer.parseInt(request.getParameter("pid"));

            ProductService productService = new ProductService();

            if(request.getSession().getAttribute("sessionUser") != null) {
                CustomerDetailsDto customer = (CustomerDetailsDto) request.getSession().getAttribute("sessionUser");
                CartService cartService = new CartService();
                cartService.addProductToCart(customer.getCustomerId(), productId);

                if(request.getSession().getAttribute("sessionCartProductList") != null) {
                    cartProductList = (List<ProductDto>) request.getSession().getAttribute("sessionCartProductList");

                    //adding cart product from the session to database
                    for(ProductDto product : cartProductList) {
                        cartService.addProductToCart(customer.getCustomerId(), product.getId());
                    }

                    //adding the product to session
                    cartProductList.add(productService.getProductById(productId));
                    request.getSession().setAttribute("sessionCartProductList", cartProductList);
                }

                cartList = cartService.getCartProductByCustomerId(customer.getCustomerId());

                cartProductList = productService.getCartProductDetails(cartList);

                request.setAttribute("cartProductList", cartProductList);
            }else {
                if(request.getSession().getAttribute("sessionCartProductList") != null) {
                    cartProductList = (List<ProductDto>) request.getSession().getAttribute("sessionCartProductList");
                    cartProductList.add(productService.getProductById(productId));
                }else {
                    cartProductList = new ArrayList<ProductDto>();
                    cartProductList.add(productService.getProductById(productId));
                }
                request.getSession().setAttribute("sessionCartProductList", cartProductList);
                request.setAttribute("cartProductList", cartProductList);
            }

            RequestDispatcher dispatcher = request.getRequestDispatcher("cart.jsp");
            dispatcher.forward(request, response);
        }catch (Exception e){
            System.out.println(e);
        }
    }

}
