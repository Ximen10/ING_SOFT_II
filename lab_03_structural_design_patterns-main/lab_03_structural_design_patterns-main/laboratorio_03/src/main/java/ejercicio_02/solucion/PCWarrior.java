/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_02.solucion;

/**
 *
 * @author Ximena Lopez
 */
public class PCWarrior extends Character {
    public PCWarrior(){
        this.name = "Guerrero de PC"; 
        this.platform = "PC";
    }
    
    @Override
    public void attack(){
        System.out.println("Guerrero PC ataca con efectos en HD");
    }
}
