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
        Libro lib1[]= new Libro[10];
        disco cd1=new disco();
        int opcion;
        Scanner lector = new Scanner(System.in);
        do{
            System.out.println("======MENU======");
            System.out.println("Digite la opción deseada");
            System.out.println("1. Para registrar un Libro");
            System.out.println("2. para registrar un Disco");
            System.out.println("3. Para Mostrar informacion del Libro");
            System.out.println("4. para Mostrar informacion del Disco");
            System.out.println("0. Salir");
            opcion = lector.nextInt();

            switch (opcion){
                case 0: System.out.println("Hasta luego");
                    break;
                case 1: lib1[1]= new Libro(); 
                    lib1[1].setParam();
                        lib1[1].show();
                    break;
                case 2: cd1.setParam();
                        cd1.show();
                    break;
                case 3: //lib1.show();
                    break;
                case 4:
                        cd1.show();
                    break;
                default: System.out.println("Opción invalida");
            }
        }while(opcion!=0);
    }
    
}
