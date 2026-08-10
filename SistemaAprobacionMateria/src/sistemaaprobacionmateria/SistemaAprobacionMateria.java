/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaaprobacionmateria;

import java.util.Scanner;

/**
 *
 * @author mmcc28
 */
public class SistemaAprobacionMateria {

    /**
     * @param args the command line arguments
     */
    /*
    1. Sistema de Aprobación de Materia
    Se tiene que escribir un programa que solicite al usuario el nombre del estudiante (tipo string) y las
    calificaciones obtenidas en dos exámenes parciales (tipo double). El programa debe calcular el
    promedio final. Si el promedio es mayor o igual a 65.0, debe mostrar un mensaje indicando que el
    estudiante está "Aprobado". De lo contrario, debe mostrar "Reprobado".
    Requisito estricto: Solo puedes usar una estructura if/else simple.
    
    */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner teclado = new Scanner(System.in);

        String nombreEstudiante = "a";
        double calificacionExamen1 = 0;
        double calificacionExamen2 = 0;
        double promedioFinal = 0;

        System.out.println("|BIENVENIDO A REGISTRO DE NOTAS DE ESTUDIANTES|");
        System.out.println("\nINGRESE EL NOMBRE DEL ESTUDIANTE");
        nombreEstudiante = teclado.nextLine().toUpperCase();

        System.out.println("\nINGRESE LA CALIFICACION EXAMEN 1 DEL ESTUDIANTE");
        calificacionExamen1 = teclado.nextDouble();

        System.out.println("\nINGRESE LA CALIFICACION EXAMEN 2 DEL ESTUDIANTE");
        calificacionExamen2 = teclado.nextDouble();

        promedioFinal = (calificacionExamen1 + calificacionExamen2) / 2;

        System.out.println("");
        System.out.printf("NOMBRE DEL ESTUDIANTE: %s\n", nombreEstudiante);
        System.out.printf("PROMEDIO FINAL DE CALIFICACION: %.2f \n", promedioFinal);

        if (promedioFinal >= 65.0) {

            System.out.println("ESTUDIANTE APROBADO");

        } else {

            System.out.println("ESTUDIANTE REPROBADO");
        }

    }// FIN MAIN

}// FIN CLASS
