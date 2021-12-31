/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sinemaproje;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Doğan
 */
class Kullanici_adi {
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
