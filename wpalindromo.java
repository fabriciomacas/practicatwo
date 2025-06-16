/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/**
 *
 * @author fabri
 */
 import java.util.Scanner;

public class wpalindromo {
   
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa un numero entero: ");
        int numero = teclado.nextInt();

        if (esPalindromo(numero)) {
            System.out.println("El numero es un palindromo.");
        } else {
            System.out.println("El numero no es un palindromo.");
        }

        
    }

    public static boolean esPalindromo(int numero) {
        int original = Math.abs(numero);  
        int invertido = 0;
        int temporal = original;

        while (temporal > 0) {
            int digito = temporal % 10;
            invertido = invertido * 10 + digito;
            temporal /= 10;
        }

        return original == invertido;
    }
}

    
