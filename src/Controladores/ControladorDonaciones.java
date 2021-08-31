/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author crixa
 */
public class ControladorDonaciones {
    
    
    public static int agregarDonacion(int idDonante,int idInstitucion){
            try{
                Connection connection = SQLClass.obtenerConexion();

                //Producto(String nombre,String descripcion,int cantidad,int idCategoria)
                CallableStatement cs = connection.prepareCall("{?=call agregarDonacion(?,?)}");
                //SALIDA
                cs.registerOutParameter(1, OracleTypes.INTEGER);
                //ENTRADA
                cs.setInt(2, idDonante);
                cs.setInt(3, idInstitucion);

                cs.executeQuery();

                return cs.getInt(1);
            }catch(SQLException error){
                JOptionPane.showMessageDialog(null,"Error:"+error,"Error al Agregar Producto", JOptionPane.ERROR_MESSAGE);
                return -1;
            }
    }
    
}
