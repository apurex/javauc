/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejemplo;

import java.io.PrintStream;
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
        
        //Programa de Encriptacion Simple
        
        String str;
        String aux = "";
        char[] n;
        
        Scanner entrada = new Scanner(System.in);
        
        //Inicio Programa
        
        do {
            
            System.out.println("Bienvenido a SimpleEncrip \n");
            System.out.println("Por Favor Introdusca la palabra a Encriptar o 'Salir' para cerrar \n");
            
            str = entrada.nextLine();
            
            n = str.toCharArray();
            
            for (int i = 0; i < n.length ; i++) {
                
                n[i]+=2;
                
            }
            
            aux = String.valueOf(n);
            
            System.out.println(aux + "\n");
            System.out.println("Encriptacion Finalizada \n");
            
        } while (!str.equals("salir"));
        
        

    }
    
}
