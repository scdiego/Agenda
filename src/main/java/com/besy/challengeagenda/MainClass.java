/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.besy.challengeagenda;

import LogicaNegocio.*;

/**
 *
 * @author diego
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Agenda unaAgenda = new Agenda(1,"Mi agenda de contactos");
        
        
        Direccion unaDireccion = new Direccion(1, "Calle falsa", "123", "Posadas", "Misiones");
        Telefono unTelefono = new Telefono(1, "Cel", "2541587");
        
        Persona unaPersona = new Persona("Juan", "Perez", 12548722, 1, unaDireccion, unTelefono);
        Empresa unaEmpresa = new Empresa("Empresa Falsa", "1-2543587-3", 2, unaDireccion, unTelefono);
        
        try {
            //unaAgenda.agregarContactoEmpresa(unaPersona, unaEmpresa);
            //unaAgenda.porNombre("PEPE");
            unaAgenda.agregarContacto(unaPersona);
            System.out.println(unaAgenda.cuantosContactosPersonasTengo());
            unaAgenda.agregarEmpresa(unaEmpresa);
            System.out.println("Empresa Agregada");
            System.out.println(unaAgenda.cuantosContactosEmpresaTengo());
            unaAgenda.agregarEmpresa(unaEmpresa);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
