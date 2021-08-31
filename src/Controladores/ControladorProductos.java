/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.Producto;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author crixa
 */
public class ControladorProductos {
    public static boolean agregarProducto(Producto p){
        try{
            Connection connection = SQLClass.obtenerConexion();
            
            //Producto(String nombre,String descripcion,int cantidad,int idCategoria)
            CallableStatement cs = connection.prepareCall("{?=call agregarProducto(?,?,?,?)}");
            //SALIDA
            cs.registerOutParameter(1, OracleTypes.INTEGER);
            //ENTRADA
            cs.setString(2,p.getNombre());
            cs.setString(3,p.getDescripcion());
            cs.setInt(4,p.getCant());
            cs.setInt(5,p.getIdCategoria());
            
            cs.executeQuery();
            
            p.setId(cs.getInt(1));
            
            return true;
        }catch(SQLException error){
            JOptionPane.showMessageDialog(null,"Error:"+error,"Error al Agregar Producto", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
