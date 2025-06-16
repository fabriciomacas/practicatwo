/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;


import java.util.Scanner;

public class wdpares {
   


   
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        int numero = teclado.nextInt();

        int sumaPares = sumarDigitosPares(numero);

        System.out.println("La suma de los dígitos pares es: " + sumaPares);

        teclado.close();
    }

    public static int sumarDigitosPares(int numero) {
        numero = Math.abs(numero); 
        int suma = 0;

        while (numero > 0) {
            int digito = numero % 10; 
            if (digito % 2 == 0) {
                suma += digito;       
            }
            numero /= 10;             
        }

        return suma;
    }
}









