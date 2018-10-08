package lab03;
import java.util.Scanner;
public class bai03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		xemay x1 = new xemay();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap hang: ");
		x1.setHang(sc.nextLine());
		System.out.print("Nhap mau: ");
		x1.setMau(sc.nextLine());
		System.out.print("Nhap phan khoi: ");
		x1.setPhankhoi(sc.nextLine());
		System.out.println("Thong tin cua xe: ");
		x1.getInfo();
		sc.close();
	}

}
