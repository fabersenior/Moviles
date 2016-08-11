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
public class circulo {
    private double radio;

    public double getArea() {
        return Math.PI*radio*radio ;
    }

  
    public void setRadio(double a) {
        this.radio = a;
    }
    
    public void loadDato(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Digite el radio : ");
         setRadio(lector.nextDouble());
         System.out.println("Area : "+getArea());
}
    
    
}
