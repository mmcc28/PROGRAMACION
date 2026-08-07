/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculovariable;




/**
 *
 * 
 * @author mmcc28
 */

/*
1. Cálculo con dos variables 
Escribir un programa que solicite al usuario la base y la altura de un
rectángulo. Utilice estas dos variables para calcular el área del rectángulo (Base X Altura) y el
perímetro (suma de todos sus lados). Imprimir ambos resultados en pantalla.

*/

import java.util.Scanner;

public class CalculoVariable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        double base = 0;
        double altura = 0;
        double areaRectangulo = 0;
        double sumaPerimetro = 0;
        
        System.out.println("INGRESE LA MEDIDA DE LA BASE DEL RECTANGULO EN CENTIMETROS: ");
        base = teclado.nextDouble();
        
        System.out.println("");
        System.out.println("INGRESE LA MEDIDA DE LA ALTURA DEL RECTANGULO EN CENTIMETROS: ");
        altura = teclado.nextDouble();
        
        
        areaRectangulo = base * altura ;
        System.out.printf("\nEl area del rectangulo es %.2f cm2", areaRectangulo);
       
        sumaPerimetro = base + base + altura + altura; 
        System.out.printf("\nEl perimetro del rectangulo es %.2f cm\n", sumaPerimetro);
        
        
        
    }//fin main
    
}//fin class

// MIRNA MARIA CHAVEZ CERRATO 11741191