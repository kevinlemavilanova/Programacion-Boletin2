/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_2;

import javax.swing.JOptionPane;

/**
 *
 * @author klemavilanova
 */
public class Boletin2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float lado = Float.parseFloat(JOptionPane.showInputDialog("Lado"));        
        System.out.println("el area del cuadrado "+ lado*lado);
    }
    
}
