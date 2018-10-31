/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thangl8b2;
import java.io.*;
/**
 *
 * @author CCNE
 */
public class FileNotFound {
  
    public static void main(String[] args)throws  IOException{
        try {
        File file= new File("thangKKLLKLJKJKM,LDFDJKSDFSDFJK.txt");
        InputStream test = new FileInputStream(file);
        test.close();
        }
        catch(java.io.FileNotFoundException err){
            System.err.println(err);
        }
    }
    
}
