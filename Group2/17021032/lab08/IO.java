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
public class IO {
    public static void demo() throws IOException{
        File file= new File("thang.txt");
        file.createNewFile();
        InputStream test = new FileInputStream(file);
        test.close();
        test.read();
       
        
                
    }
    public static void main(String[] args) {
        try {
            demo();
        }
        catch(java.io.IOException err){
            System.err.println(err);
        }
    }
    
}
