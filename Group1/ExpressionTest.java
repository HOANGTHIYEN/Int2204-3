package com.lab07.bai01;

public class ExpressionTest {

	public static void main(String[] args) {
		//tinh ket qua (10^2-1+2*3)^2
		  Square square = new Square(new Numeral(10)); // 10 x 10
		  Subtraction subtraction = new Subtraction(square, new Numeral(1));
		  Multiplication multiplication = new Multiplication(new Numeral(2), new Numeral(3));
		  Addition addition = new Addition(subtraction, multiplication);
		  Square square1 = new Square(addition);
	        try{
	            Division division = new Division(new Numeral(5), new Numeral(0));
	            System.out.println(division.evaluate());
	        }
	        catch (ArithmeticException e){
	            System.out.println("Lỗi chia cho 0!");
	        }
	        System.out.println(square.toString());
	        System.out.println(subtraction.toString());
	        System.out.println(multiplication.toString());
	        System.out.println(addition.toString());
	        System.out.println(square1.toString());
	    }

	}


