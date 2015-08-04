package com.sadman.service;

import com.sadman.database.DataRetrieve;
import com.sadman.database.DatabaseConnection;
import com.sadman.dto.CustomerDetailsDto;
import com.sadman.dto.CustomerDto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Sadman on 7/27/2015.
 */
public class CustomerService {

    private DatabaseConnection databaseConnection;
    private DataRetrieve dataRetrieve;
    private ResultSet resultSet;
    private String query;
    private Statement statement;

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

    public void insertNewCustomer(String firstName, String lastName, String email, String password, String gender, String dob, String phone, String address) throws SQLException {
        query = "insert into customer (customer_email, customer_password) values ('" + email + "', '" + password + "')";
        statement = databaseConnection.getStatement();
        statement.executeUpdate(query);

        CustomerDto customerDto = getRecentCustomer(email, password);
        insertNewCustomerDetails(customerDto.getId(), firstName, lastName, gender, dob, phone, address);
    }

    private void insertNewCustomerDetails(int id, String firstName, String lastName, String gender, String dob, String phone, String address) throws SQLException {
        DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        Date date = new Date();

        query = "insert into customerdetails (customerdetails_customerId, customerdetails_firstName, customerdetails_lastName, customerdetails_gender, customerdetails_birthDate, customerdetails_phone, customerdetails_address, customerdetails_registrationDate) values (" + id + ", '" + firstName + "', '" + lastName + "', '" + gender + "', '" + dob + "', '" + phone + "', '" + address + "', '" + dateFormat.format(date).toString() + "')";
        statement = databaseConnection.getStatement();
        statement.executeUpdate(query);
    }

    private CustomerDto getRecentCustomer(String email, String password) throws SQLException {
        query = "select * from customer where customer_email = '" + email + "' and customer_password = '" + password + "'";
        resultSet = dataRetrieve.getResultset(query);

        CustomerDto customerDto = new CustomerDto();
        while(resultSet.next()) {
            customerDto.setId(resultSet.getInt("customer_id"));
            customerDto.setEmail(resultSet.getString("customer_email"));
            customerDto.setPassword(resultSet.getString("customer_password"));
        }

        return customerDto;
    }

    public CustomerDto varifyCustomer(String email, String password) throws SQLException {
        query = "select * from customer where customer_email = '" + email + "' and customer_password = '" + password + "'";
        resultSet = dataRetrieve.getResultset(query);

        CustomerDto customerDto = new CustomerDto();
        while(resultSet.next()){
            customerDto.setId(resultSet.getInt("customer_id"));
            customerDto.setEmail(resultSet.getString("customer_email"));
            customerDto.setPassword(resultSet.getString("customer_password"));
        }
        if(customerDto != null) {
            return customerDto;
        }else {
            return null;
        }
    }
}
