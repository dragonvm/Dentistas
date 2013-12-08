/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import java.util.ArrayList;

/**
 *
 * @author Danipro
 */
public class datosPacientes {
    
    String nombre, apellidos, dni, direccion, telefono;
    
    public datosPacientes(ArrayList<String> datosPaciente){
        this.nombre=datosPaciente.get(0);
        this.apellidos=datosPaciente.get(1);
        this.dni=datosPaciente.get(2);
        this.direccion=datosPaciente.get(3);
        this.telefono=datosPaciente.get(4);
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getApellidos(){
        return this.apellidos;
    }
    
    public String getDNI(){
        return this.dni;
    }
    
    public String getDireccion(){
        return this.direccion;
    }
    
    public String getTelefono(){
        return this.telefono;
    }
    
}
