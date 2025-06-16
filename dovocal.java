/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/**
 *
 * @author fabri
 */
 import java.util.HashSet;
import java.util.Scanner;
public class dovocal {
    

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        HashSet<Character> vocalesIngresadas = new HashSet<>();
        char letra;

        do {
            System.out.print("Ingresa una letra: ");
            String entrada = teclado.nextLine();

            if (entrada.length() == 0) {
                System.out.println("Entrada vacia. Intenta de nuevo.");
                continue;
            }

            letra = Character.toLowerCase(entrada.charAt(0));

            if (!esVocal(letra)) {
                System.out.println("No es una vocal. Sigue intentando.");
                continue;
            }

            if (vocalesIngresadas.contains(letra)) {
                System.out.println("Vocal repetida El programa termina.");
                break;
            } else {
                vocalesIngresadas.add(letra);
                System.out.println("Vocal nueva: " + letra);
            }

        } while (true);

        
    }

    public static boolean esVocal(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}

    

