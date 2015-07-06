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
public class ExamenParcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ExcepcionLibros {
        // TODO code application logic here
        Libros libros[]=new Libros[2];
        
        Profesor profesor=new Profesor();
        Alumno alumno=new Alumno();
        Externo e=new Externo();
        
        alumno.setLibro(libros);
        profesor.setLibro(libros);
        e.setLibro(libros);
        
        Prestamo p=new Prestamo();
        p.prestarLibros(alumno);
        
        
    }
    
}
