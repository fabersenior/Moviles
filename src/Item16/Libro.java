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
public class Libro extends publicacion{
    private int pag,fecha;

    public int getPag() {
        return pag;
    }

    public void setPag(int pag) {
        this.pag = pag;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }
    
    @Override
    public void show(){
        System.out.println("Titulo : "+getTitulo());
        System.out.println("Precio : "+getPrecio());
        System.out.println("Numero de Paginas: "+getPag());
        System.out.println("Año de Publicacion : "+getFecha());
        
    }
    public void setParam(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el titulo del libro :");
        setTitulo(lector.next());
        System.out.println("Ingrese el precio del libro :");
        setPrecio(lector.nextInt());
        System.out.println("Ingrese el numero de paginas del libro :");
        setPag(lector.nextInt());
        System.out.println("Ingrese el año de publicacion del libro :");
        setFecha(lector.nextInt());
    }
    
}
