/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_4;

import javax.swing.JOptionPane;

/**
 *
 * @author klemavilanova
 */
public class Boletin2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Numero 1"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Numero 2"));
        System.out.println("Suma"+ (n1+n2));
        System.out.println("Resta"+ (n1-n2));
        System.out.println("Multiplicacion"+ (n1*n2));
        System.out.println("Division"+ (n1/n2));

                                
    }
    
}
