package com.lab05.bai02;

public class Main {
	public static void main(String[] args) {
           Circle htron= new Circle(1.0,"mau vang",true);
           System.out.println(htron);
           Square hvuong=new Square(6,"mau trang",true);
           System.out.println(hvuong);
           hvuong.setLength(3);
           System.out.println(hvuong);
           Rectangle hcnhat= new Rectangle(4,5,"mau xanh",true);
           System.out.println(hcnhat);
	}

}
