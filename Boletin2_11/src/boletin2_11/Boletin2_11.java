/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_11;

import javax.swing.JOptionPane;

/**
 *
 * @author klemavilanova
 */
public class Boletin2_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float fixo = Float.parseFloat(JOptionPane.showInputDialog("Soldo Fixo"));
        float ventas = Float.parseFloat(JOptionPane.showInputDialog("Ventas"));
        float km = Float.parseFloat(JOptionPane.showInputDialog("Quilometros"));
        float dias = Float.parseFloat(JOptionPane.showInputDialog("Dias de desorazamento por dietas"));
        double liquido= ( fixo + ventas * 0.05 + km * 2 + 30 * dias -36)* 0.82;
        System.out.println("Sueldo liquido final:  " + liquido);

    }

}
