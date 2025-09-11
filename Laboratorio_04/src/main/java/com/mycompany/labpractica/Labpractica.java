/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.labpractica;

/**
 *
 * @author O12339
 */
public class Labpractica {

    public static void main(String[] args) {
        //Sin Facade
        PortafolioSystem s1 = new PortafolioSystem(); 
        TaxSystem s2 = new TaxSystem(); 
        ReportSystem s3 = new ReportSystem(); 
        
        //s1.getFinancialData();
        //s2.calculateTaxes(); 
        //s3.generateReport();
        
        //Con facade 
        Facade test = new Facade(); 
        test.runCommands(); 
        
        
    }
}
