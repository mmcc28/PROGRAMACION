/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiemporelax;

import java.util.Scanner;

/**
 *
 * @author mmcc28
 */
public class TIEMPORELAX {

    /**
     * @param args the command line arguments
     * 
     * 
     * Desarrollar algortimo que me permita escoger un pais a visitar. 
     * POsterior a ello, debemos nosotros escoger las posibles ciudades
     * a recorrer, sin embargo, solo se puede se puede una ciudad. 
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
       
        Scanner sc = new Scanner(System.in);
      
        int seleccionMenu = 0;
        char seleccionSubMenu='@'; 
        
        System.out.println("Agencia de Viajes");
        System.out.printf("|%20s| |%-20s| \n","TANINA'S TRAVEL", "BUEN VIAJE");// caracteres |%20s|
        System.out.println("------------------------------");
        System.out.println("1. JAPON ");
        System.out.println("2. FRANCIA ");
        System.out.println("3. NUEVA ZELANDA");
        System.out.println("4. CANADA");
        System.out.print("Respuesta:");
        seleccionMenu = sc.nextInt();
        
        
        /* 
        
        if/else -> RANGO VALORES
        switch -> igualdad/ todas opciones estan mismo nivel
        
        */
        
        switch (seleccionMenu) {
            case 1:
                System.out.println("NIHON E YOKOSO");
                System.out.println("----------");
                System.out.println("A. OSAKA");
                System.out.println("B. TOKIO");
                System.out.println("C. KIOTO");
                System.out.println("Respuesta:");
                sc.nextLine();// limpieza de buffer
                seleccionSubMenu = sc.nextLine().toUpperCase().charAt(0);

                switch (seleccionSubMenu) {

                    case 'A':
                        System.out.println("Super Nintento World Tour");
                        break;

                    case 'B':
                        System.out.println("Car Meet");
                        break;

                    case 'C':
                        System.out.println("Pabellon Dorado");
                        break;

                    default:
                        System.out.println("CUALQUIER CIUDAD");
                        System.out.println("PORQUE NO ESTA LA OPCION");
                        System.out.println("QUE ESCOGISTE");
                        break;

                }// fin de submenu 
                break;// break se salga del bloque en el cual me encuentro
            case 2:
                System.out.println("BIENVENUE EN FRANCE");
                System.out.println("--------------------");

                System.out.println("1. Paris");
                System.out.println("2. Marsella");
                System.out.println("3. Lyon");
                System.out.print("Respuesta:");

                sc.nextLine(); // limpieza buffer
                seleccionSubMenu = sc.nextLine().charAt(0);

                switch (seleccionSubMenu) {

                    case '1':
                        System.out.println("Torre Eiffel");
                        break;

                    case '2':
                        System.out.println("Palacio de Marshella");
                        break;

                    case '3':
                        System.out.println("El estadio!!");
                        break;

                    default:
                        System.out.println("Lea ombe.. no esta la opcion esa");
                        break;

                } // fin de switch

                break;
            case 3:
                System.out.println("NAU MAI, HAERE MAI!");
                System.out.println("----------------");
                
                System.out.println("A. Sky Tower");
                System.out.println("B. Hogbbiton");
                System.out.println("C. MildFord Sound");
                System.out.print("Respuesta:");
                
                sc.nextLine();
                seleccionSubMenu  = sc.nextLine().toUpperCase().charAt(0);
                
               if(seleccionSubMenu == 'A'){
                    System.out.printf("%s Sky Tower %s","\u001B[31m","\u001B[0m");
                    
                }else if(seleccionSubMenu =='B'){
                    System.out.printf("%s Hogbbiton %s","\u001B[32m","\u001B[0m");
                    
                }else if(seleccionSubMenu =='C'){
                    System.out.printf("%s Mildford Sound %s","\u001B[34m","\u001B[0m");
                }
                else{
                    System.out.println("Usted no lee va?!!!");
                }
                break;
                
            case 4:
                System.out.println("WELCOME TO CANADA");
                break;

        }

    }// FIN DE MAIN

}// FIN DE CLASS

/*
Resetear estilo: \u001B[0m
Negro: \u001B[30m
Rojo: \u001B[31m
Verde: \u001B[32m
Amarillo: \u001B[33m
Azul: \u001B[34m
Morado: \u001B[35m
Cian: \u001B[36m
Blanco: \u001B[37m
*/