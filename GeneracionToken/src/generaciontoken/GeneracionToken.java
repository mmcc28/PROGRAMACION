/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generaciontoken;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mmcc28
 */

/*
* Objetivos 
 * 1. Utilizar el ciclo de repeticion DO - WHILE
 * 2. Uso de Nuevas Librerias
 *      a. Random
 * 3. Uso de Otras Funciones de String
* Desarrollar un algoritmo que me permita registrar
     * un dispositivo y generar un token para su sesion
     * de validacion mientras se esta navegando con dicho dispositivo.
     * 
     * Contexto del problema:
       Un sistema de gestión de red necesita registrar 
      nuevos enrutadores (routers) y asignarles una clave 
        de sesión única generada aleatoriamente. 
        
       Sin embargo, el canal de comunicación tiene "ruido",
       por lo que la generación de la clave no siempre 
       es constante.
 */

public class GeneracionToken {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner teclado = new Scanner(System.in);
        Random rd = new Random(); // libreria para generar numeros aleatoreos

        boolean longitudCorrecta = true;
        boolean prefijoCorrecto = true;
        boolean validacionCorrecta = true;
        int tipoCaracter = 0;
        int numeroToken = 0;
        char letraToken = 'a';
        String token = "s";

        String nombreEquipo = "a";       
      
        do {
            System.out.println("Ingrese el nombre de su equipo");

            nombreEquipo = teclado.nextLine().toUpperCase();
            System.out.printf("\n Nombre del equipo: %s\n", nombreEquipo);

            longitudCorrecta = nombreEquipo.length() == 8; // recorre y cuenta el tamano o cantidad de caracter que esta almacenada en esta variable nombreEquipo
            prefijoCorrecto = nombreEquipo.startsWith("RT") || nombreEquipo.startsWith("SW"); // va a evaluar si comienza RT

            // System.out.println(longitudCorrecta);
            // System.out.println(prefijoCorrecto); 
            validacionCorrecta = longitudCorrecta && prefijoCorrecto;

        } while (!validacionCorrecta); // se va a ejecutar almenos una vez, no importa sea true o false
        System.out.println("Registro Correcto");

        while (token.length() < 12) {

            tipoCaracter = rd.nextInt(2); // LIMITE SUPERIOR NO SE INCLUYE Y NO PASA DE 2. SOLO MOSTRARIA 0 Y 1

            if (tipoCaracter == 0) {
                numeroToken = rd.nextInt(10);
                token = token + numeroToken; // contenido token enlazarlo con numero token

            } else {
                letraToken = (char) (rd.nextInt(26) + 65);// tengo 26 letras de la a-z, en el codigo ascii empieza en 65.
                token = token + numeroToken;

                System.out.printf("token es: %s", token);
// castin conversion temporal de un tipo de dato a otro, no se puede hacer con todo lo tipo de dato. 
//entero lo puedo convertir a double
            }

            
            
        } // fin while
        
      
        
       
        
    }// FIN MAIN
    
}// FIN MAIN
