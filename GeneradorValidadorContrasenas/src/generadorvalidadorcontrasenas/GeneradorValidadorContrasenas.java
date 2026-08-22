/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generadorvalidadorcontrasenas;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mmcc28
 */
public class GeneradorValidadorContrasenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int cantidad = 0;
        String contrasena = "";
        int tipoCaracter = 0;
        char caracter = 'a';
        int longitud = 0;
        boolean tieneNumero = false;
        boolean tieneSimbolo = false;

        // ---- pedir cuántas contraseñas, con validación ----
        do {
            System.out.print("Cuantas contrasenas desea evaluar? ");
            cantidad = sc.nextInt();

            if (cantidad <= 0) {
                System.out.println("ERROR: debe ser mayor a 0");
            }

        } while (cantidad <= 0);

        // ---- generar y evaluar cada contraseña ----
        for (int i = 1; i <= cantidad; i++) {

            contrasena = "";
            tieneNumero = false;
            tieneSimbolo = false;

            longitud = rd.nextInt(8) + 5;      // longitud entre 5 y 12

            // ---- construir la contraseña ----
            for (int j = 0; j < longitud; j++) {

                tipoCaracter = rd.nextInt(4);   // 0=mayus 1=minus 2=digito 3=simbolo

                if (tipoCaracter == 0) {
                    caracter = (char) (rd.nextInt(26) + 65);        // A-Z
                } else if (tipoCaracter == 1) {
                    caracter = (char) (rd.nextInt(26) + 97);        // a-z
                } else if (tipoCaracter == 2) {
                    caracter = (char) (rd.nextInt(10) + 48);        // 0-9
                    tieneNumero = true;
                } else {
                    caracter = (char) (rd.nextInt(4) + 35);         // # $ % &
                    tieneSimbolo = true;
                }

                contrasena = contrasena + caracter;

            }// fin for interno

            // ---- clasificar ----
            System.out.printf("\nContrasena %d: %s\n", i, contrasena);
            System.out.printf("Longitud: %d\n", contrasena.length());

            if (contrasena.length() > 10 && tieneNumero && tieneSimbolo) {
                System.out.println("Nivel: FUERTE");
            } else if (contrasena.length() >= 8 && (tieneNumero || tieneSimbolo)) {
                System.out.println("Nivel: MEDIA");
            } else {
                System.out.println("Nivel: DEBIL");
            }

        }// fin for 

    }// fin main
}// fin class