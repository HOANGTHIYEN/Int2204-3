/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau2p6_Lap8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author Nguyễn Thái
 */
public class FileNotFoundEx {
    
    public static void main(String[] args)throws FileNotFoundException{
        try {
            File file = new File("thaht.txt");
            file.createNewFile();
            InputStream input = new FileInputStream(file);
            input.close();
            
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
