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
public class ifswitchint {
        public static void main (String[] args) {
            double sueldo=0; 
            int categoria;
            
            System.out.println("ingrese el tipo de categoria que desea calcular el sueldo");
            Scanner vrg = new Scanner (System.in);
            categoria = vrg.nextInt();
        
            if (categoria == 1) {
                sueldo = 15890 + (15890 * 0.10);
            }
            else {
                if (categoria == 2){
                sueldo = 25630.89;
                }
                else {
                    if (categoria == 3){
                    sueldo = 35560.20 - (35560.20 * 0.11);
                    }
                    else {
                        System.out.println("debe ingresar un numero de categoria valida");
                    }
                } 
          
            
            
        }
            if (categoria == 1 || categoria == 2 || categoria == 3 ){
            System.out.println("el total para la categoria  " + categoria + " es igual a " + sueldo);

    
}
        }
        
            
        }
