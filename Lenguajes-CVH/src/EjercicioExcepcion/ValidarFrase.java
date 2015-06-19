/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioExcepcion;

/**
 *
 * @author Clinton
 */
public class ValidarFrase {
    public static void validar(String palabra) throws FraseException{
        byte arre[]=palabra.getBytes();
        int tamano = arre.length;
        if (tamano<=4 || tamano >=10)throw new FraseException();
    }
    
}
