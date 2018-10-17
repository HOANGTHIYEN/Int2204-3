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
public class Rectangle extends Shape {
    
    protected Diem A;
    protected Diem B;
    protected Diem C;
    protected Diem D;
    public double getWidth() {
        return Math.sqrt((A.toaDo_x - D.toaDo_x) * (A.toaDo_x - D.toaDo_x) + (A.toaDo_y - D.toaDo_y) * (A.toaDo_y - D.toaDo_y));
    }
    
    public double getLength() {
       return Math.sqrt((A.toaDo_x - B.toaDo_x) * (A.toaDo_x - B.toaDo_x) + (A.toaDo_y - B.toaDo_y) * (A.toaDo_y - B.toaDo_y));
    }
    public Rectangle() {
        A = new Diem(0.0, 1.0);
        B = new Diem(2.0, 1.0);
        C = new Diem(2.0, 0.0);
        D = new Diem(0.0, 0.0);
    }

    public Rectangle(Diem x, Diem y, Diem z, Diem t) {
        
        
        A = x; B = y; C = z; D = t;
    }

    public Rectangle(boolean dc, String ms, boolean f, Diem x, Diem y, Diem z, Diem t) {
        super(dc, ms, f);
        
        A = x; B = y; C = z; D = t;
    }

    public double getArea() {
        return getWidth() * getLength();
    }

    public double getPerimeter() {
        return 2 * (getWidth() + getLength());
    }

    public String toString() {
        return "Rectangle:\n    Di Chuyen: "
                + diChuyen + "\n   Color: " + getColor() + "\n   Filled: " + isFilled() + "\n   Width: "
                + getWidth() + "\n   Length: " + getLength() + "\n   Area: " + getArea()
                + "\n   Perimeter: " + getPerimeter() + "\n";
    }
}
