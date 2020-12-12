/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author khoa
 */
public class MyConnection {
    private static String DB_URL = "jdbc:sqlserver://localhost;"
            + "databaseName=ourDatabase;";
    private static String USER_NAME = "doanh";
    private static String PASSWORD = "doanh";
    static Connection conn = null;

    static PreparedStatement preparedStatement(String cauTruyVan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static java.sql.Connection getConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            System.out.println("connect successfully(kết nối thành công)");
            
            //System.out.println(conn);
        } catch (Exception e) {
            e.printStackTrace();// TODO: handle exception
        }
        return conn;
    }

    public static void closeConnection(java.sql.Connection c) {
        try {
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }
    }
    
}
