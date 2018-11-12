/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Admin
 */
public class Lab_09 {

    /**
     * @param path
     * @return 
     */
    public static String readContentFromFile(String path){
        String s="";
        try {
            FileInputStream input=new FileInputStream(path);
            BufferedReader br=new BufferedReader(new InputStreamReader(input));
            try {
                s=br.readLine();
            } catch (IOException ex) {
                Logger.getLogger(Lab_09.class.getName()).log(Level.SEVERE, null, ex);
            }
         
        }catch (FileNotFoundException ex) {
            Logger.getLogger(Lab_09.class.getName()).log(Level.SEVERE, null, ex);
        }
       return s;
    }
    public static void writeContentToFile(String s){
        File f = new File(s);
        try(PrintWriter p = new PrintWriter(f)){
            p.println("qwewe");
            p.println("adsfgf");
        }
        catch (Exception e) {
            
        }
    }
    public static void writeContentToFile1(String s)
    {
        File f = new File(s);
        try (
            FileWriter fw = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            )
        {
            pw.println("asd");
            pw.println("asd");
        }
        catch(Exception e){
            
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Lab_09.readContentFromFile("input.txt"));
        Lab_09.writeContentToFile("o.txt");
       if(findFileByName("E:\\Program Files\\lab_09", "o.txt") != null)
            System.out.println(findFileByName("E:\\Program Files\\lab_09", "o.txt"));
    }
    
}
