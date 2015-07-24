/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.*;

/**
 *
 * @author Clinton
 */
import java.util.*;

/**
 *
 * @author T-107
 */
public class ProbarArreglos {
    public static void main(String[] args) {
        GeneradorDeusuarios generadora=new GeneradorDeusuarios();
                            generadora.agregarUsuario("Chana", 18, "chana@gmail.com");
          ArrayList<Usuario> usuarios= (ArrayList<Usuario>)  generadora.getUsuarios();
                              System.out.println(usuarios.size());
        for(Usuario u:usuarios){
            System.out.println(u.getNombre()+"edad: "+ u.getEdad()+" email: "+u.getEmail());
        }
    }
}