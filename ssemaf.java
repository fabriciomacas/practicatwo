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
public class ssemaf {
     public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa el estado del semáforo (verde, amarillo, rojo): ");
        String estado = teclado.nextLine().toLowerCase(); 

        switch (estado) {
            case "verde":
                System.out.println("Puedes avanzar.");
                break;
            case "amarillo":
                System.out.println(" Disminuye la velocidad.");
                break;
            case "rojo":
                System.out.println("Detente. No avances.");
                break;
            default:
                System.out.println("Estado no reconocido. Ingresa verde, amarillo o rojo.");
        }

       
    
    
}
}
