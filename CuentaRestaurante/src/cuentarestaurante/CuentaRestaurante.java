/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentarestaurante;

import java.util.Scanner;


/**
 *
 * objetivo
 * 1. conocer las diferentes tipos de repetecion
 * 2. analizar los componentes de todo ciclo de repeticion
 * 3. construir un algortimo con un ciclo de repeticion
 * @author mmcc28
 */
public class CuentaRestaurante {

    /**
     * Desarrollar un algoritmo que simule la cuenta de un restaurante
     * que se tiene que pagar entre grupo de amigos (7) dividido en partes iguales
     * @param args the command line arguments
     */
    
    /*
        ciclos de repetecion
        1. while
        2. Do- while
        3. For
        4. Foreach
    
        Componentes de ciclos de repeticion 
        1. Variable de control -> Valor de Inicio
        2. Condicion           -> Limite de Repeticion 
            Todo ciclo de repeticion se ejecuta y repite
            siempre y cuando la condicion se mantenga VERDADERA
        3. Modificador de la Variable Control
    
    
    */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner (System.in);
        double promedioPago = 0;
        int gastoIndividual = 0;
        
        int numPersona = 1 ;
        int gastoAcumulado = 0 ; // Acumulador
        
        // Condicion -> variable de control de Limite
        
        while (numPersona <= 7) {
            // Instrucciones a repetir 
            System.out.printf("Persona %d) cuanto consumiste? ", numPersona);
            gastoIndividual = sc.nextInt();
            
            gastoAcumulado += gastoIndividual ; // suma de los gastos
            System.out.printf("P: %d\tGasto Ind: %d\tGasto Acum: %d", numPersona,gastoIndividual,gastoAcumulado);
            System.out.println("");
            
            
            
            // modificador 
            //opcion#1
            //numPersona += 1 ; // numPersona = numPersona + 1  ; 
            //opcion#2
            numPersona++;// Incremento unitario (POST INCREMENTO)
        }//FIN DE WHILE
        
      //  promedioPago = gastoAcumulado / 7; se puede pero queda como hardcoding
        numPersona --; //POST DECREMENTO UNITARIO   
        System.out.printf("Total Personas = :%d", numPersona);
        promedioPago = gastoAcumulado / numPersona ; 
        
        System.out.printf("\nGasto Promedio x Persona: %.2f",promedioPago);

    }// fIN MAIN

    
    
}// FIN CLASS 
