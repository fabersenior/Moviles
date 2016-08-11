/*
 *Implemente un programa utilizando clases que permite calcular el área de las siguientes
figuras trigonométricas: círculo, triangulo, cuadro y rectángulo. El programa debe visualizar
un menú para que el usuario seleccione la figura deseada, al entrar en dicho menú se solicitan
los datos necesarios al usuario para ejecutar el cálculo, después de esto debe volver al menú
inicial. 
 */
package Item14;

import java.util.Scanner;

/**
 *
 * @author multi08
 */
public class Item14 {
    public static void main(String[] args) {
        int opcion;
         circulo circle = new circulo();
         triangulo tri1= new triangulo();
         cuadro square = new cuadro();
         rect angle= new rect();
        Scanner lector = new Scanner(System.in);
        do{
            System.out.println("Digite la opción deseada");
            System.out.println("1. Circulo");
            System.out.println("2. Triangulo");
            System.out.println("3. Cuadro");
            System.out.println("4. Rectangulo");
            System.out.println("0. Salir");
            opcion = lector.nextInt();

            switch (opcion){
                case 0: System.out.println("Hasta luego");
                    break;
                case 1: circle.loadDato();
                    break;
                case 2: tri1.loadDato();
                    break;
                case 3: square.loadDato();
                    break;
                case 4: angle.loadDato();
                    break;               
                default: System.out.println("Opción invalida");
            }
        }while(opcion!=0);
    }
}
