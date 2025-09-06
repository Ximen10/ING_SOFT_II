/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_02.solucion;

/**
 *
 * @author Ximena Lopez
 */
public class PCSword extends Weapon{
    public PCSword(){
        this.name = "Espada de PC"; 
        this.platform = "PC"; 
    }
    
    @Override 
    public void use(){
        System.out.println("Espada PC con graficos detallados");
    }
}
