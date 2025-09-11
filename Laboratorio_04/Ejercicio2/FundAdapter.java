/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Ximena Lopez
 */
public class FundAdapter extends FunData {
    public FundAdapter(NewProviderFund newFund) {
        super(newFund.getTicker(), 
              newFund.getQuote(), 
              newFund.getChangePercent());
    }
}

