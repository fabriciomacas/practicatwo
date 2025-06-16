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
public class doedad {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;
        int contadorMayores = 0;

         
        System.out.println("INGRESE -1 PARA TERMINAR");
        System.out.println("Ingresa edades ");

        do {
            System.out.print("Edad: ");
            edad = teclado.nextInt();

            if (edad >= 18) {
                contadorMayores++;
            }

        } while (edad >= 0);

        System.out.println("Cantidad de personas mayores de edad: " + contadorMayores);

    
    }
}



  
     
