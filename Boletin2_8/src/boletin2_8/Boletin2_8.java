/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_8;

import javax.swing.JOptionPane;

/**
 *
 * @author klemavilanova
 */
public class Boletin2_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int grados = Integer.parseInt(JOptionPane.showInputDialog("Grados"));
        System.out.println(grados*1.8 + 32 +" farenheit");
        System.out.println(grados -273 +" kelvin");
    }
    
}
