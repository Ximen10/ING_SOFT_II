/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio_01;

/**
 *
 * @author Ximena Lopez
 */
public class Tesla extends VehiculoElectrico {
    private boolean autopilot; 

    public Tesla(boolean autopilot, double capacidadBateria, double autonomia, String marca, String modelo, int anio, double precio) {
        super(capacidadBateria, autonomia, marca, modelo, anio, precio);
        this.autopilot = autopilot;
    }
     
    @Override
    public void cargarBateria() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void modoEcoActivar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void calcularEficiencia() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    // Método activarAutopilot()
    public void activarAutopilot() {
        if (autopilot) {
            System.out.println("Este Tesla tiene el autopilot activado. El Tesla se conduce solo");
        } else {
            System.out.println("Este Tesla no tiene Autopilot.");
        }
    }

}
