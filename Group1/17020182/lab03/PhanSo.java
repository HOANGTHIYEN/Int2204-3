package lab3_2;


public class PhanSo {
	
	public int TuSo;
	public int MauSo;
	
	public int getTuSo() {
		return TuSo;
	}
	public void setTuSo(int tuSo) {
		this.TuSo = tuSo;
	}
	public int getMauSo() {
		return MauSo;
	}
	public void setMauSo(int mauSo) {
		this.MauSo = mauSo;
	}
	PhanSo(){
		this.TuSo=0;
		this.MauSo=0;
	}
	
	public static int  USCLN(int a,int b){
		if(b==0) return a;
		if(b==0) return b;
		return USCLN(b,a%b); //a mod b
	}
	

	//tong 2 phan so
	public  PhanSo Cong2PS(PhanSo a)
	{
		PhanSo c =new PhanSo();
		c.TuSo= a.TuSo *this.MauSo + this.TuSo * a.MauSo;
		c.MauSo=a.MauSo*this.MauSo;
		return c;
	}
	//hieu 2 phan so
	public  PhanSo Tru2PS(PhanSo a)
	{
		PhanSo c =new PhanSo();
		c.TuSo= a.TuSo *this.MauSo - this.TuSo * a.MauSo;
		c.MauSo=a.MauSo*this.MauSo;
		return c;
	}
	//tich hai phan so
	public  PhanSo Nhan2PS(PhanSo a)
	{
		PhanSo c =new PhanSo();
		c.TuSo=a.TuSo*this.TuSo;
		c.MauSo=a.MauSo*this.MauSo;
		return c;
	}
	//thuong 2 phan so
	public  PhanSo Chia2PS(PhanSo a)
	{
		PhanSo c =new PhanSo();
		c.TuSo=a.TuSo*this.MauSo;
		c.MauSo=a.MauSo*this.TuSo;
		return c;
	}
	//in phan so
	public static void InPhanSo(PhanSo a)
	{
		a.TuSo = a.TuSo/USCLN(a.TuSo, a.MauSo);
		a.MauSo = a.MauSo/USCLN(a.TuSo, a.MauSo);
		System.out.println(a.TuSo + "/" + a.MauSo );
	}
	//so sanh hai phan so
	public boolean equals(Object obj)
	{
		PhanSo a = (PhanSo) obj;
		if(a.TuSo*this.MauSo==this.TuSo*a.MauSo)
		{
			return true;
		}
		else return false;
	}
	//ham chinh
	public static void main(String[] args) {
		//khoi tao phan so
		PhanSo a =new PhanSo();
		PhanSo b =new PhanSo();
		PhanSo c =new PhanSo();
		
		//khoi tao phan so

		a.setTuSo(-5);
		a.setMauSo(3);
		b.setTuSo(5);
		b.setMauSo(-3);
		
		System.out.println(" Cho hai phan so ban dau la : ");
		InPhanSo(a);
		InPhanSo(b);
		
		System.out.println("--------------------------------");
		// cong tru nhan chia 2 phan so
		
		System.out.print(" Tong 2 Phan So La :  ");
		InPhanSo(a.Cong2PS(b));
		
		System.out.print(" Hieu 2 Phan So La :  ");
		InPhanSo(a.Tru2PS(b));
		
		System.out.print(" Tich 2 Phan So La :  ");
		InPhanSo(a.Nhan2PS(b));
		
		System.out.print(" Thuong 2 Phan So La :  ");
		InPhanSo(a.Chia2PS(b));
		
		//so sanh 2 phan so
		if(a.equals(b)==true)
		{
			System.out.println("Hai phan so bang nhau");
		}
		else System.out.println("Hai phan so khac nhau");
	}

}
