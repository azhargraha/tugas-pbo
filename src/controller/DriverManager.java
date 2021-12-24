/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;abc

import java.sql.Connection;
import java.sql.*;

/**
 *
 * @author Lenovo
 */
public class DriverManager {
    static Connection con;

    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servicedb", "root", "");
        }catch(Exception ex){
            System.out.println(""+ex);
        }
        return con;
    }

    private static Connection getConnection(String jdbcmysqllocalhost3306servicedb, String root, String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}