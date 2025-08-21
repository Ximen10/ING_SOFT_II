/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio_01;

/**
 *
 * @author Ximena Lopez
 */
public class Vehiculo {
    protected String marca; 
    protected String modelo; 
    protected int anio;
    protected double precio; 

    public Vehiculo(String marca, String modelo, int anio, double precio) {
            this.marca = marca;
            this.modelo = modelo;
            this.anio = anio;
            this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void mostrarInfo() {
        System.out.println("Vehiculo{" + "marca:" + marca + ", modelo: " + modelo + ", anio:" + anio + ", precio:" + precio + '}');
    }
    
    public void encender() {
        System.out.println("El vehiculo" + " " + marca + " " + "de modelo " + modelo + " " + "esta encendido.");
    }
    
}
