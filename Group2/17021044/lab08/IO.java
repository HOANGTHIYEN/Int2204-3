/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap08_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 *
 * @author Admin
 */
public class IO {
    public static void main(String[] args) {
        try {
            File file = new File("abc.txt");
            file.createNewFile();
            InputStream ip = new FileInputStream(file);
            ip.close();
            ip.read();
            
            
            
        }
        catch(Exception e){
            System.err.println(e);
        }
    }
}
