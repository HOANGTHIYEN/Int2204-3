package Main;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        // task 1
//        Expression e1 = new Numeral(10);
//        Expression e2 = new Numeral(-1);
//        Expression e3 = new Numeral(2);
//        Expression e4 = new Numeral(3);
//        Expression square = new Square(e1);
//
//        int valueSquare = square.evaluate();
//        Expression e5 = new Numeral(valueSquare);
//        Expression add = new Addition(square,e2);
//        Expression mul = new Multiplication(e4,e3);
//        add = new Addition(add,mul);
//        square = new Square(add);
//        Expression result = new Numeral(square.evaluate());
//        System.out.println(square.toString() + "=" + result.evaluate());

         //task 2
//        try {
//            Expression e1 = new Numeral(10);
//            Expression e2 = new Numeral(0);
//            Division div = new Division(e1,e2);
//            System.out.println(div.evaluate());
//        } catch (ArithmeticException e){
//            System.out.println(e.getMessage());
//        }



//        exercise2

//          Null pointer Exception
        String s;
        s = null;
        try {
            s.length();
        } catch (NullPointerException npe){
            System.out.println(npe.getMessage());
        }

       // ArrayIndexOfBoundException
        try {
            int arr[] = {1, 2, 3, 4, 5};
            for (int i=0; i<=arr.length; i++) {
                if(i == arr.length){
                    throw new ArrayIndexOutOfBoundsException("arr index out of bound Exception");
                }
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

//        ArithmeticException
        try {
            int x = 1;
            int y = 0;
            if(y == 0){
                throw new ArithmeticException("y equals zero");
            }
            System.out.println(x/y);

        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

//        ClassCastException
        try {
            Object a = new Integer(5);
            Object b = new String("adaf");
            a = b;
            if (a == b) {
                throw new ClassCastException("object a can't convert to string object");
            }
        } catch (ClassCastException e) {
            System.out.println(e.getMessage());
        }

//        FileNotFoundException
        BufferedReader br = null;
        String input = "file.txt";
        try {
            FileInputStream fis = new FileInputStream(new File(input));
            br = new BufferedReader(new InputStreamReader(fis));
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }

//        IOException
//        BufferedReader br = null;
//        String input = "/home/sidz/school/ltnc/Int2204-3/Group2/17020998/lab08/";
//        try {
//            FileInputStream fis = new FileInputStream(new File(input));
//            br = new BufferedReader(new InputStreamReader(fis));
//        } catch (IOException e){
//            System.out.println(e.getMessage());
//        }

    }
}
