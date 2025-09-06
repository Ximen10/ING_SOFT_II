/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_03.solucion;

/**
 *
 * @author Ximena Lopez
 */
public enum NetworkConfig{
   INSTANCE;

    private String host = "network.server.com";
    private int port = 8080;

    public String getHost() {
        return host;
    }
    
    public int getPort() {
        return port;
    }
}
