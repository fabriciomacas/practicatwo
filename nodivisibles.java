/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/**
 *
 * @author fabri
 */
public class nodivisibles {
    public static void main(String[] args) {
        System.out.println("Los numeros que no son divisibles ni por 3 ni por 5 son:");

        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                System.out.print(i + " ");
            }
        }
    }
    
}
