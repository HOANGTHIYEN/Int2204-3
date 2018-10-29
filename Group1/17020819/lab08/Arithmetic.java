package Bai2;

public class Arithmetic {
    public int Div(int a, int b) throws ArithmeticException{        //khai báo 1 ngoại lệ
        return a/b;
    }
    public static void main(String[] args){

        try {
            Arithmetic arith = new Arithmetic();
            System.out.println(arith.Div(5, 0));
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
