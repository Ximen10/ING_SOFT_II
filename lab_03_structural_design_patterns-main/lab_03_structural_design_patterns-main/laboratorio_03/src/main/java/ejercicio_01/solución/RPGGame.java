/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_01.solución;

/**
 *
 * @author Ximena Lopez
 */
public class RPGGame extends Game{
    public RPGGame() {
        this.name = "RPG Game";
    }
    
    @Override
    public void start(){
        System.out.println("Iniciando aventura epica...");
        System.out.println("Selecciona tu clase de personaje");
    }
    
}
