/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_6;

import javax.swing.JOptionPane;

/**
 *
 * @author klemavilanova
 */
public class Boletin2_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float tarifa = Float.parseFloat(JOptionPane.showInputDialog("tarifa"));
        float pagado = Float.parseFloat(JOptionPane.showInputDialog("pagado"));
        float porcentaxe = (tarifa-pagado)/tarifa*100;
        System.out.println(porcentaxe+"%");
    }
    
}
