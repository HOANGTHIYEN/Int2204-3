package anhdh;

import anhdh.calculation.Addition;
import anhdh.calculation.Division;
import anhdh.calculation.Multiplication;
import anhdh.calculation.Subtraction;
import com.microsoft.signalr.HubConnection;
import com.microsoft.signalr.HubConnectionBuilder;
import org.codehaus.jackson.map.ObjectMapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ExpressionTest {
    public static void main(String[] args) {
        //method1();
        //method2();
        ExpressionTest expressionTest = new ExpressionTest();
        expressionTest.Test();
    }

    private  void Test(){
        HubConnection hubConnection = null;
        try {
            //hubConnection = HubConnectionBuilder.create("https://localhost:5001/gamehub").withHeader("token", "ahihi").build();
            PlayerEntity playerEntity = new PlayerEntity();
            playerEntity.Name = "anhdh";
            ObjectMapper objectMapper = new ObjectMapper();
            String token = objectMapper.writeValueAsString(playerEntity);
            hubConnection = HubConnectionBuilder.create("http://localhost:5000/gamehub").withHeader("token", token).build();
            HubConnection finalHubConnection = hubConnection;
            hubConnection.start().subscribe(()->{
                finalHubConnection.send("ClientSendAction", "anhdh", "1699", Direction.Bottom);
            });
//            hubConnection.on("send", (message)-> ((Runnable) () -> {
//                System.out.println("receive message" + message);
//                System.out.println("ahihi");
//            }).run(), String.class);

        } catch (Exception e) {
            e.printStackTrace();
        }

        hubConnection.on("ServerSendAction", (user, room) -> {
            System.out.printf("New Message: %s %s%n", user,  room);
        }, String.class, String.class);
        hubConnection.on("ServerSendDirection", (direction) -> {
            int i = (int)(Double.parseDouble(direction.toString()));
            System.out.println(Direction.get(i));
        }, Object.class);

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

enum Direction
{
    Left(1),
    Top(2),
    Right(3),
    Bottom(4);
    private final int id;
    Direction(int id) { this.id = id; }
    public int getValue() { return id; }
    public static Direction get(int id) {
        if(id == 1) return Direction.Left;
        else if(id == 2) return  Direction.Top;
        else if(id == 3) return  Direction.Right;
        else return Direction.Bottom;
    }
}

class PlayerEntity
{
    public String Name ;
    public String ConnectionId;
    public Object Client;
}