/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author admin
 */
public class Triangle extends Shape{
    private double side_a;
    private double side_b;
    private double side_c;
    
    
    public Triangle(double a, double b, double c, String n, boolean i, double x, double y){
        super(n,i,x,y);
        this.side_a = a;
        this.side_b = b;
        this.side_c = c;       
    }
    
}
