/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author T-107
 */
public class GeneradorDeusuarios {
    /*Los collection tienen el potencial de usarse para construir prototipos de base de datos NoSQL
    otra caracteristica de los collections es que tienen clases y metodos de ordenamiento*/
    private List<Usuario> usuarios;
    public GeneradorDeusuarios(){
        Usuario u1=new Usuario("Cris", 20, "cris_ctjmvr@hotmail.com");
        Usuario u2=new Usuario("Jess", 19, "axojes@hotmail.com");
        Usuario u3=new Usuario("Pepe", 22, "pepe@gmail.com");
        Usuario u4=new Usuario("Pamcha",60,"pancha@hotmail.com");
        usuarios=new ArrayList<Usuario>();
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        usuarios.add(u4);
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    public String agregarUsuario(String nombre, int edad, String email){
        Usuario u=new Usuario(nombre, edad, email);
        usuarios.add(u);
        return "Usuario agregado con exito";
    }
}