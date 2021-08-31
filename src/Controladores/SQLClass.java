package Controladores;

import java.sql.DriverManager;
import java.sql.Connection;
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
    
}
