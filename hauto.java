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
public class hauto {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        final double SUELDO_BASE = 2500.00;
        final double COMISION = 250.00;
        final double PORCENTAJE_UTILIDAD = 0.05;

        int autosVendidos = 0;
        double valorTotalVentas = 0.0;
        double comisionTotal = 0.0;

        System.out.println("=== Registro de ventas de automóviles ===");

        char continuar;
        do {
            System.out.print("Ingrese el valor del automóvil vendido: $");
            double valorAuto = teclado.nextDouble();

            autosVendidos++;
            valorTotalVentas += valorAuto;

            if (valorAuto > 10000) {
                comisionTotal += COMISION;
            }

            System.out.print("¿Desea ingresar otra venta? (s/n): ");
            continuar = teclado.next().toLowerCase().charAt(0);
        } while (continuar == 's');

        double utilidad = valorTotalVentas * PORCENTAJE_UTILIDAD;
        double sueldoFinal = SUELDO_BASE + comisionTotal + utilidad;

        System.out.println("\n=== Informe de pagos al empleado ===");
        System.out.println("Autos vendidos:           " + autosVendidos);
        System.out.printf("Valor total de ventas:    $%.2f\n", valorTotalVentas);
        System.out.printf("Sueldo base:              $%.2f\n", SUELDO_BASE);
        System.out.printf("Total comisiones:         $%.2f\n", comisionTotal);
        System.out.printf("Utilidad (5%% de ventas):  $%.2f\n", utilidad);
        System.out.printf(">>> Sueldo total a pagar: $%.2f\n", sueldoFinal);

      
    }
}

    

