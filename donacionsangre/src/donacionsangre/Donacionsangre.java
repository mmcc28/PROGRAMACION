/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package donacionsangre;

import java.util.Scanner;

/**
 *
 * @author emilymarie
 */

/**
     * Desarrollar un algoritmo que permita determinar si
     * el usuario puede donar sangre o no, basandose en su edad (18 - 65)
     * y peso (Mas de 110 lbs). 
     * Si se llega a cumplir los criterios antes expuestos, solo
     * se podra donar sangre si ha comido.
     * 
     * Otro elemento que se tiene que considerar para poder donar sangre
     * es tener el nivel de hierro/hemoglobina en la sangre en los 
     * niveles adecuados.
     * Para los hombres tiene que ser mas de 14 y las mujeres mas de 12
     * 
     */
public class Donacionsangre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
       // AND && (Y)
       
       /*
       
                DINERO          TIEMPO          RESULTADO
                SI (V)          SI(V)           SI PUEDE VIAJAR (V)
                SI (V)          NO(F)           NO PUEDE VIAJAR (F)
                NO (F)          SI (V)          NO SE PUEDE VIAJAR (F)
                NO (F)          NO (F)          NO SE PUEDE VIAJAR (F)
       */
       
       
       // OR || (O)
       
       /*
       
                PASTA               HAMBUERGUESAS           RESULTADO
                 SI(V)                  SI(V)              SE PUEDE COMER (V)
                 SI(V)                  NO (F)             SE PUEDE COMER (V)
                 NO(F)                  SI(V)              SE PUEDE COMER (V)
                 NO (F)                 NO(F)              NO SE PUEDE COMER (F)
      
       
       */
       
      
       // NOT ! (NEGACION)
       
               /*
                        ESTADO DE ANIMO      RESULTADO
                            SI (V)             NO (F)
                            NO (F)             SI (V)
              */
        
        
        Scanner entrada = new Scanner(System.in);
        
        int edad = 0;
        int peso = 0;
        char comio = 'a';
        int niveles = 0;
        String genero ="x";
        
        System.out.println("Ingrese la edad");        
        edad = entrada.nextInt();
        
        System.out.println("Ingrese el peso");        
        peso = entrada.nextInt();
        
        
        if (edad >= 18 && edad <= 65 && peso >= 110) {

            entrada.nextLine();

            // condicion Verdadero
            System.out.println("YA COMIO?");
            comio = entrada.nextLine().charAt(0);

            if (comio == 'S' || comio == 's') {
                System.out.println("SI PUEDE DONAR");

            } else {
                System.out.println("NECESITA COMER");

            }

        } else {
            System.out.println("NO SE PUEDE DONAR");
        }
        
        
        System.out.println("INGRESE SU NIVELES DE HIERRO");
        niveles = entrada.nextInt();
        
        System.out.println("INGRESE SU GENERO");
        genero = entrada.next().toUpperCase();
         
        
   
   
        
        
    } // FIN DE MAIN
    
    
} // FIN DE CLASS
