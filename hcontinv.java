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
public class hcontinv {
   
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuantos productos desea procesar? ");
        int n = teclado.nextInt();
        teclado.nextLine(); 

        String[] productos = new String[n];
        int[] cantidades = new int[n];

        int totalReposicion = 0;

        System.out.println("Ingreso de productos ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nombre del producto #" + (i + 1) + ": ");
            productos[i] = teclado.nextLine();

            System.out.print("Cantidad en stock: ");
            cantidades[i] = teclado.nextInt();
            teclado.nextLine(); 

            if (cantidades[i] < 5) {
                int reponer = 5 - cantidades[i];
                totalReposicion += reponer;
                System.out.println("→ Añadir a orden de reposicion (" + reponer + " unidades)");
            } else {
                System.out.println("→ Stock suficiente\n");
            }
        }

        System.out.println(" Resumen de reposicion");
        for (int i = 0; i < n; i++) {
            if (cantidades[i] < 5) {
                int reponer = 5 - cantidades[i];
                System.out.println(productos[i] + ": reponer " + reponer + " unidad(es)");
            }
        }

        System.out.println("Total de unidades a reabastecer: " + totalReposicion);
       
    }
}

    

