/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau2p4_Lap8;

/**
 *
 * @author Nguyễn Thái
 */
public class ClassCastEx {
    public String chuyendoi(Object s) throws ClassCastException{
        return (String)s;
    }
    public static void main(String[] args){
        try {
            System.out.println(new ClassCastEx().chuyendoi("abc"));
        } catch (ClassCastException e) {
            System.out.println("Không biểu diễn số nguyen ");
        }
    }
}
