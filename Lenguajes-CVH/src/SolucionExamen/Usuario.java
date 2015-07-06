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
public class Usuario {
    private String Nombre;
    private Libros libro[];

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Libros[] getLibro() {
        return libro;
    }

    public void setLibro(Libros[] libro) {
        this.libro = libro;
    }
    public void prestar() throws ExcepcionLibros{
        
    }
    
}
