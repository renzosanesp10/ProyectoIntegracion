/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author HP
 */
public class ConexionDB {
    
   private static Connection con;
   private static final String bd = "restaurant";
   private static final String url = "jdbc:mysql://localhost:3306/"+bd;
   private static final String user = "luis";
   private static final String pass = "12345";
   private static final String driver = "com.mysql.jdbc.Driver";

   public Connection Conectar(){
       con = null;
       try {
            Class.forName(driver);
            con = DriverManager.getConnection(url,user,pass);
            if(con != null){
                System.out.println("Conexión establecida");
            }
       } catch (ClassNotFoundException| SQLException e) {
           System.out.println("Error en conexión"+e);
       }
       return con;

   }

    public Connection getConnection() {
        return con;
    }

    public void desconectar(){
        con=null;
        if(con==null){
            System.out.println("Conexión terminada");
        }
    }
}
