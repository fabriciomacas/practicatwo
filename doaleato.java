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

public class doaleato {
   

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleat = new Random();

        System.out.print("Ingresa el total mínimo que deseas alcanzar: ");
        int minimo = teclado.nextInt();

        int suma = 0;
        int numero;


        do {
            numero = aleat.nextInt(100) + 1; 
            suma += numero;
            System.out.println("Se generó: " + numero + " → Suma actual: " + suma);
        } while (suma < minimo);

        System.out.println(" Suma final: " + suma);
    

}
}