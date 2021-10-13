/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaNegocio;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author diego
 */
public class Empresa extends Contacto{
    private String razonSocial;
    private String cuit;
    private Map<Integer,Persona> contactosEmpresa;
    
    /* Constructores */

    public Empresa() {
    }

    public Empresa(String razonSocial, String cuit, Map<Integer, Persona> personas, Integer id, Direccion direccion, Telefono telefono) {
        super(id, direccion, telefono);
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.contactosEmpresa = personas;
    }

    public Empresa(String razonSocial, String cuit, Integer id, Direccion direccion, Telefono telefono) {
        super(id, direccion, telefono);
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.contactosEmpresa = new HashMap();
    }
    
    
    /* Setter and Getter */

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

    public Map<Integer, Persona> getcontactosEmpresa() {
        return contactosEmpresa;
    }

    public void setcontactosEmpresa(Map<Integer, Persona> personas) {
        this.contactosEmpresa = personas;
    }
    
    /* Metodos */
    
    
    
    
    public void agregarContacto(Persona unaPersona){
        //this.personas.add(unaPersona);
        this.contactosEmpresa.put(unaPersona.getDni(), unaPersona);
    }
    
    
    @Override
    public String toString(){
        return this.razonSocial;
    }

    
    
    
    
    
}
