/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;


import java.io.*;
public class Utils {
    public static String readContentFromFile(String path) throws IOException {
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String string;
        while((string = bufferedReader.readLine())!= null){
            System.out.println(string);
        }
        bufferedReader.close();
        return null;
    }
    public static void writeContentToFile(String path) throws  IOException{
        File file = new File(path);
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Tu da xoa");
        bufferedWriter.close();
    }
        public static void writeContentToFileAdd(String path) throws  IOException{
        File file = new File(path);
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.newLine();
        bufferedWriter.write("them3");
        bufferedWriter.close();
    }
    public static File findFileByName(String folderPath, String fileName){
        File file = new File(folderPath);
        if(file.isDirectory()){
            String[] list = file.list();
            for (String string : list)
            {
                if (string.equals(fileName))
                {
                    return new File(folderPath+"\\"+fileName);
                }
            }
        }
        return null;
    }
    public static void main(String[] args) throws IOException{
            System.out.printf(readContentFromFile("C:\\Users\\Dep trai\\Desktop\\Test.txt")+"\n");
//      writeContentToFile("C:\\Users\\Dep trai\\Desktop\\Test.txt");
        writeContentToFileAdd("C:\\Users\\Dep trai\\Desktop\\test.txt");
        System.out.println(findFileByName("C:\\Users\\Dep trai\\Desktop","Test.txt"));
    }
}