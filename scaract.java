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
public class scaract {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa un solo carácter: ");
        char c = teclado.next().toLowerCase().charAt(0); 

        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Es una vocal.");
                break;
            default:
                if (Character.isLetter(c)) {
                    System.out.println("Es una consonante.");
                } else {
                    System.out.println("Es un símbolo o no es una letra.");
                }
                break;
        }

    }
    
}
