package com.stones.connect.Interface;


import java.sql.Connection;
import java.sql.SQLException;

public interface IMuSCLE {
    Connection getConnection() throws SQLException, ClassNotFoundException;

}
