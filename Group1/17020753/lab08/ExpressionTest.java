package lab08;

public class ExpressionTest {

	public static void main(String[] args) {
		// (10*10 - 1 + 2*3) * (10*10 - 1 + 2*3)
		System.out.println("kq phep tinh la: " + (10*10-1+2*3)*(10*10-1+2*3));
		
	 int x= new Square(
		          new Addition(
		        	   new Subtraction(
		        			 new Square(new Numeral(10))  ,  new Numeral(1)
		        	   ) 
		          ,    new Multiplication(
		        		  new Numeral(2)    , new Numeral(3)
		        	   )
		         )
			 ).evaluate();	
	 
	 System.out.println("ket qua:"+x);
	
	 
	 Expression ex = new Addition(
      	       new Subtraction(
      			 new Square(new Numeral(10))  ,  new Numeral(1)
      	          ) 
                  ,    new Multiplication(
      		       new Numeral(2)    , new Numeral(3)
      	        )
               );
	 Expression sq = new Square(ex);
	 System.out.println(sq.toString(ex));
	 
	 
	 try { 
		 int k =  10/0;
		System.out.println(k);
	 } catch (ArithmeticException  e) {
		    System.out.println("lỗi phép tính " + e);
	  }
	 
	 
	 System.out.println(new Addition(new Numeral(8), new Division(new Numeral(4), new Numeral(6))) );
	 
	}
	
	
	
}
