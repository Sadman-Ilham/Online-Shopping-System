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

    private String categoryType = null, keyword = null, sortBy = null;
    private double priceFrom, priceTo;
    private int quantityFrom, quantityTo;
    private List<ProductDto> productList;
    private CategoryDto categoryDto, parentCategory;
    private SubCategoryDto subCategoryDto;
    private List<SubCategoryDto> subCategoryList;
    private List<CategoryDto> categoryList;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            categoryType = request.getParameter("type");
            keyword = request.getParameter("key");

            if(request.getParameter("priceFrom") == null || request.getParameter("priceFrom").equals("")){
                priceFrom = -1;
            }else {
                priceFrom = Double.parseDouble(request.getParameter("priceFrom"));
            }

            if(request.getParameter("priceTo") == null || request.getParameter("priceTo").equals("")){
                priceTo = -1;
            }else {
                priceTo = Double.parseDouble(request.getParameter("priceTo"));
            }

            if(request.getParameter("quantityFrom") == null || request.getParameter("quantityFrom").equals("")) {
                quantityFrom = -1;
            }else {
                quantityFrom = Integer.parseInt(request.getParameter("quantityFrom"));
            }

            if(request.getParameter("quantityTo") == null || request.getParameter("quantityTo").equals("")) {
                quantityTo = -1;
            }else {
                quantityTo = Integer.parseInt(request.getParameter("quantityTo"));
            }

            sortBy = request.getParameter("sortBy");


            ProductService productService = new ProductService();
            if( (categoryType == null) || (categoryType.equals("All")) || (categoryType.equals("")) ) {
                productList = productService.getProductByAllCategory(keyword, priceFrom, priceTo, quantityFrom, quantityTo, sortBy);

                CategoryService categoryService = new CategoryService();
                categoryList = categoryService.getAllCategory();
                parentCategory = null;
                subCategoryList = null;
            }else {
                productList = productService.getProductByCategoryName(categoryType, keyword, priceFrom, priceTo, quantityFrom, quantityTo, sortBy);

                CategoryService categoryService = new CategoryService();
                categoryDto = categoryService.getCategoryByName(categoryType);

                SubCategoryService subCategoryService = new SubCategoryService();
                if(categoryDto != null) {
                    parentCategory = null;
                    subCategoryList = subCategoryService.getSubCategoryByCategoryId(categoryDto.getId());
                }else {
                    subCategoryDto = subCategoryService.getSubCategoryByName(categoryType);
                    parentCategory = categoryService.getCategoryById(subCategoryDto.getCategoryId());
                    subCategoryList = null;
                }
            }

            request.setAttribute("productList", productList);
            request.setAttribute("subCategoryList", subCategoryList);
            request.setAttribute("parentCategory", parentCategory);
            request.setAttribute("categoryList", categoryList);

            RequestDispatcher dispatcher = request.getRequestDispatcher("category.jsp");
            dispatcher.forward(request, response);
        }catch (Exception e){
            System.out.println(e);
        }
    }

}
