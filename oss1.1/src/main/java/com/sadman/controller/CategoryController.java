package com.sadman.controller;

import com.sadman.dto.CategoryDto;
import com.sadman.dto.ProductDto;
import com.sadman.dto.SubCategoryDto;
import com.sadman.service.CategoryService;
import com.sadman.service.ProductService;
import com.sadman.service.SubCategoryService;

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
public class CategoryController extends HttpServlet {

    private String categoryType, keyword, priceFrom, priceTo, quantityFrom, quantityTo, sortBy;
    private List<ProductDto> productList;
    private CategoryDto categoryDto;
    private List<SubCategoryDto> subCategoryList;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            categoryType = request.getParameter("type");
            keyword = request.getParameter("key");
            priceFrom = request.getParameter("priceFrom");
            priceTo = request.getParameter("priceTo");
            quantityFrom = request.getParameter("quantityFrom");
            quantityTo = request.getParameter("quantityTo");
            sortBy = request.getParameter("sortBy");


            ProductService productService = new ProductService();
            productList = productService.getProductByCategoryName(categoryType, keyword, priceFrom, priceTo, quantityFrom, quantityTo, sortBy);

            CategoryService categoryService = new CategoryService();
            categoryDto = categoryService.getCategoryByName(categoryType);

            if(categoryDto != null) {
                SubCategoryService subCategoryService = new SubCategoryService();
                subCategoryList = subCategoryService.getSubCategoryByCategoryId(categoryDto.getId());
            }else {
                subCategoryList = null;
            }

            request.setAttribute("productList", productList);
            request.setAttribute("subCategoryList", subCategoryList);
            System.out.println("passed");
            RequestDispatcher dispatcher = request.getRequestDispatcher("category.jsp");
            dispatcher.forward(request, response);
        }catch (Exception e){
            System.out.println(e);
        }
    }

}
