import javax.sound.midi.Soundbank;
import java.io.*;

public class main {
    public static void main(String[] args) {
        Expression numeral = new Numeral(10);
        Expression numeral2 = new Numeral(1);
        Expression numeral3 = new Numeral(2);
        Expression numeral4 = new Numeral(3);
        Expression square1 = new Square(numeral);
        Expression substraction1 = new Substraction(square1, numeral2);
        Expression multiplication1 = new Multiplication(numeral3, numeral4);
        Expression addition1 = new Addition(substraction1, multiplication1);
        Expression square2 = new Square(addition1);
        System.out.println(square2.toString());
        Expression result = new Numeral(square2.evaluate());
//        System.out.println(result.toString());
        System.out.println(result);

        Expression numeral5 = new Numeral(0);
        try {
            Division division = new Division(numeral, numeral5);
            System.out.println(division.evaluate());
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }

        //Null Point Exception
        String str;
        str = null;
        try {
            if(str == null){
                throw new NullPointerException("Null Point Exception");
            }
        }
        catch(NullPointerException nullPoint){
            System.out.println(nullPoint.getMessage());
        }

        // Array Index Of Bound Exception
        try {
            int[] arr = {1, 20, 1999};
            for (int i = 0; i < arr.length; i++) {
                if (i == arr.length + 20) {
                    throw new ArrayIndexOutOfBoundsException("Array Index Of Bound Exception");
                }
                System.out.println(arr[i]);
            }
        }
        catch(ArrayIndexOutOfBoundsException array){
            System.out.println(array.getMessage());
        }

        //Arithmetic Exception
        int x = 20;
        int y = 0;
        try{
            if(y == 0){
                throw new ArithmeticException("Arithmetic Exception");
            }
            int resultOfDivision = x/y;
            System.out.println(resultOfDivision);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        //Class Cast Exception
//        Object number = new Integer(20);
//        Object string = new String("hanh");
//        System.out.println((int)string);
//            throw new ClassCastException("Class Cast Exception");

        //IO Exception
        BufferedReader bufferedReader = null;
        String input = " ";
        try{
            FileInputStream fis = new FileInputStream(new File(input));
            bufferedReader = new BufferedReader(new InputStreamReader(fis));
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
