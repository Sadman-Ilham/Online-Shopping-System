package com.sadman.service;

import com.sadman.database.DataRetrieve;
import com.sadman.database.DatabaseConnection;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Sadman on 7/27/2015.
 */
public class CustomerService {

    private DatabaseConnection databaseConnection;
    private DataRetrieve dataRetrieve;
    private ResultSet resultSet;
    private String query;

    public CustomerService() throws SQLException {
        databaseConnection = DatabaseConnection.createConnection();
        dataRetrieve = new DataRetrieve(databaseConnection);
    }

    public CustomerDetailsDto getCustomerById(int id) throws SQLException {
        query = "select * from customerDetails where customerDetails_customerId = " + id;
        resultSet = dataRetrieve.getResultset(query);

        if(resultSet != null) {
            return fillTheObject();
        }else {
            return null;
        }
    }

    private CustomerDetailsDto fillTheObject() throws SQLException {
        CustomerDetailsDto customerDetailsDto = new CustomerDetailsDro();

        while(resultSet.next()) {
            //customerDetailsDto.set ...
        }
        return customerDetailsDto;
    }

}
