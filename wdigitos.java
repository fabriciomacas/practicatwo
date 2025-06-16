/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import java.util.Scanner;


public class wdigitos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingresa un número entero: ");
        int numero = teclado.nextInt();

        int contador = contarDigitos(numero);

        System.out.println("El número tiene " + contador + " dígito(s).");
        
        
            
        }
        public static int contarDigitos(int numero) {
        numero = Math.abs(numero); 

        if (numero == 0) {
            return 1;
        }

        int contador = 0;
        while (numero > 0) {
            numero /= 10;
            contador++;
        }

        return contador;
}
}