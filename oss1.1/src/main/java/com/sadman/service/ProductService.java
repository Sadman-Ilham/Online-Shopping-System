package com.sadman.service;

import com.sadman.database.DataRetrieve;
import com.sadman.database.DatabaseConnection;
import com.sadman.dto.CategoryDto;
import com.sadman.dto.ProductDto;
import com.sadman.dto.StoreDto;
import com.sadman.dto.SubCategoryDto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sadman on 7/24/2015.
 */
public class ProductService {

    private DatabaseConnection databaseConnection;
    private DataRetrieve dataRetrieve;
    private ResultSet resultSet;
    private List<ProductDto> productList;
    private String query;

    public ProductService() throws SQLException {
        databaseConnection = DatabaseConnection.createConnection();
        dataRetrieve = new DataRetrieve(databaseConnection);
    }

    public ProductDto getProductById(int pid) throws SQLException {
        query = "select * from product where product_id = " + pid;
        resultSet = dataRetrieve.getResultset(query);

        if(resultSet != null) {
            return fillTheObject();
        }else {
            return null;
        }
    }

    public List<ProductDto> getProductByStore(int sid) throws SQLException {
        query = "select * from product order by product_uploadDateTime desc where product_storeId = " + sid;
        resultSet = dataRetrieve.getResultset(query);

        if(resultSet != null) {
            return fillTheList();
        }else {
            return null;
        }
    }

    public List<ProductDto> getProductByRatings() throws SQLException {
        query = "select * from product order by product_ratings desc limit 6";
        resultSet = dataRetrieve.getResultset(query);

        if (resultSet != null) {
            return fillTheList();
        }else {
            return null;
        }
    }

    public List<ProductDto> getProductBySale() throws SQLException {
        query = "select * from product order by product_sale desc limit 6";
        resultSet = dataRetrieve.getResultset(query);

        if (resultSet != null) {
            return fillTheList();
        }else{
            return null;
        }
    }

    public List<ProductDto> getProductByView() throws SQLException {
        query = "select * from product order by product_view desc limit 6";
        resultSet = dataRetrieve.getResultset(query);

        if (resultSet != null) {
            return fillTheList();
        }else{
            return null;
        }
    }

    public List<ProductDto> getProductByCategory(String type) throws SQLException {
        CategoryService categoryService = new CategoryService();
        CategoryDto categoryDto = categoryService.getCategoryByName(type);

        if (categoryDto != null) {
            query = "select * from product order by product_uploadDateTime desc where product_categoryId = " + categoryDto.getId();
            resultSet = dataRetrieve.getResultset(query);
        }else {
            SubCategoryService subCategoryService = new SubCategoryService();
            SubCategoryDto subCategoryDto = subCategoryService.getSubCategoryByName(type);

            query = "select * from product order by product_uploadDate desc where product_subCategoryId = " + subCategoryDto.getId();
            resultSet = dataRetrieve.getResultset(query);
        }

        if (resultSet != null) {
            return fillTheList();
        }else {
            return null;
        }
    }

    private ProductDto fillTheObject() throws SQLException {
        ProductDto product = new ProductDto();

        while (resultSet.next()) {
            product.setId(resultSet.getInt("product_id"));
            product.setCategoryId(resultSet.getInt("product_categoryId"));
            product.setSubCategoryId(resultSet.getInt("product_subCategoryId"));
            product.setStoreId(resultSet.getInt("product_storeId"));
            product.setName(resultSet.getString("product_name"));
            product.setDescription(resultSet.getString("product_description"));
            product.setPrice(resultSet.getDouble("product_price"));
            product.setImageUrl(resultSet.getString("product_imageUrl"));
            product.setAvailable(resultSet.getInt("product_available"));
            product.setUploadDateTime(resultSet.getString("product_uploadDateTime"));
            product.setRatings(resultSet.getInt("product_ratings"));
            product.setView(resultSet.getInt("product_view"));
            product.setSale(resultSet.getDouble("product_sale"));
            product.setReview(resultSet.getInt("product_review"));
            product.setCartTimeLimit(resultSet.getInt("product_cartTimeLimit"));
            product.setFraud(resultSet.getInt("product_fraud"));

            StoreDto store_details = getStore(product.getStoreId());
            product.setStoreName(store_details.getName());
            product.setStoreRatings(store_details.getRatings());
        }

        return product;
    }

    private List<ProductDto> fillTheList() throws SQLException{
        productList = new ArrayList<ProductDto>();

        while(resultSet.next()){
            ProductDto product = new ProductDto();

            product.setId(resultSet.getInt("product_id"));
            product.setCategoryId(resultSet.getInt("product_categoryId"));
            product.setSubCategoryId(resultSet.getInt("product_subCategoryId"));
            product.setStoreId(resultSet.getInt("product_storeId"));
            product.setName(resultSet.getString("product_name"));
            product.setDescription(resultSet.getString("product_description"));
            product.setPrice(resultSet.getDouble("product_price"));
            product.setImageUrl(resultSet.getString("product_imageUrl"));
            product.setAvailable(resultSet.getInt("product_available"));
            product.setUploadDateTime(resultSet.getString("product_uploadDateTime"));
            product.setRatings(resultSet.getInt("product_ratings"));
            product.setView(resultSet.getInt("product_view"));
            product.setSale(resultSet.getDouble("product_sale"));
            product.setReview(resultSet.getInt("product_review"));
            product.setCartTimeLimit(resultSet.getInt("product_cartTimeLimit"));
            product.setFraud(resultSet.getInt("product_fraud"));

            productList.add(product);
        }

        for (ProductDto singleProduct : productList) {
            StoreDto store_details = getStore(singleProduct.getStoreId());
            singleProduct.setStoreName(store_details.getName());
            singleProduct.setStoreRatings(store_details.getRatings());
        }

        return productList;
    }

    private StoreDto getStore(int id) throws SQLException {
        StoreService storeService = new StoreService();
        return storeService.getStoreById(id);
    }

}
