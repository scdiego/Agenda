/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaNegocio;

import java.util.List;

/**
 *
 * @author diego
 */
public class Empresa extends Contacto{
    private String razonSocial;
    private String cuit;
    private List<Persona> personas;

    public Empresa() {
    }

    public Empresa(String razonSocial, String cuit, List<Persona> personas, Integer id, Direccion direccion, Telefono telefono) {
        super(id, direccion, telefono);
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.personas = personas;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
    
    public void agregarContacto(Persona unaPersona){
        this.personas.add(unaPersona);
    }
    
    
    @Override
    public String toString(){
        return this.razonSocial;
    }

    
    
    
    
    
}
