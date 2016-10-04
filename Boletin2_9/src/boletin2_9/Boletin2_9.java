/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_9;

import javax.swing.JOptionPane;

/**
 *
 * @author klemavilanova
 */
public class Boletin2_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here       
        int b100 = Integer.parseInt(JOptionPane.showInputDialog("Billetes de 100"));
        int b20 = Integer.parseInt(JOptionPane.showInputDialog("Billetes de 20"));
        int b5 = Integer.parseInt(JOptionPane.showInputDialog("Billetes de 5"));
        int b1 = Integer.parseInt(JOptionPane.showInputDialog("Monedas de 1"));     
        int total = b100 * 100 + b20 * 20 +  b5 * 5 + b1;
        System.out.println("Total " + total);
    }
    
}
