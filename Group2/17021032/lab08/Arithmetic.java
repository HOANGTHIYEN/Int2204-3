/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thangl8b2;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author CCNE
 */
public class Arithmetic {
    int a;
    public void demo() {
        a=10/0;
    }
    public static void main(String[] args) {
        try{
            new Arithmetic().demo();
        }
        catch(java.lang.ArithmeticException a){
            System.err.println(a);
            
            
        }
    }
    
}
