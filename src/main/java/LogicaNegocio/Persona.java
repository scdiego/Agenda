/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaNegocio;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author diego
 */
public class Persona extends Contacto{
    private String nombre;
    private String apellido;
    private String dni;

/* Constructores */
    
    public Persona() {
    }

    public Persona(String nombre, String apellido, String dni, Integer id, Direccion direccion, Telefono telefono) {
        super(id, direccion, telefono);
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
/* Getter y Setter */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
    
    
    
    public boolean esMiCiudad(String unaCiudad){
        return this.enLaCiudad(unaCiudad);  
    }
    
    
    public boolean nombreEsIgual(String unNombre){        
        return this.nombre.equals(unNombre);
    }
    
    public boolean viveEnCiudad(String unaCiudad){        
        return this.esMiCiudad(unaCiudad);
    }
    
    public boolean vivoEnAlgunaCiudad(ArrayList<String> ciudades){
        Iterator it = ciudades.iterator();
        boolean salida = false;
        String auxCiudad = null;
        while(it.hasNext() && !salida){
            auxCiudad = it.next().toString();
            if(this.viveEnCiudad(auxCiudad)){
                salida = true;
            }
        }
        return salida;
    }
    
    @Override
    public String toString(){
        return this.nombre + " " + this.apellido;
    }
}
