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
public class hdaclima {
   

    public static void main(String[] args) {
        final int DIAS_DEL_ANO = 365;
        int olaCalor = 0;
        int olaFrio = 0;
        double sumaTemperaturas = 0;

        Random rand = new Random();

        System.out.println("--- Análisis de temperaturas del año ---");

        for (int i = 1; i <= DIAS_DEL_ANO; i++) {
            
            double temperatura = -10 + rand.nextDouble() * 55; 

            sumaTemperaturas += temperatura;

            // Contar olas de calor y frío
            if (temperatura > 35) {
                olaCalor++;
            } else if (temperatura < 0) {
                olaFrio++;
            }
        }

        double promedio = sumaTemperaturas / DIAS_DEL_ANO;

        System.out.println("Cantidad de días con ola de calor (>35°C): " + olaCalor);
        System.out.println("Cantidad de días con ola de frío (<0°C): " + olaFrio);
        System.out.printf("Temperatura promedio anual: %.2f °C\n", promedio);
    }
}

    

