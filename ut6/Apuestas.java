/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut6;

/**
 *
 * @author Alumno
 */
public class Apuestas {
    public static void main(String[] args) {
        int primitiva[] = {4, 9, 7, 1, 6, 2};
        int ganadora[] = {2, 3, 1, 3, 6, 2};
        int contador = 0;
        
        for (int i = 0; i < primitiva.length; i++) {
            if (primitiva[i] == ganadora[i]) {
                contador++;
            }
        }
        System.out.println("Acertaste " + contador + " numeros");
    }
}
