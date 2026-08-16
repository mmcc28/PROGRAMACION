/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemamonitoreo;

import java.util.Random;
import java.util.Scanner;



/**
 *
 *   
     * Desarrolla un programa en Java que simule la lectura de sensores de 
     * temperatura en un cuarto de servidores. El programa debe solicitar 
     * el nombre del operador encargado y cuántas lecturas de sensores se 
     * van a simular. Debe validar que la cantidad de lecturas sea mayor a 0 
     * y menor o igual a 50. Por cada lectura, el sistema generará una temperatura 
     * aleatoria en grados Celsius. El programa debe convertir cada lectura a 
     * Fahrenheit, determinar si hay una alerta de sobrecalentamiento y, al final, 
     * mostrar un resumen estadístico.
*/
    /*
        1. Comprender el Problema que se esta abordando
            a. Que datos de Entrada necesito?
            b. Transformacion / Calculos Necesarios
            c. Que resultados se presentan?

        2. Visualizacion/Diseño de la Solucion
            a. Diagrama Flujo
            b. Pseudocodigo

        3. Programacion Incremental
            a. Listando las Tareas a Cumplir
                i. Declaracion de Variables
                ii. Estructuras de Seleccion
                iii. Ciclos de Repeticion
                iv. Validaciones de Datos
            b. Validacion

        4. Prueba de Escritorio
            a. Casos
            b. Escenarios
            c. Resultados/Patrones Definidos
    
    */

public class SistemaMonitoreo {

    /**
     * Comprension Problema
     * 1. Entradas: 
     *      Nombre de Usuario
     *      Numero de Lecturas
     *      Ingreso de Temperatura (RANDOM)
     * 2. Calculos/Transformacion
     *      Formula Celsius - Farenheit
     *      Definicion de Sobrecalentamiento
     *      Validacion Lecturas (0 > lectura menor 50)
     *      Contabilizar el numero calentamiento
     *      Promediar el monitoreo
     *      -Validacion Temperatura

     * 3. Salida
     *      Resumen Estadistico
     *      Alerta de SobreCalentamiento
     * 
     * Lista de Tareas
     * 1. Capturar el Nombre del Usuario
     *        a. Definicion de Libreria/Instancia SCANNER
     *        b. Declaracion de Variable para el usuario
     * 2. Captura de Numero de Lecturas
     *        a. Declaracion de Variable para numero de lectura
     * 3. Generacion de Temperatura
     *      a. Definicion de Libreria RANDOM
     *      b. Declaracion de Variable
     *      c. Mostrar el numero Random Generando Temporalmente
     *      d. Rango de Temp 200 - 500
     *      e. Ciclo de Repeticion, WHILE
     * 
     * 4. Formula: F = (C * 9/5)+32 
     * 5. Limite de Sobrecalentamiento 350 C (662 F)
     *          Estructura de Seleccion (IF/ELSE)I
     * 6. Validacion de Lecturas (DO WHILE) -> 0 -50
     * 7. Sumar los numeros de sobrecalentamiento
     * 8. Calcular el promedio
     * 9. Mostrar el Resumen
     *      Promedio
     *      # de SobreCalentamiento
     * 10. Generar una Alerta de Sobrecalentamiento
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        //libreria
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        
        // definir variables
        String nombreUsuario = "John Doe";
        int numLectura = 0;
        double tempC = 0; // se va a generar temp en grados Celcius
        int ciclo = 0;
        double tempF=0;
        int numSobreCalentamiento = 0; 
        double promedio = 0;
        double acumTemp = 0;
             
       // paso 1: capturar nombre del usuario
        System.out.print("Nombre de Operario:");
        nombreUsuario = sc.nextLine().toUpperCase();
        System.out.printf("Validar Captura:%s\n", nombreUsuario);
        
       // paso 2: capturar numero de lecturas  
        do {
            System.out.print("Numero de Lecturas:");
            numLectura = sc.nextInt();
            //System.out.printf("Validacion Captura: %d\n", numLectura);
            if (!(numLectura > 0 && numLectura < 50)) {
                System.out.println("VALOR NO VALIDO");
                System.out.println("TIENE QUE SER ENTRE 0 y 50");
            }// fin if
        } while (!(numLectura > 0 && numLectura < 50));
       
       
        
        // paso 3: generacion de temperatura random
        
        
        
        //ciclo de repeticion 
        
        while (ciclo < numLectura) { // variable control donde va a comenzar

            tempC = rd.nextDouble(200, 500);
            tempF = (tempC*9/5)+32;
            // tempC = (Math.random ()* 500)-300 + 200, es lo mismo que rd.nextDouble(200,500)
            //System.out.printf("Validacion Random: %.2f\n", tempC);

            System.out.printf("Num Lec: %d\tTemp C: %.2f\n", ciclo+1, tempC);
            System.out.printf("Temp en Faren: %.2f\n", tempF);
            
            if (tempF > 662) {
                System.out.println("Alerta!!!.... SOBRECALENTAMIENTO");
                numSobreCalentamiento ++;
            }else{
                acumTemp += tempF;
            }// fin if

            
            ciclo++;
        }// fin de while 
        
        promedio = acumTemp/numLectura;
        System.out.println("------------------------------");
        System.out.println("             RESUMEN          ");
        System.out.println("------------------------------");
        System.out.println("");
        System.out.printf("Promedio de Temp: %.2f\n", promedio);
        System.out.printf("# SoobreCalentamiento: %d\n", numSobreCalentamiento);
        
    }//Fin Main
    
}//Fin de Class