/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom10_qlx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author admin
 */
public class Connect {

    public static Connection con;
    private static String servername = "localhost";
    private static String port = "3306";
    private static String databasename = "quanlyxe";

    public static Connection getConnection() throws ClassNotFoundException {
        try {
            //String URL = "jdbc:mysql://" + "localhost" + ":3306/" + "quanlyxe";
            String URL = "jdbc:mysql://" + servername + ":" + port + "/" + databasename;
            String usename = "root";
            String password = "";
            //Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(URL, usename, password);
            System.out.println("Kết Nối Thành Công");
        } catch (SQLException e) {
            System.out.println("Kết Nối Không Thành Công");
        }
        return con;
    }

}
