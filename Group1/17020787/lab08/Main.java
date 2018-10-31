package lap8_2;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public int arithmeticException(int a, int b) throws ArithmeticException{
        return a/b;
    }
    public void exception(Object a)throws ClassCastException{
        int b;
        b=(int) a;
        System.out.println(b);

    }
    public void readFile(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner sc = new Scanner(file);
        while(sc.hasNext())
            System.out.println(sc.nextLine());
        sc.close();
    }
    public void readfilef(String paths) throws IOException{
        File file = new File(paths);
        Scanner sc = new Scanner(file);
            String n;
            n = sc.nextLine();
            System.out.println(n);

    }

    public static void main(String[] args) throws IOException{
        Main ar=new Main();

        try {
            ar.arithmeticException(5,0);
        } catch (ArithmeticException ari){
           ari.printStackTrace();
        }

        nullPointerException nullPointerException1=new nullPointerException();
        Array array=new Array();
            int[] arr = new int[0];

            try {
                array.print(arr, -1);
            } catch (ArrayIndexOutOfBoundsException e){
                e.printStackTrace();
            }

            try {
                ar.exception("12535");
            }catch (ClassCastException cla){
               cla.printStackTrace();
            }

            try {
            nullPointerException1.print();
                }catch (NullPointerException nul){
                    nul.printStackTrace();
        }

        String path="C:\\Users\\Admin\\Documents\\vie.txt";
            try {
                ar.readFile(path);
            }catch (FileNotFoundException f){
                f.printStackTrace();
            }

            try {
                ar.readfilef("C:\\Users\\Admin\\Documents\\mklhf.txt");
            } catch (IOException e){
               e.printStackTrace();
            }
        }
    }
