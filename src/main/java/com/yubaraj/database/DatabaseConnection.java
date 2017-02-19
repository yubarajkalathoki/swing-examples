
package com.yubaraj.database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Yubaraj
 */
public class DatabaseConnection {
    public static Connection getConnection() {
        Connection cn = null;
        String url;
        String con;
        try {
            url = "jdbc:mysql://localhost:3306/test";
            con = "com.mysql.jdbc.Driver";
            Class.forName(con);
            cn = DriverManager.getConnection(url, "root", "");
            System.out.println("Connected !");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return cn;
    }
    public static void main(String []args){
      Connection cn=  DatabaseConnection.getConnection();
      // Now you can use this cn to do your CRUD operation.
    }

}
