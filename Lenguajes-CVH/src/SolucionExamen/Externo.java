/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SolucionExamen;

/**
 *
 * @author Clinton
 */
public class Externo extends Usuario{
    @Override
    public void prestar() throws ExcepcionLibros{
        if(getLibro().length > 1)throw new ExcepcionLibros();
    }
    
    
}
