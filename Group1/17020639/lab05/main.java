package javaapplication3;

public class main {

    public static void main(String[] args) {
        Circle a = new Circle(3, "red", true);
        System.out.println(a.toString());
        Rectangle b = new Rectangle(3, 4);
        System.out.println(b.toString());
        Square c = new Square();
        System.out.println(c.toString());
        c.setWidth(9);
        System.out.println(c.toString());
      //  Cam_sanh cam=new Cam_sanh("141000d/kg","Trung Quoc","12/01","411");
       // Cam_sanh.print(cam);

    }
    
}
