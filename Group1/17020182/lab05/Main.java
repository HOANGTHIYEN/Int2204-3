package lab5_2;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape Tron =  new circle("Blue" , true , 3.5 );
		Shape HCN = new Retangle("Red" , true , 12.5 , 22.2);
		Square Vuong = new Square(4);
		Shape HD = new Shape();
		System.out.println(Tron.toString());
		System.out.println(HCN.toString());
		System.out.println(Vuong.toString());
		System.out.println(HD.toString());
		
		Vuong.setwidth(9);
		System.out.println(Vuong.toString());
		}

}
