/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut6;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Ejercicio11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la longitud de la combinacion");
        int longitud = sc.nextInt();
        int combSecre[] = new int[longitud]; //combinacion secreta
        int combJuga[] = new int[longitud]; //combinacion jugador
        
        generaCombinacion(combSecre);//generamos aleatoriamente la combinación secreta
        System.out.println(Arrays.toString(combSecre));
        System.out.println("Escriba una combinacion");
        
        leeTabla(combJuga);
        
        while (!Arrays.equals(combSecre, combJuga)) { //no sean iguales
            muestraPista(combSecre, combJuga); //mostramos las pistas
            System.out.println("Escriba una combinacion: ");
            leeTabla(combJuga);  //volvemos a pedir otra combinacion
        }
        System.out.println("La camara esta abierta");
    }
    
    static void generaCombinacion(int t[]){
        final int MAX = 5;
        for (int i = 0; i < t.length; i++) { //recorremos para leer
            t[i] = (int) (Math.random()*MAX + 1);
        }
    }
    
    static void leeTabla(int t[]){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < t.length; i++) {
            t[i] = sc.nextInt();
        }
    }
    
    static void muestraPista(int secre[], int jug[]){
        System.out.println("Pistas:");
        for (int i = 0; i < jug.length; i++) {
            System.out.println(jug[i]);
            if (secre[i] > jug[i]) {
                System.out.println("mayor");
            }else if (secre[i] < jug[i]){
                System.out.println("menor");
            }else{
                System.out.println("Igual");
            }
        }
    }
}
