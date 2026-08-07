/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usolibreriamath;

import java.util.Scanner;

/**
 *
 * @author mmcc28
 */
public class UsoLibreriaMath {

    /**
     * @param args the command line arguments
     */
    
    /*
    2. Uso de la librería Math Desarrolle un programa que pida al usuario el radio de un círculo.
Utilizando la constante Math.PI y la función Math.pow() de la librería matemática de Java, calcule
el área y circunferencia de dicho círculo y muestre el resultado al usuario.
    */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner teclado = new Scanner(System.in);

        double radio = 0;
        double area = 0;
        double circunferencia = 0;

        System.out.println("INGRESE LA MEDIDA DEL RADIO DEL CIRCULO: ");
        radio = teclado.nextDouble();

        area = Math.PI * Math.pow(radio, 2);
        System.out.printf("El area del circulo es %.2f de cm2", area);

        System.out.println("");
        circunferencia = 2 * Math.PI * radio;
        System.out.printf("La circunferencia del circulo es de %.2f cm\n", circunferencia);

    }// fin main
    
}// fin class


// MIRNA MARIA CHAVEZ CERRATO 11741191