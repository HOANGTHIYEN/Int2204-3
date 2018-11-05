package community.com;


public class Test {

	public static void main(String[] args) {
		
		//// TODO Auto-generated method stub
		Numeral num1 = new Numeral (10);
		Numeral num2 = new Numeral (2);
		Numeral num3  =new Numeral (3);
		Numeral num4 = new Numeral (0);
		Numeral num5 =new Numeral (1);
	
		
		Square square = new Square (num1);
	
	
	
		Subtraction  sub  = new Subtraction(square , num5);
		Multiplication mul = new Multiplication(num2, num3);
		Addition add = new Addition (sub,mul);
		Square square1 = new Square (add);
		System.out.println(square1.toString()+"="+square1.evaluate());
		Division div = new Division (square1,num4);
		System.out.println(div.toString()+"="+div.evaluate());
		
		
	}

}
