/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut6;

/**
 *
 * @author Alumno
 */

public class EspiralNumero {
    private int numero;
    public EspiralNumero(int numero){
        this.numero = numero;
    }
    
    public void generarEspiral(){
        int valor = 1, inicio = 0, fin = numero-1;
        int[][] matriz = new int[numero][numero];
        
        while (valor <= numero*numero) {
            for (int i = inicio; i <= fin; i++) {
                matriz[inicio][i] = valor++;
            }
            
            for (int i = inicio+1; i <= fin; i++) {
                matriz[i][fin] = valor++;
            }
            
            for (int i = fin-1; i >= inicio; i--) {
                matriz[fin][i] = valor++;
            }
            
            for (int i = fin-1; i > inicio; i--) {
                matriz[i][inicio] = valor++;
            }
            inicio++;
            fin--;
        }
        for (int[] i: matriz) {
            for (int num : i) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args){
        EspiralNumero num = new EspiralNumero(5);
        num.generarEspiral();
    }
}
