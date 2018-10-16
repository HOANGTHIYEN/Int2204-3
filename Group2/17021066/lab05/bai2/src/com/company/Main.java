package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    circle cir= new circle(3.0,"vang",true);
    System.out.println(cir.toString()+ "\n"+ cir.getArea());
    rectangle rec= new rectangle(3.0,4.0,"do",true);
    System.out.println(rec.toString()+"\n"+rec.getArea());
    square squ= new square(5.0);
    System.out.println(squ.toString()+"\n"+squ.getArea());
    }
}
