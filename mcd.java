/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import java.util.Scanner;


public class mcd {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, b;

        System.out.print("Ingrese el primer número: ");
        a = teclado.nextInt();

        System.out.print("Ingrese el segundo número: ");
        b = teclado.nextInt();

        int menor = Math.min(a, b);

        System.out.println("Los divisores comunes de " + a + " y " + b + "son : ");

        for (int i = 1; i <= menor; i++) {
            if (a % i == 0 && b % i == 0) {
                System.out.println(i);
            }
        }

        
    }
    
}
