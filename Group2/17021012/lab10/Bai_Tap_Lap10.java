/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_lap10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Nguyễn Thúy
 */
public class Bai_Tap_Lap10 {

    public List <String> getAllFunctions(File path) throws FileNotFoundException{
        List <String> list = new ArrayList<> ();
        Scanner sc = new Scanner(path);
        while(sc.hasNext()){
            String str = sc.nextLine();
            if(str.indexOf('=') == -1 && str.contains("static"))
            {
                if(str.endsWith(")") || str.endsWith("{")){
                    int Mo_Ngoac = 1;
                    while(Mo_Ngoac != 0){
                        String str1 = sc.nextLine();
                        if(str1.indexOf('{') != -1)
                            Mo_Ngoac ++;
                        if(str1.indexOf('}') != -1)
                            Mo_Ngoac --;
                        str = str + "\n" + str1;
                    }
                    if(str.contains("*/")){
                        str = str.replace("*/", "");
                    }
                    if(str.contains("/*")){
                        str = str.replace("/*", "");
                    }
                    list.add(str);
                }
            }    
        }
        sc.close();
        return list;
    }
    public String findFunctionByName(String name) throws FileNotFoundException{
        List <String> list = new ArrayList <String> ();
        File path = new File("C:\\Users\\User\\Documents\\NetBeansProjects\\Bai_Tap_Lap10\\src\\bai_tap_lap10\\Utils.java");
        list = new Bai_Tap_Lap10().getAllFunctions(path);
        String nameFunction = name.substring(0, name.indexOf('('));
        String[] cacThamSo = name.substring(name.indexOf('(') + 1, name.indexOf(')')).split(",");
        for(String j : list){
            if(j.contains(nameFunction)&& j.indexOf('(') > j.indexOf(nameFunction)){
                boolean check = true;
                String truongBien = j.substring(j.indexOf('(') + 1, j.indexOf(')'));
                String[] cacBien = truongBien.split(",");
                for(int k = 0;k < cacBien.length;k ++){
                    cacBien[k] = cacBien[k].trim();
                    if(cacBien[k].indexOf(' ') != -1)
                        cacBien[k] = cacBien[k].substring(0, cacBien[k].indexOf(' '));
                }
                if(cacBien.length == cacThamSo.length){
                    for(int k = 0;k < cacBien.length; k ++)
                        if(!cacBien[k].equals(cacThamSo[k])){
                            check = false;
                            break;
                        }
                }
                else
                    check = false;
                if(check == true)
                    return j;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        List <String> list = new ArrayList <String> ();
        File path = new File("C:\\Users\\User\\Documents\\NetBeansProjects\\Bai_Tap_Lap10\\src\\bai_tap_lap10\\Utils.java");
        
        try {
            list = new Bai_Tap_Lap10().getAllFunctions(path);
            for(String j : list)
                System.out.println("Ham:\n" + j);
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
       
        try {
            System.out.println(new Bai_Tap_Lap10().findFunctionByName("readContentFromFile(String)"));
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
    
}
