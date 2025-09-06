/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_03.solucion;

/**
 *
 * @author Ximena Lopez
 */
public class DatabaseManager {
    
    private final GameConfig config;

    public DatabaseManager() {
        this.config = GameConfig.getInstance();
    }

    public void saveData() {
        System.out.println("Guardando en: " + config.getDatabaseUrl());
        System.out.println("Maximo jugadores permitidos: " + config.getMaxPlayers());
    }
}
