/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_10;

import javax.swing.JOptionPane;

/**
 *
 * @author klemavilanova
 */
public class Boletin2_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int cant = 0;
    int b100 = 0;
    int b20 = 0;
    int b5 = 0;
    int b1 = 0;    
    
    cant = Integer.parseInt(JOptionPane.showInputDialog("Cantidad"));
    
    if (cant >= 100){
        b100 = cant/100;
        cant = cant%100;
    }
    if (cant>=20){
        b20 = cant/20;
        cant = cant%20;
    }
    if (cant>=5){
        b5 = cant/5;
        cant = cant%5;
    }
    if (cant>=1){
        b1 = cant;
    }
    System.out.println("Billetes de 100:  " + b100);
    System.out.println("Billetes de 20:  " + b20);
    System.out.println("Billetes de 5:  " + b5);
    System.out.println("Monedas de 1:  " + b1);

    }
    
}
