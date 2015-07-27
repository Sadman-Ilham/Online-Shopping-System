package com.sadman.database;

import java.sql.*;

/**
 * Created by Sadman on 7/24/2015.
 */
public class DatabaseConnection {

    private Connection connection;
    private Statement statement;
    private static DatabaseConnection databaseConnection = null;

    private DatabaseConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/oss", "root", "root");
            statement = connection.createStatement();
        } catch (Exception e) {
            System.out.println("Error in Connection: " + e);
        }
    }

    public static DatabaseConnection createConnection(){
        if(databaseConnection == null) {
            databaseConnection = new DatabaseConnection();
            return databaseConnection;
        }
        else {
            return databaseConnection;
        }
    }

    public Statement getStatement(){
        return statement;
    }

}