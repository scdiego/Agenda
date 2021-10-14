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
public class Telefono {
    private Integer id;
    private String tipo;
    private String nro;

    public Telefono() {
    }

    public Telefono(Integer id, String tipo, String nro) {
        this.id = id;
        this.tipo = tipo;
        this.nro = nro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }
    
    
    @Override
    public String toString(){
        return this.tipo+":"+this.nro;
    }
    
}
