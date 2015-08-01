package com.sadman.service;

import com.sadman.database.DataRetrieve;
import com.sadman.database.DatabaseConnection;
import com.sadman.dto.CategoryDto;
import com.sadman.dto.SubCategoryDto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sadman on 7/27/2015.
 */
public class SubCategoryService {

    private DatabaseConnection databaseConnection;
    private DataRetrieve dataRetrieve;
    private ResultSet resultSet;
    private List<SubCategoryDto> subCategoryList;
    private String query;

    public SubCategoryService() throws SQLException {
        databaseConnection = DatabaseConnection.createConnection();
        dataRetrieve = new DataRetrieve(databaseConnection);
    }

    public SubCategoryDto getSubCategoryByName(String type) throws SQLException {
        query = "select * from subcategory where subcategory_name = '" + type + "'";
        resultSet = dataRetrieve.getResultset(query);

        if(resultSet != null) {
            return fillTheObject();
        }else {
            return null;
        }
    }

    public List<SubCategoryDto> getSubCategoryByCategoryId(int id) throws SQLException {
        query = "select * from subcategory where subcategory_categoryId = " + id;
        resultSet = dataRetrieve.getResultset(query);

        if(resultSet != null) {
            return fillTheList();
        }else {
            return null;
        }
    }

    private SubCategoryDto fillTheObject() throws SQLException {
        SubCategoryDto subCategoryDto = new SubCategoryDto();
        while (resultSet.next()) {
            subCategoryDto.setId(resultSet.getInt("subcategory_id"));
            subCategoryDto.setCategoryId(resultSet.getInt("subcategory_categoryId"));
            subCategoryDto.setName(resultSet.getString("subcategory_name"));
        }
        return subCategoryDto;
    }

    private List<SubCategoryDto> fillTheList() throws SQLException {
        subCategoryList = new ArrayList<SubCategoryDto>();

        while (resultSet.next()) {
            SubCategoryDto subCategoryDto = new SubCategoryDto();

            subCategoryDto.setId(resultSet.getInt("subcategory_id"));
            subCategoryDto.setCategoryId(resultSet.getInt("subcategory_categoryId"));
            subCategoryDto.setName(resultSet.getString("subcategory_name"));

            subCategoryList.add(subCategoryDto);
        }

        return subCategoryList;
    }

}
