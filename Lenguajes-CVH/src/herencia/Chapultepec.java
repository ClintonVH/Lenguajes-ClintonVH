/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author T-107
 */
public class Chapultepec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pollo p1=new Pollo();
            p1.setNombre("Pollito Pio");
            
        Leon l1=new Leon();
            l1.setNombre("Simba");
        Leon l2=new Leon();
            l2.setNombre("Mufasa");
        Delfin d1=new Delfin();
            d1.setNombre("Flipper");
        Tortuga t1=new Tortuga();
            t1.setNombre("Crush");
            
         ComportamientoRuido animales[]=new ComportamientoRuido[4];
          animales[0]=p1;
          animales[1]=l1;
          animales[2]=l2;
          animales[3]=d1;
            
       for(ComportamientoRuido animal:animales){
           System.out.println("El animal hace "+animal.hacerRuido());
       }
       
    }
    
}
