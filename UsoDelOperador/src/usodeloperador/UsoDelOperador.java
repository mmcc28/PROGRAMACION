/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usodeloperador;

import java.util.Scanner;

/**
 *
 * @author mmcc28
 */
public class UsoDelOperador {

    /**
     * @param args the command line arguments
     */
    
    /*
    6. Uso del operador módulo (Conversión de tiempo) Escriba un programa que solicite una
cantidad de tiempo expresada en minutos (por ejemplo, 135 minutos). Utilizando el operador de
división (/) y el operador de módulo (%), calcule y muestre a cuántas horas y minutos exactos
equivale esa cantidad.
    */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);

        int tiempo = 0;
        int hora=0;
        int min=0;

        System.out.println("INGRESE UNA CANTIDAD DE TIEMPO EXPRESADA EN MINUTOS");
        tiempo = sc.nextInt();

        hora = tiempo / 60 ;
        min = tiempo % 60 ;
        
        System.out.printf("%d minutos equivale a %d horas con %d minutos\n", tiempo, hora, min);
        
    }// FIN MAIN
    
}// FIN CLASS
