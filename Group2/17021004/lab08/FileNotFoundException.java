/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 *
 * @author Hoangson
 */
public class FileNotFoundException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            File file = new File("CuocSongMa.txt");
            InputStream is = new FileInputStream(file);
            
        }
        catch (java.io.FileNotFoundException e){
            System.out.println(e);
        }
        // TODO code application logic here
    }
    
}
