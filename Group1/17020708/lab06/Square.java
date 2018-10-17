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
public class Square extends Rectangle{
    
    public double getSide(){
        return Math.sqrt((A.toaDo_x - B.toaDo_x) * (A.toaDo_x - B.toaDo_x) + (A.toaDo_y - B.toaDo_y) * (A.toaDo_y - B.toaDo_y));
      
    }
    public Square(){
        A = new Diem(0.0, 1.0);
        B = new Diem(1.0, 1.0);
        C = new Diem(1.0, 0.0);
        D = new Diem(0.0, 0.0);
    }
    public Square(boolean dc, String ms, boolean f, Diem x, Diem y, Diem z, Diem t){
        super(dc, ms, f, x, y, z, t);
    }
    
        
        
    public String toString(){
        return "Square:\n     Di Chuyen: "+ 
                diChuyen+"\n   Color: "+getColor()+"\n   Filled: "+ isFilled() + "\n   Width: "+getWidth()+
                "\n   Length: "+getLength()+"\n   Area: " +getArea()+"\n   Perimeter: "+ getPerimeter()+"\n";
    }
}
