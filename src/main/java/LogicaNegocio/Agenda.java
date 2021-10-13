/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaNegocio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author diego
 */
public class Agenda {
    private Integer id;
    private String nombre;
    private Map<String,Persona> personas;
    private Map<String,Empresa> empresas;

    public Agenda() {
    }

    public Agenda(Integer id, String nombre, Map<String, Persona> personas, Map<String, Empresa> empresas) {
        this.id = id;
        this.nombre = nombre;
        this.personas = personas;
        this.empresas = empresas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Map<String, Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(Map<String, Persona> personas) {
        this.personas = personas;
    }

    public Map<String, Empresa> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(Map<String, Empresa> empresas) {
        this.empresas = empresas;
    }
    
    
    public boolean noExiste(Persona unaPersona){
        return !this.personas.containsKey(unaPersona.getDni());
    }
    
    /* Retorna una lista de Personas que coinciden con el nombre de parametro */
    public List<Persona> porNombre(String unNombre) throws Exception{
        List<Persona> listadePersonas = new ArrayList();        
        Iterator it = this.getPersonas().entrySet().iterator();
        Persona auxPersona = null;
        
        while(it.hasNext()){
            auxPersona = (Persona) it.next();
            if (auxPersona.nombreEsIgual(unNombre)){
                listadePersonas.add(auxPersona);
            }
        }
        
        if (listadePersonas.size() > 0 ){
            return listadePersonas;
        }else{
            throw new Exception("La agenda no contiene elementos que coinciden con la busqueda");
        }

    }
    
    /* Retorna una lista de personas que tienen domicilio en la ciudad pasada en el parameotro */
    public List<Persona> porCiudad(String unaCiudad) throws Exception{
        List<Persona> listadePersonas = new ArrayList();        
        Iterator it = this.getPersonas().entrySet().iterator();
        Persona auxPersona = null;
        
        while(it.hasNext()){
            auxPersona = (Persona) it.next();
            if (auxPersona.viveEnCiudad(unaCiudad)){
                listadePersonas.add(auxPersona);
            }
        }
        
        if (listadePersonas.size() > 0 ){
            return listadePersonas;
        }else{
            throw new Exception("La agenda no contiene elementos que coinciden con la busqueda");
        }


    }
    
    /* Retorna una lista de persoas que se llaman segun el nombre ingresado y viven en una determinada ciudad */
    public List<Persona> personasEnCiudades(String unNombre, ArrayList<String> unasciudades) throws Exception{
        List<Persona> listadePersonas = this.porNombre(unNombre);        
        Iterator it = this.getPersonas().entrySet().iterator();
        Persona auxPersona = null;

        while(it.hasNext()){
            auxPersona = (Persona) it.next();
            if (auxPersona.vivoEnAlgunaCiudad(unasciudades)){
                listadePersonas.add(auxPersona);
            }
        }
        if (listadePersonas.size() > 0 ){
            return listadePersonas;
        }else{
            throw new Exception("La agenda no contiene elementos que coinciden con la busqueda");
        }
    }
    
    
    /* Se agrega un contacto a una empresa */
    public void agregarContactoEmpresa(Persona unaPersona, Empresa unaEmpresa) throws Exception{
        if(this.noExiste(unaPersona)){
            unaEmpresa.agregarContacto(unaPersona);
        }else{
            throw new Exception("La persona que intenta agregar no esta cargada previamente en la agenda");
        }
    }
    
    
    
}
