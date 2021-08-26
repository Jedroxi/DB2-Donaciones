/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.base.de.datos2;

import Clases.SQLClass;
import java.util.LinkedList;

/**
 *
 * @author crixa
 */
public class ProyectoBaseDeDatos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SQLClass query = new SQLClass();
        
        /*String consulta = "set serveroutput on\n" +
"execute proveedoresparte('p2');";
        
        LinkedList<LinkedList<String>> resultado = query.query(consulta);
        
        for(int i=0;i<resultado.size();i++){
            System.out.println(resultado.get(i));
        }*/
        SQLClass.agregarDonante("Pedro","Bendezu","pedro@mail.com","12-", 0);
    }
    
}
