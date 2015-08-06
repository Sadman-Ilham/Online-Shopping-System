package com.sadman.service;

import com.sadman.database.DataRetrieve;
import com.sadman.database.DatabaseConnection;
import com.sadman.dto.OrderDto;
import com.sadman.dto.ProductDto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
* Created by Sadman on 8/5/2015.
*/
public class OrderService {

    private DatabaseConnection databaseConnection;
    private DataRetrieve dataRetrieve;
    private ResultSet resultSet;
    private List<OrderDto> orderList;
    private String query;
    private Statement statement;
    private ProductDto product;

    public OrderService() throws SQLException {
        databaseConnection = DatabaseConnection.createConnection();
        dataRetrieve = new DataRetrieve(databaseConnection);
    }

    public void placeOrder(int customerId, int productId, int quantity, double price, String deliveryPlace, String customerPhone) throws SQLException {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        query = "insert into `order` (order_customerId, order_productId, order_quantity, order_price, order_dateTime, order_status, order_deliveryPlace, order_customerPhone, order_code) values (" + customerId + ", " + productId + ", " + quantity + ", " + price + ", '" + dateFormat.format(date) + "', 1, '" + deliveryPlace + "', '" + customerPhone + "', '191919')";
        statement = databaseConnection.getStatement();
        statement.executeUpdate(query);
    }

    public List<OrderDto> getOrderPlacedProductByCustomerId(int customerId) throws SQLException {
        query = "select * from `order` where order_customerId = " + customerId + " and order_status = 1";
        resultSet = dataRetrieve.getResultset(query);

        if(resultSet != null) {
            return fillTheList();
        }else {
            return null;
        }
    }

    public List<OrderDto> getOrderPurchasedProductByCustomerId(int customerId) throws SQLException {
        query = "select * from `order` where order_customerId = " + customerId + " and order_status = 2";
        resultSet = dataRetrieve.getResultset(query);

        if(resultSet != null) {
            return fillTheList();
        }else {
            return null;
        }
    }

    public boolean varifyPurchase(int orderId, String code) throws SQLException {
        try {
            query = "select * from `order` where order_id = " + orderId;

            resultSet = dataRetrieve.getResultset(query);

            if (resultSet != null) {
                return checkCode(fillTheObject(), code);
            } else {
                return false;
            }
        }catch(Exception e){{
            System.out.println(e);
            return false;
        }}
    }

    public void updateOrderPlacedToOrderPurchased(int oid) throws SQLException {
        query = "update `order` set order_status = 2 where order_id = " + oid;
        statement = databaseConnection.getStatement();
        statement.executeUpdate(query);
    }

    private OrderDto fillTheObject() throws SQLException {
        OrderDto orderDto = new OrderDto();

        while(resultSet.next()) {
            orderDto.setId(resultSet.getInt("order_id"));
            orderDto.setCustomerId(resultSet.getInt("order_customerId"));
            orderDto.setProductId(resultSet.getInt("order_productId"));
            orderDto.setQuantity(resultSet.getInt("order_quantity"));
            orderDto.setPrice(resultSet.getDouble("order_price"));
            orderDto.setDateTime(resultSet.getString("order_dateTime"));
            orderDto.setStatus(resultSet.getInt("order_status"));
            orderDto.setDeliveryPlace(resultSet.getString("order_deliveryPlace"));
            orderDto.setCustomerPhone(resultSet.getString("order_customerPhone"));
            orderDto.setCode(resultSet.getString("order_code"));
        }

        return orderDto;
    }

    private List<OrderDto> fillTheList() throws SQLException {
        orderList = new ArrayList<OrderDto>();

        while(resultSet.next()) {
            OrderDto orderDto = new OrderDto();

            orderDto.setId(resultSet.getInt("order_id"));
            orderDto.setCustomerId(resultSet.getInt("order_customerId"));
            orderDto.setProductId(resultSet.getInt("order_productId"));
            orderDto.setQuantity(resultSet.getInt("order_quantity"));
            orderDto.setPrice(resultSet.getDouble("order_price"));
            orderDto.setDateTime(resultSet.getString("order_dateTime"));
            orderDto.setStatus(resultSet.getInt("order_status"));
            orderDto.setDeliveryPlace(resultSet.getString("order_deliveryPlace"));
            orderDto.setCustomerPhone(resultSet.getString("order_customerPhone"));
            orderDto.setCode(resultSet.getString("order_code"));

            orderList.add(orderDto);
        }

        ProductService productService = new ProductService();

        for(OrderDto order : orderList) {
            product = productService.getProductById(order.getProductId());
            order.setProductName(product.getName());
            order.setProductRatings(product.getRatings());
            order.setProductReview(product.getReview());
            order.setProductOrder(product.getOrder());
            order.setStoreName(product.getStoreName());
            order.setStoreRatings(product.getStoreRatings());
            order.setImageUrl(product.getImageUrl());
        }

        return orderList;
    }

    private boolean checkCode(OrderDto order, String code) {
        try{
            if(order.getCode().equals(code)) {
                return true;
            }else {
                return false;
            }
        }catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}
