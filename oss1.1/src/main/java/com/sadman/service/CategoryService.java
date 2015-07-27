package com.sadman.service;

import com.sadman.database.DataRetrieve;
import com.sadman.database.DatabaseConnection;
import com.sadman.dto.CategoryDto;
import com.sadman.dto.ProductDto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by BS15 on 7/27/2015.
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

    public CategoryDto getCategoryByName(String type) throws SQLException {
        query = "select * from category where category_name = " + type;
        resultSet = dataRetrieve.getResultset(query);

        if(resultSet != null) {
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
        }
        return categoryDto;
    }

}
