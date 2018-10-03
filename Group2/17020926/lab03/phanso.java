package lab03;
import java.util.Scanner;
public class phanso {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PS ps1 = new PS();
		Scanner sc = new Scanner(System.in);
		ps1.setA(sc.nextInt());
		ps1.setB(sc.nextInt());
		System.out.println(ps1.Ps());
		sc.close();
	}

}

