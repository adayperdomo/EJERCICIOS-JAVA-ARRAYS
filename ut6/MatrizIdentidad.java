/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut6;

/**
 *
 * @author Alumno
 */
public class MatrizIdentidad {
    private int n;
    public MatrizIdentidad(int n){
        this.n = n;
    }
    
    public void generarMatriz(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==j) {
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }  
    }
    
    public static void main(String[] args){
        MatrizIdentidad matriz = new MatrizIdentidad(3);
        matriz.generarMatriz();
    }
}
