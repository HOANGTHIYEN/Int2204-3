/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap8;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 *
 * @author Admin
 */
public class FileNotFound {
    public static void main(String[] args) {
        try
        {
            File file = new File("FileTest.txt");
            InputStream fileInput = new FileInputStream(file);
        }
        catch (java.io.FileNotFoundException e){
            System.out.println(e);
        }
    }
}
