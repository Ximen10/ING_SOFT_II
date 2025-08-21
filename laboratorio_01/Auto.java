/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio_01;

/**
 *
 * @author Ximena Lopez
 */
public class Auto extends Vehiculo {
    private int numPuertas; 
    private String  tipoTransmision; 

    public Auto(int numPuertas, String tipoTransmision, String marca, String modelo, int anio, double precio) {
        super(marca, modelo, anio, precio);
        this.numPuertas = numPuertas;
        this.tipoTransmision = tipoTransmision;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); 
        System.out.println("Auto{" + "numero de Puertas:" + numPuertas + ", tipo de Transmision:'" + tipoTransmision + '\'' + '}');
    }
    
    // Método activarAireAcondicionado()
    public void activarAireAcondicionado() {
        System.out.println(marca + " "+ "de modelo " + modelo + " " + "tiene el aire acondicionado activado");
    }
}
