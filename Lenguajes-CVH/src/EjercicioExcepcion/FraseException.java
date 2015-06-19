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
public class FraseException extends Exception {
    public FraseException(){
        super("La Palabra no esta dentro del rango permitido");
    }
}
