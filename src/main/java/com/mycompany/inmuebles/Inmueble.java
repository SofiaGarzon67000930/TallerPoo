/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inmuebles;

import java.util.Date;

/**
 *
 * @author Araceli
 */
public abstract class Inmueble implements TipoDeEdificio{
    private Date fechaDeRegistro;
     
    public String estado(){
        return "si";
        
    }
     
   public String contrato(){
        return "si";
        
    }   
}
