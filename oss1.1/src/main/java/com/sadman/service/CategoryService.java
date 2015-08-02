package com.sadman.service;

import com.sadman.database.DataRetrieve;
import com.sadman.database.DatabaseConnection;
import com.sadman.dto.CategoryDto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sadman on 7/27/2015.
 */
public class CategoryService {

    private DatabaseConnection databaseConnection;
    private DataRetrieve dataRetrieve;
    private ResultSet resultSet;
    private List<CategoryDto> categoryList;
    private String query;

    public CategoryService() throws SQLException {
        databaseConnection = DatabaseConnection.createConnection();
        dataRetrieve = new DataRetrieve(databaseConnection);
    }

    public List<CategoryDto> getAllCategory() throws SQLException {
        query = "select * from category";
        resultSet = dataRetrieve.getResultset(query);

        if(resultSet != null) {
            return fillTheList();
        }else {
            return null;
        }
    }

    public CategoryDto getCategoryById(int id) throws SQLException {
        query = "select * from category where category_id = " + id;
        resultSet = dataRetrieve.getResultset(query);

        if(resultSet != null) {
            return fillTheObject();
        }else {
            return null;
        }
    }

    public CategoryDto getCategoryByName(String type) throws SQLException {
        query = "select * from category where category_name = '" + type + "'";
        resultSet = dataRetrieve.getResultset(query);

        if(resultSet.next()) {
            resultSet.beforeFirst();
            return fillTheObject();
        }else {
            return null;
        }
    }

    private CategoryDto fillTheObject() throws SQLException {
        CategoryDto categoryDto = new CategoryDto();
        while (resultSet.next()) {
            categoryDto.setId(resultSet.getInt("category_id"));
            categoryDto.setName(resultSet.getString("category_name"));
            break;
        }
        return categoryDto;
    }

    private List<CategoryDto> fillTheList() throws SQLException {
        categoryList = new ArrayList<CategoryDto>();

        while (resultSet.next()) {
            CategoryDto categoryDto = new CategoryDto();

            categoryDto.setId(resultSet.getInt("category_id"));
            categoryDto.setName(resultSet.getString("category_name"));

            categoryList.add(categoryDto);
        }

        return categoryList;
    }

}
