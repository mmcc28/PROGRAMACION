/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulaciontrayectoriabalistica;

import java.util.Scanner;

/**
 *
 * @author mmcc28
 */
public class SimulacionTrayectoriaBalistica {

    /**
     * @param args the command line arguments
     */
    /*
    Simulación de Trayectoria Balística (Uso estricto de for)
Escribe un programa que simule el lanzamiento de un proyectil. El usuario debe ingresar la
velocidad inicial (en m/s) y el ángulo de lanzamiento (en grados). Se tiene que buscar la fórmula
correspondiente a la trayectoria.
• Validación: La velocidad inicial debe ser mayor a 0 y el ángulo debe estar estrictamente
entre 1 y 89 grados.
• Operación: Utilizando un ciclo for, el programa debe calcular y mostrar la altura del
proyectil (en metros) para cada segundo transcurrido, desde el segundo 𝑡 = 1 hasta el
segundo 𝑡 = 10.
• Selección: Dentro del ciclo, utiliza una estructura if-else para indicar en qué segundo el
proyectil alcanza su altura máxima estimada y en qué momento su altura empieza a ser
negativa (lo que significa que ya impactó el suelo, momento en el cual el ciclo debe
romperse mediante break). Nota: Utiliza la fórmula de posición vertical de la cinemática
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);

        double velocidadInicial = 0;
        double anguloLanzamiento = 0;
        double altura = 0;
        double alturaMin = 0;
        double alturaMax = 0;
        double segundoMax = 0;


        do {
            System.out.println("INGRESE LA VELOCIDAD INICIAL (M/S)");
            velocidadInicial = sc.nextDouble();

            System.out.println("INGRESE EL ANGULO DE LANZAMIENTO (EN GRADOS)");
            anguloLanzamiento = sc.nextDouble();

            if (!(velocidadInicial > 0 && anguloLanzamiento >= 1 && anguloLanzamiento <= 89)) {
                System.out.println("ERROR, VELOCIDAD INICIAL MAYOR A 0");
                System.out.println("ERROR, ANGULO DE LANZAMIENTO ENTRE 1 Y 89");
            }// fin if
        } while (!(velocidadInicial > 0 && anguloLanzamiento >= 1 && anguloLanzamiento <= 89));

        for (int t = 1; t < 11; t++) {
            altura = velocidadInicial * Math.sin(Math.toRadians(anguloLanzamiento)) * t - 0.5 * 9.81 * Math.pow(t, 2);
            System.out.printf("EN %d SEGUNDO LA ALTURA ES %.2f METROS\n", t, altura);


            if (altura < 0) {
                System.out.printf("EL PROYECTIL IMPACTO EL SUELO EN EL SEGUNDO %d\n", t);
                break;
            }
            if (altura > alturaMax) {

                alturaMax = altura;

                segundoMax = t;
            } else {
            }// fin del if
        }//Fin de For

        System.out.printf("Altura maxima es %.2f en el segundo %.2f", alturaMax, segundoMax);
       
        
        

    }// FIN MAIN

}// FIN CLASS

//MIRNA CHAVEZ 11741191
