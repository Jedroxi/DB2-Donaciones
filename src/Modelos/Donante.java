/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.Date;

/**
 *
 * @author crixa
 */
public class Donante {
    public int id;
    public String nombre,apellido,email;
    public Date fechaNacimiento;
    public String dni;
    
    public Donante(int id,String dni, String nombre){
        this.id = id;
        this.dni= dni;
        this.nombre = nombre;
    }
}
