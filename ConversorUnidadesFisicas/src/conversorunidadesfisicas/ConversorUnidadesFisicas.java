/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversorunidadesfisicas;

import java.util.Scanner;

/**
 *
 * @author mmcc28
 */
public class ConversorUnidadesFisicas {

    /**
     * @param args the command line arguments
     */
    
    /*
    2. Conversor de Unidades Físicas (Uso Do-while)
Crea un menú interactivo que permita al usuario convertir medidas de longitud y peso. El menú
debe mostrar las opciones: 1) Metros a Pies, 2) Kilogramos a Libras, 3) Centímetros a Pulgadas, y
4) Salir.
• Validación: Se debe pedir la magnitud a convertir. Una longitud o un peso nunca pueden
ser negativos. Si el usuario ingresa un valor menor a cero, debe mostrarse un mensaje de
error y volver a pedir el dato.
• Operación: Utiliza una estructura switch para procesar la opción elegida y realizar la
operación aritmética correspondiente. El menú debe repetirse usando do-while hasta que
el usuario elija la opción 4.
    */
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        
        int seleccionMenu = 0;
        double peso = 0;
        double longitud = 0;
        double pies = 0;
        double libras = 0;
        double pulgadas =0; 
        
        do {

            System.out.println("\nQUE OPERACION DESEAS REALIZAR");
            System.out.println("1. METROS -> PIES");
            System.out.println("2. KILOGRAMOS -> LIBRAS ");
            System.out.println("3. CENTRIMETROS -> PULGADAS");
            System.out.println("4. SALIR");
            System.out.print("Respuesta:");
            seleccionMenu = sc.nextInt();
             System.out.println("------------------------------\n");
            
            

            switch (seleccionMenu) {
                case 1:
                    // instrucciones
                    
                    do {
                        System.out.println("CONVERSION DE METROS -> PIES");
                        System.out.println("INGRESE EL VALOR EN METROS");
                        longitud = sc.nextDouble();
                        if (!(longitud > 0)) {
                            System.out.println("ERROR, INGRESE NUEVAMENTE UN VALOR MAYOR A 0\n");
                        }// fin if
                    } while (!(longitud > 0));

                    pies = longitud * 3.28084;
                    System.out.printf("%.2f METROS EQUIVALE A %.2f PIES\n", longitud, pies);

            
                    break;

                case 2:
                    // instrucciones
                   do {
                        System.out.println("CONVERSION DE KILOGRAMOS -> LIBRAS");
                        System.out.println("INGRESE EL VALOR EN KILOGRAMOS");
                        longitud = sc.nextDouble();
                        if (!(longitud > 0)) {
                            System.out.println("ERROR, INGRESE NUEVAMENTE UN VALOR MAYOR A 0\n");
                        }// fin if
                    } while (!(longitud > 0));

                    libras = longitud * 2.20462;
                    System.out.printf("%.2f KILOGRAMOS EQUIVALE A %.2f LIBRAS\n", longitud, libras);
                    break;

                case 3:
                    // instrucciones
                    do {
                        System.out.println("CONVERSION DE CENTIMETROS -> PULGADAS");
                        System.out.println("INGRESE EL VALOR EN CENTIMETROS");
                        longitud = sc.nextDouble();
                        if (!(longitud > 0)) {
                            System.out.println("ERROR, INGRESE NUEVAMENTE UN VALOR MAYOR A 0\n");
                        }// fin if
                    } while (!(longitud > 0));

                    pulgadas = longitud / 2.54;
                    System.out.printf("%.2f CENTIMETROS EQUIVALE A %.2f PULGADAS\n", longitud, pulgadas);
                    break;

                case 4:
                    // instrucciones
                    System.out.println("4. SALIR");
                    break;

                default:
                    // si no coincidió con ninguno
                    System.out.println("OPCION NO VALIDA");
                    System.out.println("VUELVA A INTENTARLO!!!\n");
                    break;
            }// FIN SWITCH

        } while (seleccionMenu !=4);
        
    }// FIN MAIN
    
}// FIN CLASS


// MIRNA CHAVEZ 11741191