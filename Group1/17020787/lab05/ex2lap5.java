package lap5;

public class ex2lap5 {
    public static void main(String[] args){
        Circle circle=new Circle();
        Rectangle rectangle=new Rectangle();
        Square square=new Square();
        System.out.println(circle.toString());
        System .out.println(" Area:"+circle.getArea()+","+" Perimeter:"+circle.getPerimeter());
        System.out.println(rectangle.toString());
        System .out.println(" Area:"+rectangle.getArea()+","+" Perimeter:"+rectangle.getPerimeter());
        System.out.println(square.toString());
        System .out.println(" Area:"+rectangle.getArea()+","+" Perimeter:"+rectangle.getPerimeter());
        square.setSide(2);
        System.out.println(square.toString());
        System .out.println(" Area:"+square.getArea()+","+" Perimeter:"+square.getPerimeter());
        square.setLength(5);
        System.out.println(square.toString());
        System .out.println(" Area:"+square.getArea()+","+" Perimeter:"+square.getPerimeter());
        square.setWidth(3);
        System.out.println(square.toString());
        System .out.println(" Area:"+square.getArea()+","+" Perimeter:"+square.getPerimeter());



    }
}
