/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Item16;

import java.util.Scanner;

/**
 *
 * @author multi08
 */
public class Item16 {
    public static void main(String[] args) {
        Libro lib1= new Libro();
        int opcion;
        Scanner lector = new Scanner(System.in);
        do{
            System.out.println("Digite la opción deseada");
            System.out.println("1. Para registrar un Libro");
            System.out.println("2. para registrar un Disco");            
            System.out.println("0. Salir");
            opcion = lector.nextInt();

            switch (opcion){
                case 0: System.out.println("Hasta luego");
                    break;
                case 1: lib1.setParam();
                    break;
                case 2: 
                    break;                            
                default: System.out.println("Opción invalida");
            }
        }while(opcion!=0);
    }
    
}