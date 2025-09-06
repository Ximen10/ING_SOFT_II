/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_02.solucion;

/**
 *
 * @author Ximena Lopez
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("===== Simulacion en PC =====");
        GameElementFactory pcFactory = new PCFactory();
        Character pcWarrior = pcFactory.createWarrior();
        Weapon pcSword = pcFactory.createWeapon();

        pcWarrior.attack();
        pcSword.use();

        System.out.println();

        System.out.println("===== Simulacion en Mobile =====");
        GameElementFactory mobileFactory = new MobileFactory();
        Character mobileWarrior = mobileFactory.createWarrior();
        Weapon mobileSword = mobileFactory.createWeapon();

        mobileWarrior.attack();
        mobileSword.use();

        System.out.println();
        System.out.println("===== Fin de la simulacion =====");
    }
}
