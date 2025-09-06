/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_03.solucion;

/**
 *
 * @author Ximena Lopez
 */
public class GameConfig {
    private static volatile GameConfig instance; 
    private String databaseUrl;
    private boolean debugMode;
    private int maxPlayers;
    
    private GameConfig() {
        this.databaseUrl = "jdbc:mysql://localhost:3306/game_db";
        this.debugMode = false;
        this.maxPlayers = 100;
    }
    
    public static GameConfig getInstance() {
        if (instance == null) {
            synchronized (GameConfig.class) {
                if (instance == null) {
                    instance = new GameConfig();
                }
            }
        }
        return instance;
    }

    // Getters y setters
    public String getDatabaseUrl() {
        return databaseUrl;
    }
     public void setDatabaseUrl(String databaseUrl) {
        this.databaseUrl = databaseUrl;
    }

    public boolean isDebugMode() {
        return debugMode;
    }

    public void setDebugMode(boolean debugMode) {
        this.debugMode = debugMode;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }
}
