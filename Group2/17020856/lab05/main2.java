package tuan5.bai2;

public class main2 {
    public static void main(String[] args) {
        Shape sh = new Shape();
        sh.setColor("red");
        sh.setFilled(true);
        System.out.println(sh.toString());

        Circle cir = new Circle();
        cir.setColor("Blue");
        cir.setFilled(true);
        cir.setRadius(1.0);
        System.out.println(cir.toString());

        Rectangle rec = new Rectangle();
        rec.setColor("Green");
        rec.setFilled(false);
        rec.setWidth(1.0);
        rec.setLength(1.0);
        System.out.println(rec.toString());

        Square sqr = new Square();
        sqr.setColor("yellow");
        sqr.setFilled(true);
        sqr.setSide(1.0);
        sqr.setWidth(1.0);
        sqr.setLength(1.0);
        System.out.println(sqr.toString());
    }
}
