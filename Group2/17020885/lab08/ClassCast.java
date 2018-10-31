/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

/**
 *
 * @author Administrator
 */
public class ClassCast {
   
    public int converterS(Object s) throws ClassCastException{
        return (int)s;
    }
    public static void main(String[] args){
        try {
            System.out.println(new ClassCast().converterS("nono"));
        } catch (ClassCastException e) {
            System.out.println("Không thể bieu diễn kieu string ");
        }
    }
}
