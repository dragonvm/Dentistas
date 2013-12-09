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
public class datosCitas {
    
    ArrayList citas = new ArrayList();
    String nombre, apellidos, dni, direccion, telefono;
    int numCitas=0;

    public void addCita(String dia, String hora, String paciente, String nota){
        String datosCitas[]={dia, hora, paciente, nota};
        citas.add(datosCitas);
        numCitas++;
    }
    
    public void updateCita(int i, String dia, String hora, String paciente, String nota){
        String datosCitas[]={dia, hora, paciente, nota};
        citas.set(i, datosCitas);
    }
    
    public void removeCita(int i){
        citas.remove(i);
        numCitas--;
    }
    
    public String getDia(int i){
        String [] datos = (String[]) citas.get(i);
        return datos[0];
    }
    
    public String getHora(int i){
        String [] datos = (String[]) citas.get(i);
        return datos[1];
    }
    
    public String getPaciente(int i){
        String [] datos = (String[]) citas.get(i);
        return datos[2];
    }
    
    public String getNota(int i){
        String [] datos = (String[]) citas.get(i);
        return datos[3];
    }
    
    public int getNumCitas(){
        return this.numCitas;
    }
    
}
