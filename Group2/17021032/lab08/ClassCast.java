/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thangl8b2;

/**
 *
 * @author CCNE
 */
public class ClassCast {
    public static void demo(){
        Object test= "abc";
        int a = (int) test;
        System.out.println(a);
    }
    public static void main(String[] args) {
        try{
            demo();
        }
        catch(java.lang.ClassCastException err){
            System.err.println(err);
        }
    }
    
}
