/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio_01;

/**
 *
 * @author Ximena Lopez
 */
public abstract class VehiculoElectrico extends Vehiculo {
    protected double capacidadBateria; 
    protected double autonomia; 

    public VehiculoElectrico(double capacidadBateria, double autonomia, String marca, String modelo, int anio, double precio) {
        super(marca, modelo, anio, precio);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("VehiculoElectrico{" + "capacidad - Bateria (kWh): " + capacidadBateria + ", Autonomia (km): " + autonomia + '}');
    }

    public abstract void cargarBateria(); 
    public abstract void modoEcoActivar();
    public abstract void calcularEficiencia(); 
    
}
