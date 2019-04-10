/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlth.java;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thanh
 */

public class db {
    
    public static Connection java_db() throws ClassNotFoundException{
        Class.forName("org.sqlite.JDBC");
        String url = "jdbc:sqlite:C:\\Users\\Thanh\\Desktop\\QLTH-Java\\MyDB.db";
        try {
            Connection conn = DriverManager.getConnection(url);
            return conn;
        } catch (SQLException ex) {
            Logger.getLogger(db.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
