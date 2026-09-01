/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facturacion;

import java.util.Scanner;

/**
 *
 * @author mmcc28
 */


/*
1. definir el concepto de funcion/metod -> una funcion es un bloque de codigo reutilizable para hacer una tarea en especifico cada vez que la mandamos a llamar
2. conocer la estructura de una funcion
3. implementar funciones en el algoritmo

*caracteristica de la funcion/metodo
-reutilizable
-modular -> seprar todo un codigo en pequenas tareas
-mantenimiento

estructura de una funcion 
1.  acceso de la funcion
    public cualquie otro archivo de java, siempre y cuando se cree 
    private esa funcion solo existe adentro de la clase que fue creada 
    protected funciona en al clase que fue creada y aquella clase que fueron heredadas

2. Tipo de Datos Retorna/Devuelve
 void sin valor no devuelve nada    
int, double 
   char, string    
     boolean, long 
      arraylist
3. Nombre de la funcion 
4. Parametro de trabajo
     int, double 
   char, string    
     boolean, long 
      arraylist
*/

 /*funciones van afuera del main
    public tipo de accesso, quien tuene acceso a esta funciona
    static 
    void tipo de dato que va a retornar, en este caso, no retorna nada, void significa sin valor
    main nombre de la funcion 
    (string ) parametros de trabajo
    */
    
    /*
    funcion con las siguientes caracteristicas 
    1. sin parametros
    2. sin retorno
    */
public class Facturacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // variable locales solo funciona dentro donde fue declarado
        // variable global se puede crear una estancia que peude ser utilizadas en todas las funcionaes y solo declararla una vez, se pone afuera del main
       Scanner scan = new Scanner(System.in);
        
        final double ISV = 0.15;
        
        int precioProducto = 0;
        int cantidad = 0;
        double descuento = 0;
        double impuesto = 0;
        double subTotal = 0;
        double total = 0;
        
        // 1ra Funcion
        // se hace llamado escribiendo nombre de funcion 
        MensajeBienvenida();
        
        // 2da Funcion
        
        System.out.print("Ingresa el Precio del Producto: ");
        precioProducto = scan.nextInt();
        precioProducto = ValidacionNumerica(precioProducto,scan);
        
        System.out.print("Cuantos productos llevas?");
        cantidad = scan.nextInt();
        cantidad = ValidacionNumerica(cantidad,scan);
        
        subTotal = precioProducto * cantidad;
        
       // 3ra funcion
        total = Calculos(subTotal, ISV);
        
        
        //4ta funcion
        ResultadoFactura(subTotal, descuento, impuesto, total);
        
    }// FIN DE MAIN
    
    public static void MensajeBienvenida(){
        System.out.println("---------------------------");
        System.out.println(" Sistema de Facturacion");
        System.out.println(" La logica de Programacion");
        System.out.println("---------------------------");
    }// Fin Funcion MensajeBienvenida

    public static int ValidacionNumerica(int numero, Scanner input) { // necesita dos parametros para trabajar, int y scanner
        // parametro por valor 
        //  parametro por referencia 
        int numeroValido = numero;
        final int LIMITE = 0;
        
        do {
            if (numeroValido < LIMITE) {
                
                System.out.println("VALOR NUMERICO NO PUEDE");
                System.out.println("SER MENOS A 0");
                System.out.println("INGRESE NUEVAMENTE EL DATO");
                numeroValido = input.nextInt();
            } // Fin IF
              
        } while (numeroValido < LIMITE);      
       return numeroValido; // lo que va a retornar
    }// Fin Funcion ValidacionNumerica
    
    public static double Calculos(double sub, double valor){
      
        double resultadoCalculo = 0 ;
        double descuento = 0 ;
        double impuesto = 0;
        
        if(sub >100){
            descuento = sub *0.10;
        }
        else{
            descuento = 0;
        }
        
    impuesto = (sub- descuento)* valor;
     resultadoCalculo = sub - descuento + impuesto;

        return resultadoCalculo;
    }
    
    public static void ResultadoFactura (double sub, double des, double imp, double tot) {
        
        System.out.printf("\nSubtotal: %.2f",sub);
        System.out.printf("\nDescuento: %.2f",des);
        System.out.printf("\nImpuesto: %.2f",imp);
        System.out.printf("\nPrecio a Pagar: %.2f",tot);
        
    } // Fin ResultadoFactura
    
}// FIN CLASS

 