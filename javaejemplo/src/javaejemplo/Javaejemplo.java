/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejemplo;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class Javaejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int edad;
        String nom;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Probando Git");
        System.out.println("Como es Tu nombre  ");
        nom = entrada.nextLine();
        System.out.println(" Hola " + nom);
        
        
        
    }
    
}
