/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau2p5_Lap8;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Nguyễn Thái
 */
public class IOEx {
    public void write(String path, int n) throws IOException{
        File file = new File(path);
        try (PrintWriter output = new PrintWriter(file)) {
            output.print(n);
        }
    }
    public static void main(String[] args){
        try {
            new IOEx().write("thainht.txt", 28);
        } 
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
