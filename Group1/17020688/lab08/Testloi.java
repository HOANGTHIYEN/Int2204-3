/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testloi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author My PC
 */
public class Testloi {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    
    
    public static void main(String[] args ) throws IOException
    {String obj=null;
    System.out.println(obj.length());
        try {
            Object tt=null;
            tt.hashCode();
            
           
        } catch (NullPointerException t) {
            System.out.println();
            t.printStackTrace();
        }
        int a[]=new int[]{2,2,5,6};
        int b=a[9];
        System.out.println(b);
        int c=1/0;
        System.out.println(c);
        double x=10;
       
       try {
           int q=(int) x;
        } catch (Exception e) {
        }
       
        
        
        
        
        
        
        // TODO code application logic hereIOException
    {
        // TODO code application logic here
        File f=new File("C:\\Program Files\\Synaptics\\SynTP\\DellTouchpad35.ex");
        try {
            FileInputStream fi=new FileInputStream(f);
            BufferedReader fo=new BufferedReader(new InputStreamReader(fi));
            
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
        
        
        
        
        
        
    }
    
    
    }

    
}
