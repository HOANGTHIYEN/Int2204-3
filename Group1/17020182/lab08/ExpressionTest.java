package lab8;

public class ExpressionTest extends Exception{
	public static void main(String[] args)  {
		Expression A =	new Numeral(2);
		Expression B =	new Numeral(0);
//		Expression S = new Numeral(12);
//		Expression kq;
//		Expression mu = new Square(A);
//		System.out.println(" A = : "+ A.evaluate() + " B = : " + B.evaluate() + " S = : " + S.evaluate());
//		kq=new Addition(A, S);
//		System.out.println("tong 2 so A va S " + kq.evaluate());
//		kq = new Multiplication(A,S);
//		System.out.println("tich 2 so A va S " + kq.evaluate());
//		kq = new Subtraction(S,A);
//		System.out.println("hieu 2 so S - A :" + kq.evaluate());
//		System.out.println("binh phuong cua A :" + mu.evaluate());
//		
	
		// sử lý ngoại lệ khi số chia là 0
		try {
			Expression thuong =  new Division(A, B);
			System.out.println(thuong.toString());
			System.out.println(thuong.evaluate());
			
		} catch (ArithmeticException e) {
			// TODO: handle exception   
			System.out.println("Loi chia cho 0" + e.getLocalizedMessage());
		}
		
		/*------------------------------------*/
		
		Expression Q =	new Numeral(10);
		Expression W =	new Numeral(1);
		Expression E = new Numeral(2);
		Expression R =	new Numeral(3);
		Expression  BP,Tru,Nhan,Cong,Tru2;
		
		BP = new Square(Q);
		Tru = new Subtraction(BP, W);
		Nhan = new Multiplication(E, R);
		Cong = new Addition(BP, Nhan);
		Tru2 = new Subtraction(Cong, W);
		Expression BinhPhuong = new Square(Tru2);
		System.out.print("("+BP.toString() + " - " + W.toString()+" + "+Nhan.toString()+")^2 = ");
		
		Square kq = new Square(new Addition(new Subtraction(new Square(Q), W), new Multiplication(E, R)));
		
		System.out.println(kq.evaluate());
		//System.out.print(BinhPhuong.evaluate());
	}

	
}