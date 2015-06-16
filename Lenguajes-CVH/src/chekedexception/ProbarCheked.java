/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chekedexception;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Administrador
 */
public class ProbarCheked {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception,IOException,FileNotFoundException{
        // TODO code application logic here
        File f=new File("archivaldo");
       
            FileOutputStream fos=new FileOutputStream(f);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
       
        
    }
    
}
