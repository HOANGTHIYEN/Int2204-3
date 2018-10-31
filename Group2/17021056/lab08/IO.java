/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau2lab08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

/**
 *
 * @author Administrator
 */
public class IO {
    public static void main (String args[]) throws IOException{
        try{
            File file = new File ("abc.txt");
            file.createNewFile();
            OutputStream i = new FileOutputStream(file);
            i.close();
            i.write(7);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
