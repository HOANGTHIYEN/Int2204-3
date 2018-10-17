public class Triangle extends Shape {
    private double side1,size2,side3;


    public Triangle(double side1, double size2, double side3) {
        this.side1 = side1;
        this.size2 = size2;
        this.side3 = side3;
        name = "tam giac";
    }

    public Triangle(ToaDo toaDo, boolean filled, double side1, double size2, double side3) {
        super(toaDo, filled);
        this.side1 = side1;
        this.size2 = size2;
        this.side3 = side3;
        name = "tam giac";
    }

    public Triangle() {
        name = "tam giac";
    }


    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSize2() {
        return size2;
    }

    public void setSize2(double size2) {
        this.size2 = size2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public void setSize (){
        double p = (side1+size2+side3)/2;
        size =  Math.sqrt(p*(p-side1)*(p-size2)*(p-side3));
    }
    public double getSize() {
        return size;
    }
}
