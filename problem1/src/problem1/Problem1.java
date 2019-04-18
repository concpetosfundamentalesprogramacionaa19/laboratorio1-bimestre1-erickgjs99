/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem1;

import java.util.Scanner;

/**
 *
 * @author SALAS
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int horas;
        double sueldo;
        double sueldoTotal;
        double desc;
        double total;
        System.out.printf("Ingrese por favor las horas trabajadas\n");
        horas = (int) entrada.nextDouble();
        System.out.printf("Ingrese el valor a pagar por hora trabajadas\n");
        sueldo = entrada.nextDouble();
        sueldoTotal = (horas * sueldo);
        desc = sueldoTotal * 0.10;
        total = sueldoTotal - desc;
        
       System.out.printf("El valor mensual a pagar de salario es:%s\n ",total);
       
        // TODO code application logic here
}}
