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
    
    ArrayList pacientes = new ArrayList();
    String nombre, apellidos, dni, direccion, telefono;
    int numPacientes=0;

    public void addPaciente(String nombre, String apellidos, String dni, String direccion, String telefono){
        String datosPacientes[]={nombre, apellidos, dni, direccion, telefono};
        pacientes.add(datosPacientes);
        numPacientes++;
    }
    
    public void updatePaciente(int i, String nombre, String apellidos, String dni, String direccion, String telefono){
        String datosPacientes[]={nombre, apellidos, dni, direccion, telefono};
        pacientes.set(i, datosPacientes);
    }
    
    public void removePaciente(int i){
        pacientes.remove(i);
        numPacientes--;
    }
    
    public String getNombre(int i){
        String [] datos = (String[]) pacientes.get(i);
        return datos[0];
    }
    
    public String getApellidos(int i){
        String [] datos = (String[]) pacientes.get(i);
        return datos[1];
    }
    
    public String getDNI(int i){
        String [] datos = (String[]) pacientes.get(i);
        return datos[2];
    }
    
    public String getDireccion(int i){
        String [] datos = (String[]) pacientes.get(i);
        return datos[3];
    }
    
    public String getTelefono(int i){
        String [] datos = (String[]) pacientes.get(i);
        return datos[4];
    }
    
    public int getNumPacientes(){
        return this.numPacientes;
    }
    
}
