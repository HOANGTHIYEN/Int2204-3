/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau2p1_Lap8;

/**
 *
 * @author Nguyễn Thái
 */
public class NullPointerEx {
    public void String(String str) throws NullPointerException
 { 
     System.out.println("Do dai cua xau la: " + str.length());
 }
    public static void main(String[] args) {
    try
    {      
        //String str ="Nguyen Hong Thai";
        String str = null;
        new NullPointerEx().String(str);   
    }
    catch(NullPointerException e)
    {   
        System.out.println("Chua khoi tao xau" + e.getMessage());
    }
        
    }
   
}
