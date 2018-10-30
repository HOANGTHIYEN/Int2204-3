/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab082;

/**
 *
 * @author Genius
 */
public class NullPointer {
    String s;
    public void print() throws NullPointerException{
        System.out.println(s.length());
    }
    public static void main(String[] args){
        try {
            new NullPointer().print();
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}
