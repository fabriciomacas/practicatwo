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
public class mcm { 
            public static void main (String[] args) {
                  Scanner teclado = new Scanner(System.in);
        int num1, num2, mcm;

        System.out.println("Ingrese el primer número:");
        num1 = teclado.nextInt();

        System.out.println("Ingrese el segundo número:");
        num2 = teclado.nextInt();

        int max = Math.max(num1, num2);

        for (int i = max;; i++) {
            if (i % num1 == 0 && i % num2 == 0) {
                mcm = i;
                break; 
            }
        }

        System.out.println("El Mínimo Común Múltiplo de " + num1 + " y " + num2 + " es: " + mcm);
    }
}
                    
    

           
                
            
 



    


