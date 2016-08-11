/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Item14;

import java.util.Scanner;

/**
 *
 * @author multi08
 */
public class triangulo {
        private double base,h;

    public double getArea() {
        return (base*h)/2 ;
    }

  
    public void setBase(double a) {
        this.base = a;
    }
    
    public void loadDato(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese la base del triangulo : ");
         setBase(lector.nextDouble());
         System.out.println("Ingrese la altura del triangulo: ");
         h=lector.nextDouble();
         System.out.println("Area : "+getArea());
}
}
