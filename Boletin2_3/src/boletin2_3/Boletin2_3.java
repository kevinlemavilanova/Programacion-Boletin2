/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_3;

import javax.swing.JOptionPane;

/**
 *
 * @author klemavilanova
 */
public class Boletin2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float valorDolar = 0;        
        float cambio = 0;
        valorDolar = Float.parseFloat(JOptionPane.showInputDialog("Valor del Dolar"));
        cambio = Float.parseFloat(JOptionPane.showInputDialog("Cambio Euros"));
        System.out.println("Son "+ cambio * valorDolar + "$");
    }
    
}
