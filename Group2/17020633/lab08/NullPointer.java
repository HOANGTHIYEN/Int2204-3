/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08.pkg2;

/**
 *
 * @author Dell
 */
public class NullPointer {
 public void String(String a) throws NullPointerException
 {      System.out.println(a.length());
 }
    public static void main(String[] args) {
    try
    {      String a =null;
        new NullPointer().String(a);   
    }
    catch(NullPointerException e)
    {   System.out.println("chưa khởi tạo đói tượng");
    }
        }
   
 
} 