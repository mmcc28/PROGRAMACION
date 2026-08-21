/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validorclasificadortriangulos;

import java.util.Scanner;

/**
 *
 * @author mmcc28
 */
public class ValidorClasificadorTriangulos {

    /**
     * @param args the command line arguments
     */
    
    /*
    Validador y Clasificador de Triángulos (Uso intensivo de booleanos e if/else anidados)
Se le pide al usuario que ingrese las longitudes de los tres lados de un triángulo.
• Primero, valida si los lados forman un triángulo real: La suma de dos lados cualesquiera
siempre debe ser estrictamente mayor que el tercer lado.
o Si no es un triángulo válido, imprime un mensaje de error.
o Si es válido usar una estructura de selección para clasificarlo:
▪ Equilátero (los 3 lados iguales).
▪ Isósceles (exactamente 2  lados iguales).
▪ Escaleno (ningún lado igual).
    */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
        Scanner sc = new Scanner(System.in);
        
        double ladoA = 0;
        double ladoB = 0;
        double ladoC = 0;
        
        System.out.println("Ingrese Longitud a del Triangulo");
        ladoA = sc.nextDouble();
        
        System.out.println("Ingrese Longitud b del Triangulo");
        ladoB = sc.nextDouble();
        
        System.out.println("Ingrese Longitud c del Triangulo");
        ladoC = sc.nextDouble();
        
        if (ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA) {
            
            if (ladoA == ladoB && ladoB == ladoC) {
                System.out.println("Triangulo Equilatero");
            } else if (ladoA == ladoB || ladoC == ladoB || ladoC == ladoA) {
                System.out.println("Triangulo Isosceles");

            } else { 
                System.out.println("Triangulo Escaleno");
            }// fin else if else

                
            
        } else {
            System.out.println("NO CORRESPONDE A UN TRIANGULO");
        } // FIN IFELSE
   
        
       
    }// FIN DE MAIN
    
}// FIN DE CLASS
