/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author crixa
 */
public class Producto {
    private int id,cant,idCategoria;
    private String nombre,descripcion;
    
    public Producto(String nombre,String descripcion,int cantidad,int idCategoria){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cant = cantidad;
        this.idCategoria = idCategoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getCant() {
        return cant;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    
}
