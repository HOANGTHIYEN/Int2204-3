package javaapplication3;

public class bai_tap_2 {

    public static void main(String[] args) {
       Square c1 = new Square(4.0,"red",true);
       c1.setLength(5.0);
        System.out.println(c1.toString());
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
    }
    
}
