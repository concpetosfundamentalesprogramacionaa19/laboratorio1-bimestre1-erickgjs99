/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg2;

import java.util.Scanner;

/**
 *
 * @author SALAS
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        String x;
        String y;
        String z;
        double part1;
        double part2;
        double result;
        
        System.out.printf("Ingrese el valor de x");
        x = entrada.nextLine();
        
         System.out.printf("Ingrese el valor de y");
        y = entrada.nextLine();
        
         System.out.printf("Ingrese el valor de z");
        z = entrada.nextLine();
        
        double entradax = Double.parseDouble(x);
        double entraday = Double.parseDouble(y);
        double entradaz = Double.parseDouble(z);
        
        part1 = entradax + (entraday/entradaz) ;
        part2 = entradax - (entraday/entradaz) ;
        result = part1 / part2;
        
        System.out.printf("El resultado de m =  %s\n", result);
    }
    
}
