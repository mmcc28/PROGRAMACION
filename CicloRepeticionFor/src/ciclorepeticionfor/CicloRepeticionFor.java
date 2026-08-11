/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclorepeticionfor;

import java.util.Scanner;

/**
 *
 * @author mmcc28
 */

/* 
1. Implementar ciclo de repeticion For
2. Uso de CONSTANTES

*/
public class CicloRepeticionFor {

    /**
     * @param args the command line arguments
     */
    
   /**
     * Se quiere contabilizar la cantidad
     * de minutos que se entregan a los ninos
     * y ninias en una fiesta. Con ello sacar
     * el porcentaje de cuantos fueron ninios
     * y ninias.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        1. VARIABLE CONTROL -> VALOR INICIAL 
        2. CONDICION -> LIMITE
        3. MODIFICADOR -> INCREMENTO/DECREMENTO
        
        */
        
        for (int i = 0; i < 10; i++) {  // i: iteraccion segun la literatura, pero puede ser una letra
            //i+=2  es igual a ir sumando de dos en dos
            // i++ incrementa de uno en uno
            // i=0 solo va a funcionar en ese ciclo for, una vez sale del ciclo, sale del ciclo, se destruye
            System.out.printf("Valor: %d\n", i);

        }//FIN DE CICLO FOR

        System.out.println("");
        System.out.println("2ndoCicloFor");

        for (int i = 2; i < 10; i += 2) {  // i: iteraccion segun la literatura, pero puede ser una letra
            //i+=2  es igual a ir sumando de dos en dos
            // i++ incrementa de uno en uno
            System.out.printf("Valor: %d\n", i);

        }//FIN DE CICLO FOR

        //DECLARACION DE VARIABLES
        Scanner sc = new Scanner(System.in);

        final int TOTAL = 10; // Elemento constante
        int numVarones = 0;
        int numMujeres = 0;
        char seleccion = 'a';
        double porcentaje = 0;

        for (int i = 0; i < TOTAL; i++) {
            System.out.printf("%d) Quien viene x minuta?\n", i+1);
            System.out.println("V:Varlon / M: Mujer");
            System.out.print("Respuesta:");
            seleccion = sc.next().toUpperCase().charAt(0);

            switch (seleccion) {

                case 'V':
                    System.out.println("Varon comiendo minuta");
                    numVarones++;
                    break;

                case 'M':
                    System.out.println("Mujer comiendo minuta");
                    numMujeres++;
                    break;

                default:
                    System.out.println("Seleccion no valida");
                    break;
            }// FIN DE SWITCH
            
            

        }// FIN CICLO FOR
        
        System.out.println("Porcentaje de Varones");
        porcentaje = (double)numVarones / TOTAL;
        System.out.printf("Porcentaje: %.2f\n", porcentaje);
        
        System.out.println("Porcentaje de Mujeres");
        porcentaje = (double)numMujeres / TOTAL;
        System.out.printf("Porcentaje: %.2f\n", porcentaje);

    }// FIN DE MAIN

}// FINJ DE MAIN
