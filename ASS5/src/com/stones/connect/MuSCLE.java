package com.stones.connect;

import com.stones.connect.Interface.IMuSCLE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MuSCLE implements IMuSCLE {
    String query = "SELECT * FROM `stone` WHERE 1";
    @Override
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        String connectionUrl = "jdbc:mysql://localhost:3306/practice";
        try {

            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(connectionUrl, "root", "root");

        } catch (Exception e) {

            System.out.println(e);
            throw e;

        }

    }
}
