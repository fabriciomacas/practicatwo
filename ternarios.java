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
public class ternarios {
        public static void main (String[] args) {
            System.out.println("INDIQUE EL PROMEDIO CON COMA");
            double promedio;
            String condicionFinal;
            
            Scanner teclado = new Scanner(System.in);
            System.out.println("ingrese el promedio egenral del alumno");
            promedio =  teclado.nextDouble();
             
            condicionFinal = promedio >= 6 ? "Aprobado" : "Desaprobado";
            System.out.println("el resultado de la cf es: " + condicionFinal);
            
                    
        }

    
}
