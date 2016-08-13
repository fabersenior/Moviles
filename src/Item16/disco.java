/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Item16;
import java.util.Scanner;
/**
 *
 * @author microp
 */
public class disco extends publicacion {
    int duracion;

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    @Override
    public void show(){
        System.out.println("Titulo : "+getTitulo());
        System.out.println("Precio : "+getPrecio());
        System.out.println("Duracion en minutos: "+getDuracion());
     }
    
    public void setParam(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el titulo del Disco :");
        setTitulo(lector.next());
        System.out.println("Ingrese el precio del Disco :");
        setPrecio(lector.nextInt());
        System.out.println("Ingrese la duracion en minutos :");
        setDuracion(lector.nextInt());
        
    }
    
}
