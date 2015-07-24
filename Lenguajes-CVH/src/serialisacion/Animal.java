/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialisacion;

import java.io.*;
/**
 *
 * @author T-107
 */
public class Animal implements Serializable{//serializable es para que la clase s epueda comprimir en arreglo de bytes
    String nombre;
    boolean carnivoro;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isCarnivoro() {
        return carnivoro;
    }

    public void setCarnivoro(boolean carnivoro) {
        this.carnivoro = carnivoro;
    }
    
}