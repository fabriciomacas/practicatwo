/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica;

import java.util.Scanner;



public class Practica {
    public static void main (String[] args) {
        System.out.println("Ingrese el numero del mes");
        Scanner teclado = new Scanner(System.in);
        int numeroMes = teclado.nextInt();
        
        String nombreMes;
        
        switch (numeroMes) {
            case 1: nombreMes = "Enbero";
            break;
            case 2: nombreMes = "Febrero";
            break;
            case 3: nombreMes = "Marzo";
            break;
            case 4: nombreMes = "Abril";
            break;
            case 5: nombreMes = "Mayo";
            break;
            case 6: nombreMes = "Junio";
            break;
            case 7: nombreMes = "Julio";
            break;
            case 8: nombreMes = "Agosto";
            break;
            case 9: nombreMes = "Septiembre";
            break;
            case 10: nombreMes = "Octubre";
            break;
            case 11: nombreMes = "Noviembre";
            break;
            case 12: nombreMes = "Diciembre";
            break;
            
            default: nombreMes = "Nombre de mes invalido";
            break;
                    
}
        System.out.println("el nombre del mes es:" + nombreMes);
        
            
        
           }
          
           
       }




