/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.base.de.datos2;

import Controladores.ControladorProductos;
import Controladores.SQLClass;
import Modelos.Producto;
import java.util.LinkedList;


import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.sql.CallableStatement;
import java.sql.Types;
import java.util.Date;
import java.sql.Ref;
import java.sql.SQLException;
import oracle.jdbc.OracleTypes;
/**
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
        
       /*try{
            Connection connection = SQLClass.obtenerConexion();
            
            CallableStatement cs = connection.prepareCall("{?=call ejercicio3()}");
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.executeQuery();
            ResultSet res = (ResultSet) cs.getObject(1);
            String msj = "";
            while(res.next()){
                
                //for(int i=1;i<res.getMetaData().getColumnCount();i++){
                    msj+=(res.getString(1))+" || "+res.getInt(2);
                //}
                msj+="\n";
            }
            System.out.println(msj);
        }catch(SQLException error){
            System.out.println(error);
        }*/
       //Producto(String nombre,String descripcion,int cantidad,int idCategoria)
       /*SQLClass.iniciarConexion();
       ControladorProductos.agregarProducto(new Producto("Carro","Un carro",2,2));*/
    }
    
}
