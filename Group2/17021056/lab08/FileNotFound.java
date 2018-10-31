/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau2lab08;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class FileNotFound {
     public void readFile(String path) throws FileNotFoundException{
        File file = new File(path);
        Scanner sc = new Scanner(file);
        while(sc.hasNext())
            System.out.println(sc.nextLine());
        sc.close();
    }
    public static void main(String[] args){
        try {
            new FileNotFound().readFile("C:\\Users\\Genius\\Documents\\d.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
