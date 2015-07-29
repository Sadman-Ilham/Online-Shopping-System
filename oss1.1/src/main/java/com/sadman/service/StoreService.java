package com.sadman.service;

import com.sadman.database.DataRetrieve;
import com.sadman.database.DatabaseConnection;
import com.sadman.dto.StoreDetailsDto;

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

    public StoreDetailsDto getStoreById(int id) throws SQLException {
        query = "select * from storedetails where storedetails_storeId = " + id;
        resultSet = dataRetrieve.getResultset(query);

        if(resultSet != null) {
            return fillTheObject();
        }else {
            return null;
        }
    }

    public StoreDetailsDto fillTheObject() throws SQLException {
        StoreDetailsDto store = new StoreDetailsDto();

        while(resultSet.next()) {
            store.setStoreId(resultSet.getInt("storedetails_storeId"));
            store.setName(resultSet.getString("storedetails_name"));
            store.setRegistrationDateTime(resultSet.getString("storedetails_registrationDateTime"));
            store.setBannerUrl(resultSet.getString("storedetails_bannerUrl"));
            store.setRatings(resultSet.getInt("storedetails_ratings"));
        }

        return store;
    }

}
