/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.finca;

/**
 *
 * @author Araceli
 */
interface Maquinaria {
   public String semilla;
   public int diasAntesSiembra;
   
   public void siembra(String semilla);
   public void fumigacion(int dias);
}
