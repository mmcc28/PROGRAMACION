/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rentaservidorweb;

import java.util.Scanner;

/**
 *
 * @author mmcc28
 */
public class RentaServidorWeb {

    /**
     * @param args the command line arguments
     */
    
    
    /*
    Renta de Servidores Web (Mezcla de switch e if/else con booleanos)
Una empresa de hosting renta servidores. El costo base por día es de $10.0. Se le pide al usuario la
cantidad de días y el tipo de plan (“A” Básico, “B” Pro, “C” Empresarial). Usando un switch para
añadir un costo extra diario:
• Plan Básico se suma $0,
• Plan Pro se suma $5,
• Plan Empresarial se suma $15.
Después de calcular el subtotal, usar una estructura de selección simple para aplicar una
promoción:
• Si el cliente renta el servidor por más de 15 días y el plan es 'B'o 'C', se le aplica un 15% de
descuento al total.
Se tiene que mostrar el total a pagar, la cantidad de días de renta y el plan seleccionado.
    */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        int cantidadDias = 0;
        char tipoPlan = '@';
        double costoBase = 10;
        double subTotal = 0;
        double descuento = 15;
        double precioDescuento =0;
        double total = 0;
        double precioFinal;
        
        System.out.println("INGRESE CANTIDAD DE DIAS");
        cantidadDias = sc.nextInt();
        
        System.out.println("INGRESE PLAN A ELEGIR: \n A. PLAN BASICO\n B. PLAN PRO \n C. PLAN EMPRESARIAL \n");
        tipoPlan = sc.next().toUpperCase().charAt(0);
       
        
        switch (tipoPlan) {
            case 'A':

                subTotal = cantidadDias * costoBase;

                break;

            case 'B':
                subTotal = cantidadDias * (costoBase + 5);
                
                break;

            case 'C':
                subTotal = cantidadDias * (costoBase + 15);
                
                break;

            default:
                System.out.println("RESPUESTA INVALIDA");
                break;
        }// FIN SWITCH
        
        // Si el cliente renta el servidor por más de 15 días y el plan es 'B'o 'C', se le aplica un 15% de
//descuento al total.
//Se tiene que mostrar el total a pagar, la cantidad de días de renta y el plan seleccionado.

        if (tipoPlan == 'A' || tipoPlan == 'B' || tipoPlan == 'C') {

            System.out.printf("Total %.2f LPS \n", subTotal);
            System.out.printf("Dias a rentar: %d \n", cantidadDias);
            System.out.printf("Plan Seleccionado: %c \n", tipoPlan);

            if (cantidadDias > 15 && (tipoPlan == 'B' || tipoPlan == 'C')) {
                precioDescuento = subTotal * descuento / 100;
                System.out.printf("Descuento Aplicado: %.2f LPS \n", precioDescuento);
                precioFinal = subTotal - precioDescuento;
                System.out.printf("Precio Final con Descuento Aplicado: %.2f LPS \n", precioFinal);
            }

        }// fin if plan valido
    }// FIN MAIN
    
}// FIN CLASS
