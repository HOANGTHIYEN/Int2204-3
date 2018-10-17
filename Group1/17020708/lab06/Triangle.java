/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagram;

/**
 *
 * @author nguyen ngoc gioi
 */
public class Triangle extends Shape {

    Diem A;
    Diem B;
    Diem C;

    public double getAB() {
        return Math.sqrt((A.toaDo_x - B.toaDo_x) * (A.toaDo_x - B.toaDo_x) + (A.toaDo_y - B.toaDo_y) * (A.toaDo_y - B.toaDo_y));
    }

    public double getAC() {
        return Math.sqrt((A.toaDo_x - C.toaDo_x) * (A.toaDo_x - C.toaDo_x) + (A.toaDo_y - C.toaDo_y) * (A.toaDo_y - C.toaDo_y));
    }

    public double getBC() {
        return Math.sqrt((B.toaDo_x - C.toaDo_x) * (B.toaDo_x - C.toaDo_x) + (B.toaDo_y - C.toaDo_y) * (B.toaDo_y - C.toaDo_y));
    }

    public Triangle() {
        A = new Diem(0.0, 0.0);
        B = new Diem(2.0, 0.0);
        C = new Diem(1.0, 1.0);
    }

    public Triangle(Diem x, Diem y, Diem z) {
        A = x;
        B = y;
        C = z;

    }

    public Triangle(boolean dc, String ms, boolean f, Diem x, Diem y, Diem z) {
        super(dc, ms, f);
        A = x;
        B = y;
        C = z;
    }

    public double getArea() {
        double p = (getAB() + getAC() + getBC()) / 2;
        return Math.sqrt(p * (p - getAB()) * (p - getAC()) * (p - getBC()));
    }

    public double getPerimeter() {
        return (getAB() + getAC() + getBC());
    }

    @Override
    public String toString() {
        return "Triangle:\n     Di Chuyen: " + diChuyen + "\n   Color: " + getColor() + "\n   Filled: " + isFilled() + "\n   Side1: "
                + getAB() + "\n   Side2: " + getAC() + "\n   Side3: " + getBC() + "\n   Area: " + getArea()
                + "\n   Perimeter: " + getPerimeter() + "\n";
    }
}
