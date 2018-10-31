/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau2lab08;

/**
 *
 * @author Administrator
 */
public class ClassCast {
   
    public String converterS(Object s) throws ClassCastException{
        return (String)s;
    }
    public static void main(String[] args){
        try {
            System.out.println(new ClassCast().converterS(123));
        } catch (ClassCastException e) {
            System.out.println("Không thể biểu diễn số int ");
        }
    }
}


