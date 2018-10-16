public class main{
    public static void main(String[] args){
        Square a = new Square();
        Circle b = new Circle();
        Rectangle rectangle = new Rectangle(4,6, "blue", true);
        System.out.println(rectangle.toString());
        a.setSide(1);
        System.out.println(a.getSide());
    }
}