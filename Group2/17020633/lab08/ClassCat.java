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
public class ClassCat {
   
    public int converterS(Object s) throws ClassCastException{
        return (int)s;
    }
    public static void main(String[] args){
        try {
            System.out.println(new ClassCat().converterS("nono"));
        } catch (ClassCastException e) {
            System.out.println("Không thể bieu diễn kieu string ");
        }
    }
}