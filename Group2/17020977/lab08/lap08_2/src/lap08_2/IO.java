/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap08_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author Admin
 */
public class IO {
        public void write() throws IOException{
            {
                File file =new File("file.txt");
                InputStream input=new FileInputStream(file);
                input.close();
                input.read();
                
            }
    }
    public static void main(String[] args){
        try {
            new IO().write();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
