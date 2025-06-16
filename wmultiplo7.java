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
public class wmultiplo7 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0; 

        System.out.print("Ingresa un número entero: ");
        numero = teclado.nextInt();

        while (numero % 7 != 0) {
            System.out.print("Ingresa un número entero: ");
            numero = teclado.nextInt();
        }

        System.out.println("Has ingresado un múltiplo de 7 " );
        
    }
}

    

