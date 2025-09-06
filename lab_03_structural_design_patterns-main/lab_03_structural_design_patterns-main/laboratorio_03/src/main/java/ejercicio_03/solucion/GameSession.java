/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_03.solucion;

/**
 *
 * @author Ximena Lopez
 */
public class GameSession {
    public void startSession(){
        GameConfig config = GameConfig.getInstance();   
        System.out.println("Iniciando sesión...");
        System.out.println("Maximo jugadores: " + config.getMaxPlayers());
        System.out.println("Debug mode: " + config.isDebugMode());    
    } 
}
