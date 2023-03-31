
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

 package com.mycompany.conexion;

 /**
  *
  * @author noelia
  */
 import java.sql.Connection;
 import java.sql.DriverManager;
 import java.sql.PreparedStatement;
 import java.sql.ResultSet;
 import java.sql.SQLException;
 import java.sql.Statement;
 import javax.swing.JOptionPane;
 
 /**
  *
  * @author noelia
  */
 public class Conexion {
     Connection conectar = null;
     String usuario="noelia";
     String contrasenia="123noelia123";
     String bd="postgres";
     String ip ="Localhost";
     String puerto ="5432 ";
     public PreparedStatement pst;
 
     String cadena="jdbc:postgresql://"+ip+"/"+bd;//":"+puerto+
     public Connection getConexion()
         {
            return conectar;
         }
     public Connection establecerConexion(){
         try {
             Class.forName("org.postgresql.Driver");
             conectar=DriverManager.getConnection(cadena,usuario,contrasenia);
             JOptionPane.showMessageDialog(null, "Se conecto a la base de datos correcatamente");
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Error: "+e.toString());
             System.out.println("Error: "+e.toString());
         }
        
         return conectar;
     }
     public ResultSet consultarBD(String query) throws SQLException, Exception{
         try {
             pst=conectar.prepareStatement(query);
             return pst.executeQuery();
             
         } catch (Exception e) {
             throw new Exception("Error al consultar la Bd");
         }
     }
     public boolean getEstado() throws SQLException{
         return conectar.isClosed();
     }
     
     
 }
 
 