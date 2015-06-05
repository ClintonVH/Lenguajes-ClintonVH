/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

/**
 *
 * @author Clinton
 */
public class ProbarArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //formas de declarar arreglos
        //       1
       int x[]={1,45,-12,7};
       //        2
       int []y=new int[5];
       y[0]=34;
       y[1]=12;
       y[2]=45;
       //        3
       int z[]=new int[]{3,-12,9};
       //--------------------------------
       String hola="hola";
       for(int i=0;i<x.length;i++){
           System.out.println("Elemento "+i+" tiene el valor de "+x[i]);
       }
       for(int m:x){
       System.out.println("este elemento tiene un valor "+ m);
       }
       
       byte []algo = hola.getBytes();
       for(byte m:algo){
        System.out.print((char)m);
       }
       //-----------------------------------------------------
       
    }
    
}
