/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_03.solucion;

/**
 *
 * @author Ximena Lopez
 */
public class Cliente {

    public static void main(String[] args) {
       
        // Uso de GameSession
        GameSession session = new GameSession();
        session.startSession();

        // Uso de DatabaseManager
        DatabaseManager db = new DatabaseManager();
        db.saveData();

        // Uso de NetworkManager con enum
        NetworkManager network = new NetworkManager();
        network.connect();
    }
    
}
