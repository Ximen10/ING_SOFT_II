/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_02.solucion;

/**
 *
 * @author Ximena Lopez
 */
public class PCFactory implements GameElementFactory{
    @Override 
    public Character createWarrior(){
        System.out.println("Se ha creado un nuevo guerrero");
        return new PCWarrior(); 
    }
    
    @Override 
    public Weapon createWeapon(){
        System.out.println("Se ha creado una nueva arma");
        return new PCSword(); 
    }
}
