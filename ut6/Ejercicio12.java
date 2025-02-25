/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut6;

import java.util.Arrays;

/**
 *
 * @author Alumno
 */
public class Ejercicio12 {
    public static void main(String[] args){
        int t[][];
        t = new int[5][5];
        
        for (int n = 0; n < 5; n++) {
            for (int m = 0; m < 5; m++) {
                t[n][m] = 10*n + m;
            }
        }
        System.out.println(Arrays.deepToString(t));
        for (int fila[] : t) { //los ':' significan un '=' en este caso le está dando los valores de fila a t
            for (int columna : fila) { //en este caso le está dando los valores de columan a fila
                System.out.print(columna + " ");
            }
            System.out.println();
        }
    }
}
