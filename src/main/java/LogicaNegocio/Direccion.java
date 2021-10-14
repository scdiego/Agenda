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
public class Direccion {
    private Integer id;
    private String calle;
    private String nro;
    private String provincia;
    private String localidad;

    public Direccion() {
    }

    public Direccion(Integer id, String calle, String nro, String provincia, String localidad) {
        this.id = id;
        this.calle = calle;
        this.nro = nro;
        this.provincia = provincia;
        this.localidad = localidad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
  
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    
    public boolean miCiudad(String unaCiudad){
        return this.localidad.equals(unaCiudad);
    }
    
    @Override
    public String toString() {
        return this.calle + ' ' +  this.nro + '/' + this.provincia + '-' + this.localidad;
    }
       
            
    
}
