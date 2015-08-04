package com.sadman.controller;

import com.sadman.dto.CategoryDto;
import com.sadman.dto.ProductDto;
import com.sadman.dto.ReviewDto;
import com.sadman.service.CategoryService;
import com.sadman.service.ProductService;
import com.sadman.service.ReviewService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Sadman on 7/27/2015.
 */
public class ItemController extends HttpServlet {

    private int pid;
    private ProductService productService;
    private ProductDto productDetails;
    private List<ProductDto> productFromThisSeller, productOfSameType;
    private List<ReviewDto> reviewList;
    private CategoryService categoryService;
    private CategoryDto categoryDto;
    private ReviewService reviewService;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            if(request.getQueryString() != null) {
                request.getSession().setAttribute("lastVisitedPage", request.getRequestURL().append('?').append(request.getQueryString()));
            }else {
                request.getSession().setAttribute("lastVisitedPage", request.getRequestURL());
            }

            pid = Integer.parseInt(request.getParameter("pid"));

            productService = new ProductService();
            productDetails = productService.getProductById(pid);

            reviewService = new ReviewService();
            reviewList = reviewService.getReviewByProductId(productDetails.getId());

            productFromThisSeller = productService.getProductByStore(productDetails.getStoreId());
            productOfSameType = productService.getProductByCategoryId(productDetails.getCategoryId());

            request.setAttribute("productDetails", productDetails);
            request.setAttribute("reviewList", reviewList);
            request.setAttribute("productFromThisSeller", productFromThisSeller);
            request.setAttribute("productOfSameType", productOfSameType);

            RequestDispatcher dispatcher = request.getRequestDispatcher("item.jsp");
            dispatcher.forward(request, response);
        }catch (Exception e) {}
    }

}
