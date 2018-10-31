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
 * @author 123456789
 */
public class FileNotFoundException {
    public static void main(String[] args){
        // TODO code application logic here
        try{
            File file = new File("Error.txt");
            InputStream input = new FileInputStream(file);
        }
        catch (java.io.FileNotFoundException e){
            System.out.println(e);
        }
        
    }
}
