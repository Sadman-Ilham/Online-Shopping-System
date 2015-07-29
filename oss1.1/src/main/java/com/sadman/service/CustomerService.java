package com.sadman.service;

import com.sadman.database.DataRetrieve;
import com.sadman.database.DatabaseConnection;
import com.sadman.dto.CustomerDetailsDto;

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
        query = "select * from customerdetails where customerdetails_customerId = " + id;
        resultSet = dataRetrieve.getResultset(query);

        if(resultSet != null) {
            return fillTheObject();
        }else {
            return null;
        }
    }

    private CustomerDetailsDto fillTheObject() throws SQLException {
        CustomerDetailsDto customerDetailsDto = new CustomerDetailsDto();

        while(resultSet.next()) {
            customerDetailsDto.setCustomerId(resultSet.getInt("customerdetails_customerId"));
            customerDetailsDto.setFirstName(resultSet.getString("customerdetails_firstName"));
            customerDetailsDto.setLastName(resultSet.getString("customerdetails_lastName"));
            customerDetailsDto.setGender(resultSet.getString("customerdetails_gender"));
            customerDetailsDto.setBirthDate(resultSet.getString("customerdetails_birthDate"));
            customerDetailsDto.setPhone(resultSet.getString("customerdetails_phone"));
            customerDetailsDto.setAddress(resultSet.getString("customerdetails_address"));
            customerDetailsDto.setRegistrationDate(resultSet.getString("customerdetails_registrationDate"));
        }

        return customerDetailsDto;
    }

}
