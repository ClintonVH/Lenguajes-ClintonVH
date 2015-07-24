/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialisacion;

/**
 *
 * @author T-107
 */
public class Zoologico {
    public static void main(String[] args)throws Exception {
        
        ModeloPersistenciaAnimal modelo=new ModeloPersistenciaAnimal();
        Animal a=new Animal();
        a =  modelo.buscarTodos();
     
        System.out.println(a.getNombre());
    }
    
}
