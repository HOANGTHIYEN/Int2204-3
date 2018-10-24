package lab;

public class Triangle extends Shape {
    private Pos diemA;
    private Pos diemB;
    private Pos diemC;

    public Triangle() {}

    public Triangle(Pos diemA, Pos diemB, Pos diemC) {
        super();
        this.diemA = diemA;
        this.diemB = diemB;
        this.diemC = diemC;
    }

    public Triangle(String color, boolean filled, Pos diemA, Pos diemB, Pos diemC) {
        super(color, filled);
        this.diemA = diemA;
        this.diemB = diemB;
        this.diemC = diemC;
    }

    public Pos getP1() {
        return diemA;
    }

    public void setP1(Pos diemA) {
        this.diemA = diemA;
    }

    public Pos getP2() {
        return diemB;
    }

    public void setP2(Pos diemB) {
        this.diemB = diemB;
    }

    public Pos getP3() {
        return diemC;
    }

    public void setP3(Pos diemC) {
        this.diemC = diemC;
    }

    public int getArea() {
        return Math.abs((diemB.getX() - diemA.getX()) * (diemC.getY() - diemA.getY()) - (diemC.getX() - diemA.getX()) * (diemB.getY() - diemA.getY()));
    }

    public double getPerimeter() {
        return Math.sqrt((diemA.getX() - diemB.getX()) * (diemA.getX() - diemB.getX()) + (diemA.getY() - diemB.getY()) * (diemA.getY() - diemB.getY()))
                + Math.sqrt((diemA.getX() - diemC.getX()) * (diemA.getX() - diemC.getX()) + (diemA.getY() - diemC.getY()) * (diemA.getY() - diemC.getY()))
                + Math.sqrt((diemB.getX() - diemC.getX()) * (diemB.getX() - diemC.getX()) + (diemB.getY() - diemC.getY()) * (diemB.getY() - diemC.getY()));
    }

    public void move(int x, int y) {
        diemA.setX(diemA.getX() + x);
        diemA.setY(diemA.getY() + y);
        diemB.setX(diemB.getX() + x);
        diemB.setY(diemB.getY() + y);
        diemC.setX(diemC.getX() + x);
        diemC.setY(diemC.getY() + y);
    }
     public String toString() {
        return "Triangle : Diem A(" + diemA.getX() + ", "+ diemA.getY() 
                + ") Diem B(" + diemB.getX() + ", "+ diemB.getY() 
                + ") Diem C(" + diemC.getX() + ", "+ diemC.getY()
                + ")  Area : " +getArea() + "\tPerimeter : " + getPerimeter();
    }   
}