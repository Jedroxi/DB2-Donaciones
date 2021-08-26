package Clases;

import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.sql.CallableStatement;
import java.sql.Types;
import java.util.Date;

/**
 *
 * @author crixa
 */
public class SQLClass {
    
    public SQLClass(){
        
    }
    
    private Statement conn(){
        try{
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            System.out.println("Conectando a la base de datos...");
            Connection connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:orcl","jedrox","contra123"
            );
            Statement statement = connection.createStatement();
            return statement;
        }catch(Exception e){
            System.out.println("SQlClass-conn: La excepcion lanzada es: "+e);
            return null;
        }
    }
    
    public LinkedList<LinkedList<String>> query (String from){
        try{
            Statement st = conn();
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
    
    
    public static String agregarInstitucion(String nombre,String direccion){
        try{
            Connection connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:orcl","jedrox","contra123"
            );
            
            CallableStatement cs = null;
            
            cs = connection.prepareCall("{call agregarInstitucion(?,?,?,?,?)}");
            cs.setString(1,nombre);
            cs.setString(2,direccion);
            cs.execute();
            
            return "";
        }catch(Exception e){
            return "SQLClass-agregarInstitucion: La excepcion lanzada es: "+e;
        }
    }
}
