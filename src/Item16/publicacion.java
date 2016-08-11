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
public class publicacion {
    private String titulo;
    private int Precio;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPrecio() {
        return Precio;
    }
    
    public void show(){
             //Scanner lector = new Scanner(System.in);
        System.out.println("Titulo : "+getTitulo());
        System.out.println("Precio : "+getPrecio());
    }
    
}
