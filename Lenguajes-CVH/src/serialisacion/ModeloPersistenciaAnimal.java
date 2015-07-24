/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialisacion;

import java.io.*;
public class ModeloPersistenciaAnimal {
    String ruta="D:\\animalitos.clin";
    public void guardar (Animal animal)throws Exception{
        //paso1 crear el archivo donde se guaradara el animal
        File file=new  File(ruta);
        FileOutputStream fos=new FileOutputStream(file);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(animal);
        System.out.println("Animalito enlatado listo para llevar");
    }
    public Animal buscarTodos()throws Exception{
       Animal a=new Animal();
       File f=new File(ruta);
       FileInputStream fis=new FileInputStream(f);
       ObjectInputStream ois=new ObjectInputStream(fis);
       a =(Animal) ois.readObject();
       
        return a;
        
    }
}