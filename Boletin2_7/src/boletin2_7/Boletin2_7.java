/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_7;

import javax.swing.JOptionPane;

/**
 *
 * @author klemavilanova
 */
public class Boletin2_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her  
        double n = Double.parseDouble(JOptionPane.showInputDialog("Nominal"));
        double t = Double.parseDouble(JOptionPane.showInputDialog("numero de anos"));
        double i = Double.parseDouble(JOptionPane.showInputDialog("interes Anual"));
        double total = n * Math.pow((1+i), t) * i / (Math.pow(1+i, t)-1);
        System.out.println(total);
    }
    
}
