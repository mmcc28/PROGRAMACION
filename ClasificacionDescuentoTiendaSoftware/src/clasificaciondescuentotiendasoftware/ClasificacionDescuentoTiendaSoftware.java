/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasificaciondescuentotiendasoftware;

import java.util.Scanner;

/**
 *
 * @author mmcc28
 */
public class ClasificacionDescuentoTiendaSoftware {

    /**
     * @param args the command line arguments
     */
    
    /*
    2. Clasificación de Descuentos en Tienda de Software Enunciado
Una tienda de software ofrece descuentos basados en la edad del cliente y si tiene una membresía
premium. Se tiene que solicitar la edad y si tiene membresía ('S' para sí, 'N' para no).
• Primero, se tiene que verificar si el cliente es mayor de edad (Arriba o igual a 18 años).
    o Si es mayor de edad: Se verifica si tiene más de 65 años o si tiene membresía. Si
    cumple alguna de las condiciones, recibe un 20% de descuento. Si no, recibe un
    10%.
    o Si es menor de edad: Verificar si tiene membresía 'S' y tiene más de 12 años. Si es
    así, recibe un 15% de descuento. De lo contrario, no tiene descuento (0%).
    El programa debe calcular y mostrar el descuento final aplicado y también el precio de venta
    original y el nuevo total que se tiene que pagar por el juego.
    */
    
   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        int edadCliente = 0; 
        char membresiaPremium = '@';
        char mayorEdad = '@';
        int seleccionMenu = 0;
        double precioVenta =300 ;
        double precioFinal = 0;
        double precioDescuento = 0;
        
       
        
        System.out.println("|BIENVENIDOS A NUESTRA TIENDA|");
        System.out.println("PARA VALIDAR SI APLICA Al DESCUENTO COMPLETE LOS SIGUIENTE DATOS:");
        
        System.out.println("ES USTED MAYOR O MENOR DE EDAD");
        
        
        System.out.println("1. MAYOR DE EDAD");
        System.out.println("2. MENOR DE EDAD ");
       
        System.out.print("Respuesta:");
        seleccionMenu = teclado.nextInt();
        
      
        
        switch (seleccionMenu) {

            case 1:
                // indicaciones
                System.out.println("INGRESE SU EDAD");
                edadCliente = teclado.nextInt();

                System.out.println("CUENTA CON MEMBRESIA PREMIUM");
                membresiaPremium = teclado.next().toUpperCase().charAt(0);

                if (edadCliente >= 65 || membresiaPremium == 'S') { // if primera condicion 

                    System.out.println("APLICA AL 20% DESCUENTO");
                    System.out.printf("\nPRECIO DE VENTA ORIGINAL:%.2f Lps", precioVenta);
                    precioDescuento = precioVenta * 0.20;
                    precioFinal = precioVenta - precioDescuento;
                    System.out.printf("\nDESCUENTO OTORGADO:%.2f Lps", precioDescuento);
                    System.out.printf("\nPRECIO FINAL CON DESCUENTO APLICADO:%.2f Lps\n ", precioFinal);

                } else { // fin de primera condicion

                    System.out.println("APLICA AL 10% DESCUENTO ");
                    System.out.printf("\nPRECIO DE VENTA ORIGINAL:%.2f Lps", precioVenta);
                    precioDescuento = precioVenta * 0.10;
                    precioFinal = precioVenta - precioDescuento;
                    System.out.printf("\nDESCUENTO OTORGADO:%.2f Lps", precioDescuento);
                    System.out.printf("\nPRECIO FINAL CON DESCUENTO APLICADO:%.2f Lps\n ", precioFinal);
                }
                break;

            case 2:
                // indicaciones
                
                System.out.println("INGRESE SU EDAD");
                edadCliente = teclado.nextInt();

                System.out.println("CUENTA CON MEMBRESIA PREMIUM");
                membresiaPremium = teclado.next().toUpperCase().charAt(0);

                if (edadCliente >= 12 && membresiaPremium == 'S') { // if primera condicion 

                    System.out.println("APLICA AL 15% DESCUENTO");
                    
                    System.out.printf("\nPRECIO DE VENTA ORIGINAL:%.2f Lps", precioVenta);
                    precioDescuento = precioVenta * 0.15;
                    precioFinal = precioVenta - precioDescuento;
                    System.out.printf("\nDESCUENTO OTORGADO:%.2f Lps", precioDescuento);
                    System.out.printf("\nPRECIO FINAL CON DESCUENTO APLICADO:%.2f Lps\n ", precioFinal);

                } else { // fin de primera condicion

                    System.out.println("NO APLICA AL DESCUENTO ");
                }
                break;

            default:
                // no coincide con ninguno
                break;
        }

        
        
        
        
        
        

           
    }// FIN MAIN
    
}// FIN CLASS


// MIRNA CHAVEZ 11741191