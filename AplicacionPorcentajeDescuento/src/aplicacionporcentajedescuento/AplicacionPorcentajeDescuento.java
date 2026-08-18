/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacionporcentajedescuento;

import java.util.Scanner;

/**
 *
 * @author mmcc28
 */
public class AplicacionPorcentajeDescuento {

    /**
     * @param args the command line arguments
     */
    
    /*
    5. Aplicación de porcentaje de descuento Desarrolle un programa que solicite el precio original
de un artículo y el porcentaje de descuento que se le aplicará (por ejemplo, 15). Calcule el monto
en dinero que representa ese descuento y réstelo al precio original para mostrarle al usuario el
precio final a pagar.
    */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner sc = new Scanner(System.in);
        
        double precioOriginal = 0;
        int porcentajeDescuento = 0;
        double precioFinal = 0 ;
        double precioDescuento = 0;
        
        System.out.println("Ingrese Precio Original del Articulo");
        precioOriginal = sc.nextDouble();
        
        System.out.println("Ingrese el Porcentaje de Descuento a Brindar");
        porcentajeDescuento = sc.nextInt();
        
        precioDescuento = precioOriginal * porcentajeDescuento/100;
        System.out.printf("Precio Descuento: %.2f LPS \n", precioDescuento);
        
        precioFinal= precioOriginal - precioDescuento;
        System.out.printf("Precio Final con Descuento Aplicado: %.2f LPS \n", precioFinal);
        
    }// FIN MAIN
    
}// FIN CLASS
