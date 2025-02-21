/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut6;

import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class MaximoValor {
    public static int maximo(String[] args){
        int numeros[] = new int[5];
        int maximo = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Numero entero"));            
        }
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }
        return maximo;
    }
    public static void main(String[] args){

    }
}
