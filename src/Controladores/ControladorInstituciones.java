/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import Modelos.Institucion;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author crixa
 */
public class ControladorInstituciones {
    private static LinkedList<Institucion> instituciones;

    public static boolean cargarInstituciones() {
        try {
            //Connection con = SQLClass.obtenerConexion();
            CallableStatement cs = SQLClass.obtenerConexion().prepareCall("{? = call dameInstituciones()}");
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.executeQuery();
            ResultSet resultSet = (ResultSet) cs.getObject(1);

            instituciones = new LinkedList();
            while (resultSet.next()) {
                instituciones.add(new Institucion(resultSet.getInt(1),resultSet.getString(2)));
            }
            return true;
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "Error:" + error, " Error cargar Instituciones", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public static String[] obtenerInstituciones() {
        String nombresInst[] = new String[instituciones.size()];
        int i = 0;
        for (Institucion inst : instituciones) {
            nombresInst[i] = inst.id + " -- " + inst.nombre;
            i++;
        }
        return nombresInst;
    }

    public static int dameIdInstitucion(int indice) {
        return instituciones.get(indice).id;
    }
    
    public static boolean agregarInstitucion(String nombre,String direccion){
        try{
            Connection connection = SQLClass.obtenerConexion();
            
            CallableStatement cs = null;
            
            cs = connection.prepareCall("{call agregarInstitucion(?,?)}");
            cs.setString(1,nombre);
            cs.setString(2,direccion);
            cs.execute();
            return true;
        }catch(SQLException error){
            JOptionPane.showMessageDialog(null,"Error:"+error,"Error al Agregar Institucio", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
