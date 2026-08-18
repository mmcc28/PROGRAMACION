/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacionmatematicamixta;

import java.util.Scanner;

/**
 *
 * @author mmcc28
 */

/*
. Operación matemática mixta Escribir un programa para convertir temperaturas. El programa
debe solicitar al usuario que ingrese una temperatura en grados Fahrenheit. Luego, aplique la
fórmula matemática mixta (Fahrenheit - 32) * 5 / 9 para convertir el valor a grados Celsius y
muestre el resultado final.
*/

public class OperacionMatematicaMixta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
       
        
        Scanner sc = new Scanner(System.in);
        
        double tempF = 0;
        double tempC = 0;
        
        System.out.println("INGRESE TEMPERATURA EN GRADOS FAHERENHEIT");
        tempF= sc.nextDouble();
        
        tempC= (tempF - 32) * 5 / 9;
        
        System.out.printf("%.2f F equivale a %.2f C ", tempF,tempC);
    
    
    }// FIN MAIN
    
    
    
}// FIN CLASS
