package com.sadman.service;

import com.sadman.database.DataRetrieve;
import com.sadman.database.DatabaseConnection;
import com.sadman.dto.ReviewDto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sadman on 7/27/2015.
 */
public class ReviewService {

    private DatabaseConnection databaseConnection;
    private DataRetrieve dataRetrieve;
    private ResultSet resultSet;
    private List<ReviewDto> reviewList;
    private String query;

    public ReviewService() throws SQLException {
        databaseConnection = DatabaseConnection.createConnection();
        dataRetrieve = new DataRetrieve(databaseConnection);
    }

    public List<ReviewDto> getReviewByProductId(int pid) throws SQLException {
        query = "select * from review order by review_dateTime where review_productId = " + pid;
        resultSet = dataRetrieve.getResultset(query);

        if(resultSet != null) {
            return fillTheList();
        }else {
            return null;
        }
    }

    private List<ReviewDto> fillTheList() throws SQLException {
        reviewList = new ArrayList<ReviewDto>();

        while(resultSet.next()) {
            ReviewDto reviewDto = new ReviewDto();

            reviewDto.setId(resultSet.getInt("review_id"));
            reviewDto.setProductId(resultSet.getInt("review_productId"));
            reviewDto.setCustomerId(resultSet.getInt("review_customerId"));
            reviewDto.setComment(resultSet.getString("review_comment"));
            reviewDto.setYesVote(resultSet.getInt("review_yesVote"));
            reviewDto.setNoVote(resultSet.getInt("review_noVote"));
            reviewDto.setDateTime(resultSet.getString("review_dateTime"));

            reviewList.add(reviewDto);
        }

        for(ReviewDto review : reviewList) {
            review.setCustomerName(getCustomerName(review.getCustomerId()));
        }

        return reviewList;
    }

    private String getCustomerName(int cid) throws SQLException {
        CustomerService customerService = new CustomerService();
        CustomerDetailsDto customerDetailsDto = customerService.getCustomerById(cid);
        return customerDetailsDto.getName;
    }

}
