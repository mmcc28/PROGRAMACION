/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taquillacinediasespeciales;

import java.util.Scanner;

/**
 *
 * @author mmcc28
 */
public class TaquillaCineDiasEspeciales {

    /**
     * @param args the command line arguments
     */
    
    /*
    Taquilla de Cine con Días Especiales (switch e if/else anidado)
Un cine tiene un precio base de entrada de $8.0 (double). Se le solicita la edad del cliente y el día
de la semana ingresado como un número del 1 al 7 (donde 1 es Lunes).
Usando un switch para evaluar el día de la semana.
• Si el día es 3 (Miércoles), el precio de la entrada se reduce a la mitad sin importar la edad
• Si es cualquier otro día, entra al bloque default del switch y usando un if/else:
o Si el cliente es menor de 12 años o mayor o igual a 65 años, se le descuentan $2.0
al precio base.
Imprime cuánto debe pagar el cliente al final.
    */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        double precioBase = 8;
        int edadCliente = 0; 
        int diaSemana = 'a';
        double precioFinal = 0 ;
        
        System.out.println("INGRESE SU EDAD");
        edadCliente = sc.nextInt(); 
        
        System.out.println("INGRESE DIA DE LA SEMANA\n 1. LUNES \n 2. MARTES \n 3. MIERCOLES\n 4. JUEVES \n 5. VIERNES\n 6.SABADO\n 7.DOMINGO\n");
        diaSemana = sc.nextInt();
                
        switch (diaSemana) {

            case 3:

                precioFinal = precioBase / 2;

                System.out.printf("PRECIO MITAD DE PRECIO: %.2f\n", precioFinal);

                break;
            default:
                if (edadCliente < 12 || edadCliente >= 65) {
                    precioFinal = precioBase - 2;
                    System.out.printf("PRECIO CON DESCUENTO FINAL : %.2f", precioFinal);
                }else {
                    System.out.printf("PRECIO BASE: %.2f\n", precioBase);
                }
                break;
        }// FIN SWITCH

    }// fin main
    
}// fin class
