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
public class cuadro {
        private double lado;

    public double getArea() {
        return lado*lado ;
    }

  
    public void setLado(double a) {
        this.lado = a;
    }
    
    public void loadDato(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Digite un lado del cuadrado : ");
         setLado(lector.nextDouble());
         System.out.println("Area : "+getArea());
}
}
