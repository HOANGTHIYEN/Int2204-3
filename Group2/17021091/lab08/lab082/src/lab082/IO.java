/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab082;

import java.io.IOException;

/**
 *
 * @author Genius
 */
public class IO {
    public void write() throws IOException{
        throw new IOException();
    }
    public static void main(String[] args){
        try {
            new IO().write();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}