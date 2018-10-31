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
public class ClassCast {
    public int converterS(Object s) throws ClassCastException{
        return (int)s;
    }
    public static void main(String[] args){
        try {
            System.out.println(new ClassCast().converterS("123"));
        } catch (ClassCastException e) {
            System.out.println(e);
        }
    }
}
