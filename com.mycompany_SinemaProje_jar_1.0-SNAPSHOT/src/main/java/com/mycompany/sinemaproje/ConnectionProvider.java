package com.mycompany.sinemaproje;

import java.sql.*;

class ConnectionProvider {

    public static Connection getCon() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/netbeans_verileri", "root", "Dogan.04");
            return con;

        } catch (Exception ex) {
            return null;
        }
    }
}
