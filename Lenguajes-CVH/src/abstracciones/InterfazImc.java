/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

http://github.com/daton/lenguajes-juancm
http://github.com/curso-lenguajes/lenguajes


investigar los tipos de clases wrapper en java.
 */
package abstracciones;

/**
 *
 * @author T-107
 */
public class InterfazImc {
 public static void main(String []oso){
  Imc indice=new  Imc(1.68f,80);
    System.out.println("Tu IMC es: "+indice.calcula_imc());
   
     //primitivos integrales
    byte b=2;
    short s=2;
    int i=2;
    long l=2;
    b=(byte)s;
    s=b;
    i=(int)l;
    i=s;
    s=(short)i;
            
    float f=2.0f;
    double d=2.0;
    
    boolean valor=false;
    
    Imc otro=new Imc();
     System.err.println(otro.isFlaco());
 }
    
     
     
    
}



