/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package analisissensorestemperatura;

import java.util.Scanner;

/**
 *
 * @author mmcc28
 */
public class AnalisisSensoresTemperatura {

    /**
     * @param args the command line arguments
     */
    
    
    /*
    1. Análisis de Sensores de Temperatura (Uso While)
Desarrolla un programa que lea repetidamente las temperaturas (en grados centígrados)
registradas por un sensor industrial. El programa debe detenerse cuando el usuario ingrese el valor
centinela −999.
• Validación: La temperatura absoluta más baja posible es el cero absoluto (−273.15 °𝐶). Si
el usuario ingresa un valor menor a este (que no sea el centinela), el programa debe
mostrar un error usando una estructura if-else y no tomarlo en cuenta para los cálculos.
• Operación: Al finalizar, el programa debe imprimir el promedio de las temperaturas válidas
ingresadas y la diferencia térmica entre la temperatura más alta y la más baja leída.
    
    
    */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);

        double tempC = 0;
        double acumTemp = 0;
        double promedio = 0;
        int tempValida = 0;
        double tempMin = 0;
        double tempMax = 0;
        double diferenciaTermica = 0;

        System.out.println("Ingrese las temperaturas medidas por el Sensor");
        tempC = sc.nextDouble();

        tempMin = tempC;
        tempMax = tempC;

        while (tempC != -999) {

            if (tempC > -273.15) {

                acumTemp += tempC;
                tempValida++;
                System.out.printf("Temperatura Validas: %d\n", tempValida);
                tempMax = Math.max(tempMax, tempC);
                tempMin = Math.min(tempMin, tempC);

            } else {
                System.out.println("Temperatura No Valida\n");
            }// fin if

            System.out.println("Ingrese las temperaturas medidas por el Sensor");
            tempC = sc.nextDouble();

        }//fin while

        promedio = acumTemp / tempValida;
        System.out.printf("Promedio de Temp: %.2f\n", promedio);

        diferenciaTermica = tempMax - tempMin;
        System.out.printf("Diferencia Termica: %.2f\n", diferenciaTermica);

    }//FIN MAIN

}// FIN CLASS


//MIRNA CHAVEZ 11741191
