/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemacontrolcalidadcomponenteselectronicos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mmcc28
 */
public class SistemaControlCalidadComponentesElectronicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int cantidadLote = 0;
        double ohmios = 0;
        double diferencia = 0;
        String codigo = "";

        int contadorPass = 0;
        int contadorWarn = 0;
        int contadorFail = 0;

        // ---- pedir el tamaño del lote, con validación ----
        do {
            System.out.print("Ingrese el numero de componentes del lote: ");
            cantidadLote = sc.nextInt();

            if (cantidadLote <= 0) {
                System.out.println("ERROR: debe ser mayor a 0");
            }

        } while (cantidadLote <= 0);

        System.out.println("\n--- INSPECCION DEL LOTE ---");

        // ---- inspeccionar cada resistencia ----
        for (int i = 1; i <= cantidadLote; i++) {

            ohmios = Math.random() * 200 + 900;      // entre 900 y 1100
            diferencia = Math.abs(ohmios - 1000);

            if (ohmios >= 990 && ohmios <= 1010) {
                codigo = "A-PASS";
                contadorPass++;
            } else {
                if (diferencia < 50) {
                    codigo = "B-WARN";
                    contadorWarn++;
                } else {
                    codigo = "C-FAIL";
                    contadorFail++;
                }
            }// fin if

            System.out.printf("Resistencia %d: %.2f ohmios\tDesviacion: %.2f\tCodigo: %s\n",
                    i, ohmios, diferencia, codigo);

        }// fin for

        // ---- resumen ----
        System.out.println("\n------------------------------");
        System.out.println("           RESUMEN            ");
        System.out.println("------------------------------");
        System.out.printf("Total inspeccionadas: %d\n", cantidadLote);
        System.out.printf("A-PASS: %d\n", contadorPass);
        System.out.printf("B-WARN: %d\n", contadorWarn);
        System.out.printf("C-FAIL: %d\n", contadorFail);

    }// fin main
}// fin class