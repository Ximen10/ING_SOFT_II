/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_01.solución;

/**
 *
 * @author Ximena Lopez
 */
public abstract class Game {
    protected String name; 
    
    public abstract void start();
    
    public String getInfo(){
         return "Juego: " + name;
    }
}
