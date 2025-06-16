/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import java.util.Scanner;


public class sestacion {
     public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa el número del mes (1-12): ");
        int mes = teclado.nextInt();
        String estacion;

        switch (mes) {
            case 3:
            case 4:
            case 5:
                estacion = "Primavera";
                break;
            case 6:
            case 7:
            case 8:
                estacion = "Verano";
                break;
            case 9:
            case 10:
            case 11:
                estacion = "Otoño";
                break;
            case 12:
            case 1:
            case 2:
                estacion = "Invierno";
                break;
            default:
                estacion = "Mes inválido. Ingresa un número entre 1 y 12.";
        }

        System.out.println("Estación del año: " + estacion);
    
}
}
