/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaNegocio;

/**
 *
 * @author diego
 */
public abstract class Contacto {
    private Integer id;
    private Direccion direccion;
    private Telefono telefono;

    public Contacto() {
    }

    public Contacto(Integer id, Direccion direccion, Telefono telefono) {
        this.id = id;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }
    
    public boolean enLaCiudad(String unaCiudad){
        return this.direccion.miCiudad(unaCiudad);
    }
    
}
