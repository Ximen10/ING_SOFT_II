/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.laboratorio_01;

/**
 *
 * @author Ximena Lopez
 */
public class Laboratorio_01 {

    public static void main(String[] args) {
       
        Vehiculo v1 = new Vehiculo("Toyota", "Corolla", 2022, 20000);
        v1.encender();
        v1.mostrarInfo();
        System.out.println();


        Auto a1 = new Auto(4, "Alta", "Mazda", "CX-5", 35000, 238.9);
        a1.encender();
        a1.mostrarInfo();
        a1.activarAireAcondicionado(); 
        System.out.println();

        
        Motocicleta m1 = new Motocicleta(450, false , "Yahama" , "A1", 2024, 300);
        m1.mostrarInfo();
        m1.encender();
        m1.hacerCaballito();
        System.out.println();
        

        Tesla t1 = new Tesla(true,34.4 , 23.4, "Tesla", "T1", 2020,2348.3 );
        t1.encender();           
        t1.mostrarInfo();        
        t1.activarAutopilot();  
       
    }
    
    
}
