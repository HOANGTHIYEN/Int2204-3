/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_c2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileNotFound {
    public static void main(String args[]) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("jahdjahf.txt"));
        System.out.println("Luong binh thuong...");
    }
}