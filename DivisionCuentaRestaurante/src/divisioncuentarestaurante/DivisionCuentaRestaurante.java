/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package divisioncuentarestaurante;

import java.util.Scanner;

/**
 *
 * @author mmcc28
 */
public class DivisionCuentaRestaurante {

    /**
     * @param args the command line arguments
     */
    
    
    /*
    División de cuenta de restaurante Escriba un programa que pida al usuario el monto total de
una cuenta de restaurante y la cantidad de personas en la mesa. Calcule y muestre en pantalla
cuánto dinero debe pagar cada persona si deciden dividir la cuenta en partes exactamente iguales.
    */
    
    public static void main(String[] args) {
        // TODO code application logic here
    
        
        Scanner sc = new Scanner(System.in);
        
        double cuentaTotal = 0;
        int cantidadPersonas = 0;
        double cantidadIndividual = 0;
        
        
        
        do {
            System.out.println("Ingrese el monto total a pagar");
            cuentaTotal = sc.nextDouble();

            System.out.println("Ingrese la cantidad de personas a pagar ");
            cantidadPersonas = sc.nextInt();
            

            if (cantidadPersonas <= 0) {

                System.out.println("DIVISION NO VALIDA");
            }// fin if

        } while (cantidadPersonas <= 0);

        cantidadIndividual = cuentaTotal / (double) cantidadPersonas;
            System.out.printf("Cantidad a pagar c/u: %.2f\n", cantidadIndividual);
        
    }// FIN MAIN
    
}// FIN CLASS

