/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoraaritmeticaconsola;

import java.util.Scanner;

/**
 *
 * @author mmcc28
 */

/*
Crear un programa que actúe como una calculadora básica. Debe solicitar al usuario dos números
enteros y un carácter (char) que represente la operación a realizar:
• Suma
• Resta
• División
• Multiplicación
• Módulo ‘%.
Dependiendo del carácter ingresado, el programa debe usar una estructura de selección para
realizar la operación aritmética correspondiente y mostrar el resultado en formato decimal (cuidar
las divisiones entre cero). Si el usuario ingresa un carácter no válido, se debe mostrar "Operador
no reconocido".
*/

public class CalculadoraAritmeticaConsola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        int valor1 = 0;
        int valor2 = 0;
        char operacion = '@';
        double resultadoOperacion = 0;
        char seleccionMenu = '@';
        
        
        System.out.println("INGRESE UN VALOR ENTERO #1");
        System.out.print("Respuesta:");
        valor1 = teclado.nextInt();
        
        System.out.println("INGRESE UN VALOR ENTERO #2");
        System.out.print("Respuesta:");
        valor2 = teclado.nextInt();
        
        System.out.println("INDIQUE LA OPERACION QUE DESEE REALIZAR");
        System.out.println(" + SUMA ");
        System.out.println(" - RESTA ");
        System.out.println(" / DIVISION ");
        System.out.println(" * MULTPLICACION ");
        System.out.println(" % MODULO ");
        System.out.print("Respuesta:");
        teclado.nextLine();// limpieza de buffer
        seleccionMenu = teclado.nextLine().toUpperCase().charAt(0);
        
      
        switch (seleccionMenu) {

            case '+':
                // instrucciones
                System.out.println("SUMA");
                resultadoOperacion = valor1 + valor2;
                System.out.printf("EL RESULTADO DE LA OPERACION DE SUMA ES LA SIGUIENTE: %.2f\n", resultadoOperacion);
                
                
                break;

            case '-':
                // instrucciones
                System.out.println("RESTA");
                resultadoOperacion = valor1 - valor2;
                System.out.printf("EL RESULTADO DE LA OPERACION DE RESTA ES LA SIGUIENTE: %.2f\n", resultadoOperacion);
                
                break;

            case '/':
                // instrucciones
                System.out.println("DIVISION");
                resultadoOperacion = (double) valor1 / valor2;
                System.out.printf("EL RESULTADO DE LA OPERACION DE DIVISION ES LA SIGUIENTE: %.2f\n", resultadoOperacion);
                
                break;

            case '*':
                // instrucciones
                System.out.println("MULTIPLICACION");
                resultadoOperacion = valor1 * valor2;
                System.out.printf("EL RESULTADO DE LA OPERACION DE MULTIPLICACION ES LA SIGUIENTE: %.2f\n", resultadoOperacion);
                
                break;
                
            case '%':
                // instrucciones
                System.out.println("MODULO");
                resultadoOperacion = valor1 % valor2;
                System.out.printf("EL RESULTADO DE LA OPERACION DE MODULO ES LA SIGUIENTE: %.2f\n", resultadoOperacion);
                break;

            default:
                // si no coincidió con ninguno
                System.out.println("OPERADOR NO RECONOCIDO");
                System.out.println("VUELVE A INTENTARLO");
                break;
        }// FIN SWITCH 

        

        
    }// FIN  MAIN
    
}// FIN CLASS
