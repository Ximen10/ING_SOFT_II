/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Ximena Lopez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Fondo con los nombres del proveedor nuevo
        NewProviderFund newFund = new NewProviderFund("ABC123", 150.75, 2.5);

        // Adaptamos a FundData (que el sistema entiende)
        FunData adaptedFund = new FundAdapter(newFund);

        // El sistema funciona sin cambios
        System.out.println("Código: " + adaptedFund.getFundCode());
        System.out.println("Precio actual: " + adaptedFund.getCurrentPrice());
        System.out.println("Variación diaria: " + adaptedFund.getDailyVariation());
    }
}
    

