/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author Hoangson
 */
public class IOException {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws java.io.IOException {
        // TODO code application logic here
        try{
            File file = new File ("xyz.txt");
            file.createNewFile();
            InputStream is = new FileInputStream(file);
            is.close();
            is.read();
        }
        catch (java.io.IOException e){
            System.out.println(e);
        }
    }
    
}
