package lab08;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 123456789
 */
public class NullPointerException {
    public static void main(String[] args){
        // TODO code application logic here
        try{
        Object obj = null;
        obj.getClass();
        }
        catch (java.lang.NullPointerException e){
            System.out.println(e);
        }
    }       
}
