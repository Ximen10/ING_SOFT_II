/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labpractica;

/**
 *
 * @author O12339
 */
public class Facade {
    private PortafolioSystem s1; 
    private TaxSystem s2; 
    private ReportSystem s3; 

    public Facade() {
        this.s1 = new PortafolioSystem();
        this.s2 = new TaxSystem();
        this.s3 = new ReportSystem();
    }
    
    public void runCommands(){
        s1.getFinancialData();
        s2.calculateTaxes();
        s3.generateReport();
        
        
    }
    
    
    
}
