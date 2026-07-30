/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package selecciondevehiculo;

import java.util.Scanner;

/**
 *
 * @author emilymarie
 * 
 * ESTRUCTURAS DE SELECCION
 * 1. ESCTRUCTURA O FORMATO
 *  a. palabras claves -> if.... else
 *  b. Escritura
 * 
 * 2. TIPOS DE SELECCION 
 *  a. SIMPLE
 *  b. DOBLE
 * 
 * 3. CONDICIONES
 *  a.TIPOS DE CONDICIONES
 *      i. > -> mayor
 *      ii. <  -> menor
 *      iii. >= -> mayor o igual
 *      iv. <= -> igual (son dos signos iguales juntos)
 *       v. == -> igual  (
 *  b.TIPOS DE COMPARACIONES
 */

public class SELECCIONDEVEHICULO {

    /**
     * @param args the command line arguments
     * DESARROLLAR UN ALGORTIMO QUE ME PERMITA ESCOGER LOS SISGUIENTES ELEMENTOS
     * DE UN VEHICULO:
     *  a. SI EL TAMANO DEL TANQUE DE COMBUSTIBLE AGARRA MAS DE 30 LTS (DATOS NUMERICOS)
     *  b. TIPO DE COMBUSTIBLE SI ES O NO DIESEL (DATO TIPO CARACTER)
     *  c. SI INERGETICAMENTE EFICIENTE Y ECOLOGICO (DATOS CADENA)
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int cantidadLitros = 0 ;
        char respuestaTipo = '@';
        String respuestaCadena = "John Doe";
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Me dijieron que eres duenio de un vehiculo \"Verde\"");
        System.out.println("Tienes que echarle biodiesel");
        System.out.print("Cuantos litros te agarra?");
        cantidadLitros = entrada.nextInt();
        
        if (cantidadLitros >= 30){
            
            // condicion Verdadero
            System.out.println("Es un vehiculo con");
            System.out.println("grandes capacidades");
            System.out.println("seguro la factura es alta!!!");
        }
        System.out.println("");
        entrada.nextLine(); // limpiar el buffer, se limpia cuando va de la captura de un dato numero y el siguiente es dato de caracter
        System.out.println("Tu vehiculo es Diesel? (x = si, y = no)");
        respuestaTipo = entrada.nextLine().charAt(0); // next line es para capturar palabras
        
        if (respuestaTipo == 'x'){
            // condicion verdadero
            System.out.println("Si es Diesel verde!!");
            System.out.println("Disel combinado con ethanol");
            System.out.println("Se saca del maiz");
        }
        else
        {
            // condicion falso
            System.out.println("UYYYY... eres anticlimatico");
            System.out.println("Calentamiento Global!!!");
        }
        
        /*
        System.out.println("");
        System.out.println("Tu carro es energeticamente eficiente?");
        respuestaCadena = entrada.nextLine();
        System.out.printf("Respuesta ingresada: %s", respuestaCadena);
        
        System.out.println("\n Seguro que es asi?");
        respuestaCadena = entrada.nextLine().toUpperCase();
        System.out.printf("Respuesta ingresada: %s", respuestaCadena);
        
        System.out.println("\n 100% Seguro?");
        respuestaCadena = entrada.next().toLowerCase();
        System.out.printf("Respuesta ingresada: %s", respuestaCadena);
        
        */
        
        if (respuestaCadena.equals("si")) {
            System.out.println("Excelente");
            System.out.println("Amigable con el ambiente");
        
        }
        else {
            System.out.println("uyyyyy... busca que se puede hacer");
        }
        
        

    }//FINMAIN
    
}//FINCLASS
