package Controladores;

import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.sql.CallableStatement;
import java.sql.Types;
/**
 *
 * @author crixa
 */
public class SQLClass {
    
    private static String urlConexion = "jdbc:oracle:thin:@localhost:1521:orcl";
    private static Connection conexion = null;
    
    public static Connection obtenerConexion(){
        return conexion;
    }
    
    public static void iniciarConexion(){
        try{
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            Connection connection = DriverManager.getConnection(
                   urlConexion ,"jedrox","contra123"
            );
            conexion =  connection;
        }catch(Exception e){
            System.out.println("SQlClass-Inicar Conexion: La excepcion lanzada es: "+e);
        }
    }
    
    public static LinkedList<LinkedList<String>> query (String from){
        try{
            Connection con = obtenerConexion();
            Statement st = con.createStatement();
            ResultSet resultSet = st.executeQuery(from);
            
            
            LinkedList<LinkedList<String>> result = new LinkedList();
            while(resultSet.next()){
                LinkedList<String> fila = new LinkedList();
                for(int i=1;i<resultSet.getMetaData().getColumnCount();i++){
                    fila.add(resultSet.getString(i));
                }
                result.add(fila);
            }
            return result;
            
        }catch(Exception e){
            System.out.println("SQLClass-query: La excepcion lanzada es: "+e);
            return null;
        }
    }
    
    public int damePeso(String parteId){
        try{
            Connection connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:orcl","jedrox","contra123"
            );
            CallableStatement cs = null;
            
            cs = connection.prepareCall("{?= call damePeso(?)}");
            cs.registerOutParameter(1, Types.INTEGER);
            cs.setString(2,"p2");
            cs.execute();
            
            int peso = cs.getInt(1);
            return peso;
            
        }catch(Exception e){
            System.out.println("SQLClass-damePeso: La excepcion lanzada es: "+e);
            return -1;
        }
    }
    
    public static String agregarDonante(String nombre,String apellido,String correo,String fechaNacimiento,int dni){
        try{
            Connection connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:orcl","jedrox","contra123"
            );
            CallableStatement cs = null;
            
            cs = connection.prepareCall("{call agregarDonante(?,?,?,?,?)}");
            cs.setString(1,nombre);
            cs.setString(2,apellido);
            cs.setString(3,correo);
            cs.setString(4,fechaNacimiento);
            cs.setInt(5, dni);
            cs.execute();
            
            return "";
        }catch(Exception e){
            return "SQLClass-agregarDonante: La excepcion lanzada es: "+e;
        }
    }
    
    
    

    
}
