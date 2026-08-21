/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package analisisindicemasacorporal;

import java.util.Scanner;

/**
 *
 * @author mmcc28
 */
public class AnalisisIndiceMasaCorporal {

    /**
     * @param args the command line arguments
     */
    
    
    /*
    Análisis de Índice de Masa Corporal (Validaciones lógicas y múltiples ramas)
Solicitar el nombre del paciente, su peso en kilogramos y su altura en metro.
• Primero, verifica que el peso y la altura sean valores lógicos, Si no, muestra "Datos
inválidos".
o Si son válidos, calcula el IMC: IMC = peso / (altura * altura).
• Para imprimir el diagnóstico:
o Menor a 18.5: "Bajo peso"
o Entre 18.5 y 24.9: "Normal"
o Entre 25.0 y 29.9: "Sobrepeso"
o 30.0 o más: "Obesidad"
    */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);

        String nombreCliente = "John Doe";
        double peso = 0;
        double altura = 0;
        double calculoIMC = 0;

        System.out.println("INGRESE SU NOMBRE COMPLETO");
        nombreCliente = sc.nextLine();

        System.out.println("INGRESE SU PESO EN KILOGRAMOS");
        peso = sc.nextDouble();

        System.out.println("INGRESE SU ALTURA EN METROS ");
        altura = sc.nextDouble();

        if (peso > 0 && altura > 0) {

            calculoIMC = peso / (altura * altura);

            if (calculoIMC < 18.5) {

                System.out.println("DIAGNOSTICO: BAJO PESO");

            } else if (calculoIMC < 25.0) {

                System.out.println("DIAGNOSTICO: NORMAL ");

            } else if (calculoIMC < 30) {
                System.out.println("DIAGNOSTICO: SOBREPESO");
            } else {
                System.out.println("DIAGNOSTICO: OBESIDAD");
            }

        } else {

            System.out.println("DATOS INVALIDOS");
        }

    }// FIN MAIN

}// FIN CLASS
