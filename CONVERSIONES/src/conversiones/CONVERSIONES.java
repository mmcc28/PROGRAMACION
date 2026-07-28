/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversiones;

import java.util.Scanner;

/**
 *
 * @author emilymarie
 */
public class CONVERSIONES {

    /**
     * @param args the command line arguments
     * DESAROLLAR UN ALGORTIMO QUE ME PERMITA CONVERTIR LOS SIGUIENTES ELEMENTOS:
     * 1.PULGADAS
     * KILOMETRO A MILLAS
     * GRADOS A FARENHEIT A GRADOS CELCIUS
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        // DECLARAR VARIABLES 
        
        int pulgadas = 0;
        double resultadoCM= 0;
        
        double kilometros = 0;
        double millas = 0;
        
        double Farenheit = 0;
        double Celcius = 0 ;
        
        pulgadas = 10; // los datos van de der a izq -> =
        resultadoCM = pulgadas * 2.54;
        System.out.printf("%d pulgadas es igual a %.2f cm", pulgadas,resultadoCM);
        
        pulgadas = 35;
        resultadoCM = pulgadas * 2.54;
        System.out.printf("\n %.2f cm es igual a %d", resultadoCM,pulgadas);
        
        System.out.println("");
        System.out.println("Cuantos kilometros hay de TGU - SPS?");
        kilometros = teclado.nextDouble();
        millas = kilometros /1.6;
        System.out.printf("%.2f km es igual a %.2f millas", kilometros, millas);
        
        System.out.println("");
        System.out.println("Ingrese la temperatura en Farenheit");
        Farenheit = teclado.nextDouble();
        Celcius = (Farenheit - 32) * 5/9;
        System.out.printf("%.2f Farenheit es igual a %.2f Celcius",Farenheit, Celcius);
        System.out.println("");
        
        
        
        
        
       
        
    }// FIN DE MAIN
    
}// FIN CLASS
