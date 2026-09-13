/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglosdinamicos;

import java.util.ArrayList;

/**
 *
 * @author mmcc28
 */
public class ArreglosDinamicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        ArrayList <Integer> numeros = new ArrayList <Integer> ();
        ArrayList <Double> decimales = new ArrayList <Double> ();
        ArrayList <Character>letras = new ArrayList <Character> ();
        ArrayList <String> palabras = new ArrayList <String> ();
        ArrayList <Boolean> estado = new ArrayList <Boolean>();
        
        int dimension = 0;
        
        dimension = DimesionArrayList(numeros);
        MostrarDimension(dimension);
        
        numeros.add(10);
        numeros.add(200);
        numeros.add(-300);
        numeros.add(50);
        
        dimension = DimesionArrayList(numeros);
        MostrarDimension(dimension);
        
        numeros.add(80);
        dimension = DimesionArrayList(numeros);
        MostrarDimension(dimension);
        
        
        System.out.println("------------");
        System.out.println("OBTENIENDO DATOS");
        MostrarContenidoArrayList(numeros);
        
        System.out.println("");
        System.out.println("-----------");
        System.out.println("MODIFICANDO VALOR");
        numeros.set(0, 600);
        MostrarContenidoArrayList(numeros);
        System.out.println("\n OTRO CAMBIO");
        numeros.set(3,-40);
        MostrarContenidoArrayList(numeros);
        
        System.out.println("");
        System.out.println("--------");
        System.out.println("ELIMINANDO VALOR");
        numeros.remove(0);
        MostrarDatoEliminado(numeros);

        System.out.println("");
        System.out.println("--------");
        System.out.println("ELIMINANDO TODO LOS VALORES");
        numeros.clear();
        MostrarDatoEliminado(numeros);
        
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        
        UsoForEach(numeros);
        
        
    }// fin main
    
    public static int DimesionArrayList (ArrayList<Integer>arreglo){
        int tempo =0;
        tempo = arreglo.size(); // size es para arreglos dinamicos 
        return tempo;
        
             
                    
    }// Fin Funcion DimesionArrayList
    
    public static void MostrarDimension (int valor){
        
        System.out.printf("La dimension del ArrayList: %d\n ", valor);
        
    }// Fin Funcion MostrarDimension
    
    public static void MostrarContenidoArrayList (ArrayList<Integer>datos){
        
        for (int i = 0; i < datos.size(); i++){
            
            int valor=0;
            
            valor = datos.get(i);
            
            System.out.printf("Posicion: %d\t", i);
            System.out.printf("Valor [%d]: %d\n",i, valor);
        }// fin for
        
    }// Fin Funcion MostrarContenidosArraylist
    
    public static void MostrarDatoEliminado(ArrayList<Integer> datos ) {
        int dimension = DimesionArrayList(datos);
        MostrarDimension(dimension);
        MostrarContenidoArrayList(datos);
               
    }// fin funcion Mostrar Dato Eliminado
    
    
    public static void UsoForEach (ArrayList<Integer> arreglo){
        
        for (int i : arreglo) {
            System.out.printf("Valor: %d\n", i);

        } // fin for
        
    }// fin funcion uso for each
    
}// fin class
    