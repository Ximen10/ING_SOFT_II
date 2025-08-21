/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

        
package com.mycompany.laboratorio_01;
import java.util.ArrayList; 
import java.util.List; 

/**
 *
 * @author Ximena Lopez
 */
public class GestionVehiculos {
    public static void main(String[] args) {
        // TODO code application logic here
       List<Vehiculo> vehiculos = new ArrayList<>(); 
       
       //Agregar diferentes tipos de vehiculos 
       vehiculos.add(new Auto(4, "Alta", "Mazda", "CX-5", 35000, 238.9));
       vehiculos.add(new Motocicleta(450, false , "Yahama" , "A1", 2024, 300));
       vehiculos.add(new Tesla(true,34.4 , 23.4, "Tesla", "T1", 2020,2348.3));
       
       //Polimorfismo
        System.out.println("INFORMACIÓN DEL VEHICULO");
        for(Vehiculo v: vehiculos){
            v.mostrarInfo();
            v.encender(); 
            System.out.println("Precio: $" +v.getPrecio());
            System.out.println("--------------------------");
            
        //demostrarCasting(vehiculos); 
        }
    }
    
}
