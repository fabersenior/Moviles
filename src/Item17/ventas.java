/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Item17;
import Item16.*;
/**
 *
 * @author microp
 */
public class ventas extends publicacion{
    private int vent[]={0,23,54,14,25}; 
    
    void Mostrar(){
        
        for(int i=0;i<vent.length;i++){
            System.out.println("Venta #"+vent[i]);            
        }
    }
    
}
