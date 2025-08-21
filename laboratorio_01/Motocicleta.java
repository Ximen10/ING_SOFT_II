/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio_01;

/**
 *
 * @author Ximena Lopez
 */
public class Motocicleta extends Vehiculo {
   private int cilindrada; 
   private boolean tieneSidecar; 

    public Motocicleta(int cilindrada, boolean tieneSidecar, String marca, String modelo, int anio, double precio) {
        super(marca, modelo, anio, precio);
        this.cilindrada = cilindrada;
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); 
        System.out.println(" {Cilindrada: " + cilindrada  + ", Sidecar: " + tieneSidecar + "}");
    }
   
    public void hacerCaballito() {
        System.out.println( "¡" + marca + " " + modelo + " esta haciendo caballito!");
    }
}
