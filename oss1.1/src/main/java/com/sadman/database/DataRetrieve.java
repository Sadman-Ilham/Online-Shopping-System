package com.sadman.database;

import java.sql.*;

/**
 * Created by Sadman on 7/24/2015.
 */
public class DataRetrieve {

    private Statement statement;

    public DataRetrieve(DatabaseConnection dbConnection) throws SQLException{
        statement = dbConnection.getStatement();
    }

    public ResultSet getResultset(String query) throws SQLException{
        return statement.executeQuery(query);
    }

}
