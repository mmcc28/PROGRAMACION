/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hola_mundo;

/**
 *
 * @author emilymarie
 */
public class Hola_Mundo {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
     
     /*
        1. IMPRIMIR EN PANTALLA
            a. Salidas formateadas
            b. Caracteres de Escape
        2.Captura de Datos
        */
        
        System.out.println("Hola.. me llamo Mirna");
        System.out.println("Este sera mi 1er");
        System.out.println("PROGRAMA!!!!!");
        
        System.out.print("Vamos camino a");
        System.out.print("la clase de");
        System.out.print("Progra!!");
        
        System.out.println("");
        System.out.printf("Tu apellido es %s\n","Chavez");
        
        System.out.println("");
        System.out.printf("%s Tu apellido es\n","Chavez");
        
        System.out.println("");
        System.out.printf("Tu apellido %S es\n","Chavez");
        
        System.out.println("hola \n este es \n un nuevo \n amacener");
        System.out.println("hola \t este es \t un nuevo \t amacener");

        
        
        // Variables
        int edad;// Tipo entero: sin decimal
        double peso;//Tipo decimal: tiene decimales
        char inicial; //tipo caracter: letras, digitos, simbolos especiales
                      //(acentos, arroba etc)
        String nombre;//tipo cadena, varios caracteres
        boolean estado;// tipo estado, guardar estados true(verdaer) / false(falso)
        
        edad=21;
        peso=60.5;
        inicial='D'; // caracter comilla simple
        nombre="Mirna";// cadena comilla doble
        
        System.out.printf("Tengo %d anios \n", edad);
        System.out.printf("Mi peso ideal es %.2f \n", peso);
        System.out.printf("Dime %c por mi inicial\n", inicial);
        System.out.printf("%s es mi nombre", nombre);
        
       
    }//FIN DE MAIN
    
}// FIN DE CLASS
