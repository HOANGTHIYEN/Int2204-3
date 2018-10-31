/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;

/**
 *
 * @author Hoangson
 */
public class NullPointerException {

    public static void main(String[] args) {
        try{
        Object num = null;
        num.toString();
        }
        catch (java.lang.NullPointerException e){
            System.out.println(e);
        }
    }       
}
