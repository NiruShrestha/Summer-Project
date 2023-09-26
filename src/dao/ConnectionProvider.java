package dao;

import java.sql.*;

public class ConnectionProvider {

    public static Connection getCon() {
        String url = "jdbc:mysql://localhost:3306/cafemgmt";
        String uname = "root";
        String pwd = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, uname, pwd);
            return con;
        } catch (Exception e) {
            return null;
        }
    }
}
