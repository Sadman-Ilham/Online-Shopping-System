package com.sadman.service;

import com.sadman.database.DataRetrieve;
import com.sadman.database.DatabaseConnection;
import com.sadman.dto.CartDto;
import com.sadman.dto.ProductDto;

import javax.servlet.http.HttpServletRequest;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sadman on 8/5/2015.
 */
public class CartService {

    private DatabaseConnection databaseConnection;
    private DataRetrieve dataRetrieve;
    private ResultSet resultSet;
    private String query;
    private Statement statement;
    private List<CartDto> cartList;

    public CartService() throws SQLException {
        databaseConnection = DatabaseConnection.createConnection();
        dataRetrieve = new DataRetrieve(databaseConnection);
    }

    public List<CartDto> getCartProductByCustomerId(int customerId) throws SQLException {
        query = "select * from cart where cart_customerId = " + customerId;
        resultSet = dataRetrieve.getResultset(query);

        if(resultSet != null) {
            return fillTheList();
        }else {
            return null;
        }
    }

    public void addProductToCart(int customerId, int productId) throws SQLException {
        if(!productNotAssignedBefore(customerId, productId)) {
            query = "insert into cart (cart_customerId, cart_productId) values (" + customerId + ", " + productId + ")";
            statement = databaseConnection.getStatement();
            statement.executeUpdate(query);
        }
    }

    private boolean productNotAssignedBefore(int customerId, int productId) throws SQLException {
        query = "select * from cart where cart_customerId = " + customerId + " and cart_productId = " + productId;
        resultSet = dataRetrieve.getResultset(query);

        if(resultSet.next()) {
            return true;
        }else {
            return false;
        }
    }

    private List<CartDto> fillTheList() throws SQLException {
        cartList = new ArrayList<CartDto>();

        while(resultSet.next()){
            CartDto cart = new CartDto();

            cart.setId(resultSet.getInt("cart_id"));
            cart.setCustomerId(resultSet.getInt("cart_customerId"));
            cart.setProductId(resultSet.getInt("cart_productId"));

            cartList.add(cart);
        }

        return cartList;
    }

    public boolean addProductToCartSession(int productId, List<ProductDto> sessionCartList) {
        for(ProductDto product : sessionCartList) {
            if(product.getId() == productId) {
                return false;
            }
        }
        return true;
    }
}
