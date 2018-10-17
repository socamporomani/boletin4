/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_1;

/**
 *
 * @author socamporomani
 */
public class Boletin4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

 Coche coche =new Coche();
 
 System.out.println("velocidad inicial es de "+ coche.getVelocidade());
    coche.acelerar(50);
    System.out.println("Velocidade accel = "+coche.getVelocidade());
   coche.frenar(30);
       System.out.println("Velocidade frenar = "+coche.getVelocidade());
    
         

    }
    
}
