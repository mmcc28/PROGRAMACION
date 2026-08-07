/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interessimple;

import java.util.Scanner;
/**
 *
 * @author mmcc28
 */

/*
3. Interés simple Escriba un programa que calcule el interés simple de un préstamo. El sistema
debe solicitar el capital inicial, la tasa de interés anual (en formato de número entero) y el tiempo
en años. Aplique la fórmula (Capital * Tasa * Tiempo) / 100 y muestre el interés generado.
*/
public class InteresSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Scanner teclado = new Scanner(System.in);
       
       double capitalInicial = 0;
       int tasaInteres = 0;
       double tiempo =  0 ;
       
       double interesGenerados = 0;
       
        System.out.println("Para poder calcular sus interes generados");
        System.out.println("Ingrese lo solicitado:");
       
        System.out.println("Capital Inicial:");
        capitalInicial = teclado.nextDouble();
        
        System.out.println("tasa de Interes Anual (%):");
        tasaInteres = teclado.nextInt();
        
        System.out.println("Tiempo en anos:");
        tiempo = teclado.nextDouble();
        
        interesGenerados = (capitalInicial * tasaInteres * tiempo) / 100 ;
        System.out.printf("El interes generado es %.2f\n", interesGenerados);
        
        
        
    }// fin main
    
}// fin class
