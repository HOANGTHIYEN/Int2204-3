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
public class ArrayIndexOfBound {
    int a[]= {1,2,12};
    public void demo() {
        a[4]=0;
    }
    public static void main(String[] args) {
        try{
            new ArrayIndexOfBound().demo();
        }
        catch(java.lang.ArrayIndexOutOfBoundsException err){
            System.err.println(err);
        }
    }
    
    
}
