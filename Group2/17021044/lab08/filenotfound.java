/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap08_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 *
 * @author Admin
 */
public class filenotfound {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            File file = new File("abc.txt");
            InputStream ip = new FileInputStream(file);
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
    }
    
}
