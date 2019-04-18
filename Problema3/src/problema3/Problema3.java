/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

import java.util.Scanner;

/**
 *
 * @author SALAS
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        String nota1;
         String nota2;
          String nota3;
          double prom;
          //Ingreso de notas
    System.out.printf("Ingrese la primer nota del estudiante");
        nota1 = entrada.nextLine();
        System.out.printf("Ingrese la segunda nota del estudiante");
        nota2 = entrada.nextLine();
        System.out.printf("Ingrese la tercer nota del estudiante");
        nota3 = entrada.nextLine();
        //CALCULO DE NOTAS
        
        prom = (Double.parseDouble(nota1) + Double.parseDouble(nota2)
                + Double.parseDouble(nota3))/3;
        //CONDICIONALES
         String respuesta = prom >= 14 ? "Usted paso de año :D"
                 : "Usted no paso de año :S ";
         //RESPUESTA FINAL
         System.out.printf("Su promedio es: %s\n%s\n ",prom,respuesta);
    }
    
}
