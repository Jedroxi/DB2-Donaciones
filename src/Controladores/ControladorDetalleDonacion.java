/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author crixa
 */
public class ControladorDetalleDonacion {
    
    public static boolean agregarDetalleDonacion(int idDonacion,int idProducto){
        try{
            Connection connection = SQLClass.obtenerConexion();
            
            CallableStatement cs = null;
            
            cs = connection.prepareCall("{call agregarDetalleDonacion(?,?)}");
            cs.setInt(1,idDonacion);
            cs.setInt(2,idProducto);
            cs.execute();
            return true;
        }catch(SQLException error){
            JOptionPane.showMessageDialog(null,"Error:"+error,"Error al Agregar Detalle Donacion", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
