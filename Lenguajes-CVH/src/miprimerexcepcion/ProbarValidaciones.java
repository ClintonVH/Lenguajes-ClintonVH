/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimerexcepcion;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Clinton
 */
public class ProbarValidaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad=15;
       
           System.out.println("Vamos a validar tu edad"); 
        try {
            ValidarEdad.validar(edad);
            System.out.println("si me ves no se lanzo la excepcion");
        } catch (MenordeEdadException ex) {
            System.out.println(ex.getMessage());
        } catch(NumberFormatException ex){
            System.out.println("metiste letras y no un numero tonto");
        }
          
       
        
        
    }
    
}
