/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteprincipal;
import paquete1.*;
import paquete2.*;
import paquete3.*;

/**
 *
 * @author SALAS
 */
public class Principal {
    public static void main(String[] args){
        String resultado = Miclase1.edad > 18 ? "mayor edad" : "menor edad";
        
        System.out.printf("Nombres: \n\t%s\nApellido: \n\t%s\nEdad: \n\t%d y %s"
                , Miclase2.nombre, Miclase3.apellidos, Miclase1.edad, resultado);
                
    }
}
