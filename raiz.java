/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import java.util.Scanner;

/**
 *
 * @author fabri
 */
public class raiz {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa un número entero positivo: ");
        int numero = teclado.nextInt();

        int raiz = 0;

        // Vamos probando desde 1 hasta encontrar un cuadrado mayor que el número
        for (int i = 1; i * i <= numero; i++) {
            raiz = i;
        }

        System.out.println("La raíz cuadrada entera de " + numero + " es: " + raiz);
        
    
}
}