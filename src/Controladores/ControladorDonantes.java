/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.Donante;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author crixa
 */
public class ControladorDonantes {

    private static LinkedList<Donante> donantes;

    public static boolean cargarDonantes() {
        try {
            //Connection con = SQLClass.obtenerConexion();
            CallableStatement cs = SQLClass.obtenerConexion().prepareCall("{? = call dameDonantes()}");
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.executeQuery();
            ResultSet resultSet = (ResultSet) cs.getObject(1);

            donantes = new LinkedList();
            while (resultSet.next()) {
                donantes.add(new Donante(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3)));
            }
            return true;
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "Error:" + error, " Error cargar Donantes", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public static String[] obtenerDonantes() {
        String nombresDonantes[] = new String[donantes.size()];
        int i = 0;
        for (Donante d : donantes) {
            nombresDonantes[i] = d.dni + " -- " + d.nombre;
            i++;
        }
        return nombresDonantes;
    }

    public static int dameIdDonante(int indice) {
        return donantes.get(indice).id;
    }
}
