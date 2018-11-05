/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08.pkg2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
 /**
 *
 * @author Administrator
 */
public class IO {
    
    public static void main(String[] args){
        try {
            File file = new File("a.txt");
            file.createNewFile();
            OutputStream i = new FileOutputStream(file);
            i.close();
            i.write(5);
        } catch (IOException e) {
        }
    }
}

