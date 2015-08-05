//package com.sadman.service;
//
//import com.sadman.database.DataRetrieve;
//import com.sadman.database.DatabaseConnection;
//import com.sadman.dto.OrderDto;
//import com.sadman.dto.ProductDto;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
///**
// * Created by Sadman on 8/5/2015.
// */
//public class OrderService {
//
//    private DatabaseConnection databaseConnection;
//    private DataRetrieve dataRetrieve;
//    private ResultSet resultSet;
//    private List<OrderDto> orderList;
//    private String query;
//    private Statement statement;
//    private ProductDto product;
//
//    public OrderService() throws SQLException {
//        databaseConnection = DatabaseConnection.createConnection();
//        dataRetrieve = new DataRetrieve(databaseConnection);
//    }
//
//    public void addProductToCart(int customerId, int productId, int quantity, double price) throws SQLException {
//        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//        Date date = new Date();
//        query = "insert into order (order_customerId, order_productId, order_quantity, order_price, order_dateTime, order_status) values (" + customerId + ", " + productId + ", " + quantity + ", " + price + ", '" + dateFormat.format(date) + "', 1)";
//        statement = databaseConnection.getStatement();
//        statement.executeUpdate(query);
//    }
//
//    public List<OrderDto> getCartProductByCustomerId(int id) throws SQLException {
//        query = "select * from order where order_customerId = " + id + " and order_status = 1";
//        resultSet = dataRetrieve.getResultset(query);
//
//        if(resultSet != null) {
//            return fillTheList();
//        }else {
//            return null;
//        }
//    }
//
//    public OrderDto makeCartObject(int productId, int quantity, double price) {
//        fillTheObject();
//    }
//
//    private OrderDto fillTheObject(int productId, int quantity, double price) {
//        OrderDto orderDto = new OrderDto();
//
//        orderDto.setId(-1);
//        orderDto.setCustomerId(-1);
//        orderDto.setProductId(productId);
//        orderDto.setQuantity(quantity);
//        orderDto.setPrice(price);
//        orderDto.setDateTime("");
//        orderDto.setStatus(1);
//        orderDto.setDeliveryPlace(resultSet.getString("order_deliveryPlace"));
//        orderDto.setCustomerPhone(resultSet.getString("order_phone"));
//    }
//
//    private List<OrderDto> fillTheList() throws SQLException {
//        orderList = new ArrayList<OrderDto>();
//
//        while(resultSet.next()) {
//            OrderDto orderDto = new OrderDto();
//
//            orderDto.setId(resultSet.getInt("order_id"));
//            orderDto.setCustomerId(resultSet.getInt("order_customerId"));
//            orderDto.setProductId(resultSet.getInt("order_productId"));
//            orderDto.setQuantity(resultSet.getInt("order_quantity"));
//            orderDto.setPrice(resultSet.getDouble("order_price"));
//            orderDto.setDateTime(resultSet.getString("order_dateTime"));
//            orderDto.setStatus(resultSet.getInt("order_status"));
//            orderDto.setDeliveryPlace(resultSet.getString("order_deliveryPlace"));
//            orderDto.setCustomerPhone(resultSet.getString("order_phone"));
//
//            orderList.add(orderDto);
//        }
//
//        ProductService productService = new ProductService();
//
//        for(OrderDto order : orderList) {
//            product = productService.getProductById(order.getProductId());
//            order.setProductName(product.getName());
//            order.setProductRatings(product.getRatings());
//            order.setProductReview(product.getReview());
//            order.setProductOrder(product.getOrder());
//            order.setStoreName(product.getStoreName());
//            order.setStoreRatings(product.getStoreRatings());
//        }
//
//        return orderList;
//    }
//
//}
