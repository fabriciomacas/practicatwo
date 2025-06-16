/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/**
 *
 * @author fabri
 */
public class dopot {
    public static void main(String[] args) {
        int exponente = 0;
        int resultado;

        System.out.println("Tabla de potencia de 2 hasta superar 1000:");
       

        do {
            resultado = (int) Math.pow(2, exponente);
            System.out.println("2^" + exponente + " = " + resultado);
            exponente++;
        } while (resultado <= 1000);
    }
}
