package Controladores;

import Modelos.Categoria;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import java.sql.CallableStatement;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author crixa
 */
public class ControladorCategorias {

    private static LinkedList<Categoria> categorias;
    
    public static boolean cargarCategorias(){
        try {
            //Connection con = SQLClass.obtenerConexion();
            CallableStatement cs = SQLClass.obtenerConexion().prepareCall("{? = call dameCategorias()}");
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.executeQuery();
            ResultSet resultSet = (ResultSet) cs.getObject(1);
            
            categorias = new LinkedList();
            while (resultSet.next()) {
                categorias.add(new Categoria(resultSet.getInt(1),resultSet.getString(2)));
            }
            return true;
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null,"Error:"+error," Error cargar Categorias", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public static String[] obtenerCategorias() {
        String nombresCategorias[] = new String[categorias.size()];
        int i=0;
        for(Categoria c : categorias){
            nombresCategorias[i]=c.nombre;
            i++;
        }
        return nombresCategorias;
    }

    public static int dameIdCategoria(int indice) {
        return categorias.get(indice).id;
    }

}
