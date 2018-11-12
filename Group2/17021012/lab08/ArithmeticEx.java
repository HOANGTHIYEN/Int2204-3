/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau2p3_Lap8;

/**
 *
 * @author Nguyễn Thái
 */
public class ArithmeticEx {
    public int Division(int num1,int num2) throws ArithmeticException
    {   
        return num1/num2;
    }
    public static void main(String[] args){
        try {
            System.out.println(new ArithmeticEx().Division(28, 0));
        } 
        catch (ArithmeticException e) {
            System.out.println(e);
        }
   
    
}
}
