package anhdh;

import anhdh.calculation.Addition;
import anhdh.calculation.Division;
import anhdh.calculation.Multiplication;
import anhdh.calculation.Subtraction;
import com.microsoft.aspnet.signalr.HubConnection;
import com.microsoft.aspnet.signalr.HubConnectionBuilder;

import java.util.ArrayList;

public class ExpressionTest {
    public static void main(String[] args) {
        //method1();
        //method2();
        ExpressionTest expressionTest = new ExpressionTest();
        expressionTest.Test();
    }

    private  void Test(){
        try {
            HubConnection hubConnection = new HubConnectionBuilder().withUrl("http://raddevus-001-site1.btempurl.com/Pawns").build();
            hubConnection.start();
//            hubConnection.on("send", (message)-> ((Runnable) () -> {
//                System.out.println("receive message" + message);
//                System.out.println("ahihi");
//            }).run(), String.class);
            hubConnection.on("Send", (message)-> {
                System.out.println("receive message" + message);
                System.out.println("ahihi");
            }, TestSignal.class);

            hubConnection.send("LEN", "Abc");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void method1() {
        Numeral number10 = new Numeral();
        Numeral number2 = new Numeral();
        Numeral number1 = new Numeral();
        Numeral number22 = new Numeral();
        Numeral number3 = new Numeral();

        number1.setValue(1);
        number2.setValue(2);
        number22.setValue(2);
        number3.setValue(3);
        number10.setValue(10);

        //Khoi tao expressions
        Square square1 = new Square();
        Square square2 = new Square();
        Subtraction sub = new Subtraction();
        Multiplication mul = new Multiplication();
        Addition add = new Addition();

        //Tinh
        System.out.println("Gia tri bieu thuc can tinh la: ");
        square1.setExpression(number10);
        sub.setExpression(square1, number1);
        mul.setExpression(number2, number3);
        add.setExpression(sub, mul);
        square2.setExpression(add);
        System.out.println(square2.toString() + "=" + square2.evaluate());
    }

    public static void method2() {
        Numeral number10 = new Numeral();
        Numeral number0 = new Numeral();
        number10.setValue(10);
        number0.setValue(0);
        Division division = new Division();
        division.setExpression(number10, number0);
        try {
            division.evaluate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}

class TestSignal{
    public  String H;
    public  String M;
    public  ArrayList<Integer> A;
    public  int I;
}