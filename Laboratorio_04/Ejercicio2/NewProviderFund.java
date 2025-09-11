/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Ximena Lopez
 */
public class NewProviderFund {
     private String ticker;
    private double quote;
    private double changePercent;

    public NewProviderFund(String ticker, double quote, double changePercent) {
        this.ticker = ticker;
        this.quote = quote;
        this.changePercent = changePercent;
    }

    public String getTicker() {
        return ticker;
    }

    public double getQuote() {
        return quote;
    }

    public double getChangePercent() {
        return changePercent;
    } 
}
