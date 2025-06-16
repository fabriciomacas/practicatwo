/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/**
 *
 * @author fabri
 */
import java.util.Random;
import java.util.Scanner;

public class hcultivo {



    public static void main(String[] args) {
        final int HORAS_DIA = 24;
        final int INTERVALO = 2;
        final int LECTURAS_POR_DIA = HORAS_DIA / INTERVALO;
        final int TIEMPO_RIEGO_POR_EVENTO = INTERVALO; 

        Scanner teclado = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("¿Cuántas parcelas desea analizar? ");
        int parcelas = teclado.nextInt();

        for (int p = 1; p <= parcelas; p++) {
            int tiempoRiego = 0;
            System.out.println(" Parcela #" + p );

            for (int i = 0; i < LECTURAS_POR_DIA; i++) {
                int hora = i * INTERVALO;
                int humedad = rand.nextInt(101); 

                System.out.printf("Hora %02d:00 - Humedad: %d%% → ", hora, humedad);

                if (humedad < 30) {
                    tiempoRiego += TIEMPO_RIEGO_POR_EVENTO;
                    System.out.println("Encender riego.");
                } else if (humedad <= 60) {
                    System.out.println("Mantener estado.");
                } else {
                    System.out.println("Apagar riego.");
                }
            }

            System.out.println(" Tiempo total de riego diario: " + tiempoRiego + " horas.");
        }

    }
}

    

