/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;


import java.sql.*;
import javax.swing.*;

/**
 *
 * @author DaviD
 */
public class conectar {
    Connection conexion1=null;

    public Connection conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
//            conexion1= DriverManager.getConnection("jdbc:mysql://localhost/restaurante","david","david");
//            conexion1= DriverManager.getConnection("jdbc:mysql://127.0.0.1/restaurante","root","root");
        
//            conexion1= DriverManager.getConnection("jdbc:mysql://192.168.56.1:914/Restaurante","root","root");
            conexion1= DriverManager.getConnection("jdbc:mysql://192.168.56.1:3306/restaurante","david","david");
//            JOptionPane.showMessageDialog(null, "Conexion Exitosa!!! Bebida,BebidaPedida,Cargo,Cliente,DetalleFactura,empleado,factura,mesa,nombrePlato, pedido, plato,platoPedido,Reservar,TipoPlato");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,"Error "+e);
        }
        return conexion1;
    }
    
   
    
}
