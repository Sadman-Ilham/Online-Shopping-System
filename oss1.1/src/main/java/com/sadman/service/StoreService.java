package com.sadman.service;

import com.sadman.database.DataRetrieve;
import com.sadman.database.DatabaseConnection;
import com.sadman.dto.StoreDto;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Sadman on 7/24/2015.
 */
public class StoreService {

    private DatabaseConnection databaseConnection;
    private DataRetrieve dataRetrieve;
    private ResultSet resultSet;
    private String query;

    public StoreService() throws SQLException {
        databaseConnection = DatabaseConnection.createConnection();
        dataRetrieve = new DataRetrieve(databaseConnection);
    }

    public StoreDto getStoreById(int id) throws SQLException {
        query = "select * from store_details where store_details_storeId = " + id;
        resultSet = dataRetrieve.getResultset(query);
        if(resultSet != null) {
            return fillTheObject();
        }else {
            return null;
        }
    }

    public StoreDto fillTheObject() throws SQLException {
        StoreDto store = new StoreDto();

        while(resultSet.next()) {
            store.setId(resultSet.getInt("store_details_storeId"));
            store.setName(resultSet.getString("store_details_name"));
            store.setRegistrationDateTime(resultSet.getString("store_details_registrationDateTime"));
            store.setBannerUrl(resultSet.getString("store_details_bannerUrl"));
            store.setRatings(resultSet.getInt("store_details_ratings"));
        }

        return store;
    }

}
