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
public class NullPointer {
    String string;
    public void demo() throws NullPointerException{
        System.out.println(string.length());
    }
    public static void main(String[] args) {
        try{
            new NullPointer().demo();
            
        }
        catch(java.lang.NullPointerException string){
            System.err.println(string);
        }
    }
    
}
