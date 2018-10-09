package fraction;

public class Fraction { // lop phan so de viet cac thuoc tinh cua doi tuong
	private int TS, MS; // 2 thanh vien du lieu tu so va mau so

	public int getTS() { // Truy cap tu so cua doi tuong, tra ve tu so cua doi tuong
		return TS;
	}

	public void setTS(int tS) { // Truy cap tu so cua doi tuong, nhung de gan gia tri tu so cho doi tuong
		TS = tS;
	}

	public int getMS() { // Truy cap mau so cua doi tuong, tra ve mau so cua doi tuong
		return MS;
	}

	public void setMS(int mS) { // Truy cap mau so cua doi tuong, nhung de gan gia tri mau so cho doi tuong
		MS = mS;
	}

	public Fraction(int TS, int MS) { // Contructor nhan 2 tham so tu so,mau so de khoi tao doi tuong
		this.TS = TS;
		this.MS = MS;
		if (this.MS < 0) {
			this.TS = this.TS * -1;
			this.MS = this.MS * -1;
		}

	}

	boolean check() { // Kiem tra xem phan so co dung hay khong
		if (this.getMS() == 0)
			return false;
		else
			return true;
	}

	public int UCLN(int a, int b) { // tim uoc chung lon nhat de toi gian phan so
		a = Math.abs(a);
		b = Math.abs(b);
		if ((a == 0) || (b == 0))
			return a + b;
		while (a != b) {
			if (a > b)
				a = a - b;
			else
				b = b - a;
		}
		return a;
	}

	public void Simplify(Fraction x) { // toi gian phan so
		int i = UCLN(x.getTS(), x.getMS());
		x.setTS(x.getTS() / i);
		x.setMS(x.getMS() / i);

	}

	public Fraction Plus(Fraction x) { // cong
		int tu = this.getTS() * x.getMS() + this.getMS() * x.getTS();
		int mau = this.getMS() * x.getMS();
		Fraction tong = new Fraction(tu, mau);
		Simplify(tong);
		if (tong.getMS() != 1)
			System.out.println(this.getTS() + "/" + this.getMS() + " + " + x.getTS() + "/" + x.getMS() + " = "
					+ tong.getTS() + "/" + tong.getMS());
		else
			System.out.println(
					this.getTS() + "/" + this.getMS() + " + " + x.getTS() + "/" + x.getMS() + " = " + tong.getTS());
		return tong;
	}

	public Fraction Minus(Fraction x) { // tru
		int tu = this.getTS() * x.getMS() - this.getMS() * x.getTS();
		int mau = this.getMS() * x.getMS();
		Fraction hieu = new Fraction(tu, mau);
		Simplify(hieu);
		if (hieu.getMS() != 1)
			System.out.println(this.getTS() + "/" + this.getMS() + " - " + x.getTS() + "/" + x.getMS() + " = "
					+ hieu.getTS() + "/" + hieu.getMS());
		else
			System.out.println(
					this.getTS() + "/" + this.getMS() + " - " + x.getTS() + "/" + x.getMS() + " = " + hieu.getTS());
		return hieu;
	}

	public Fraction Multi(Fraction x) { // nhan
		int tu = this.getTS() * x.getTS();
		int mau = this.getMS() * x.getMS();
		Fraction tich = new Fraction(tu, mau);
		Simplify(tich);
		if (tich.getMS() != 1)
			System.out.println(this.getTS() + "/" + this.getMS() + " x " + x.getTS() + "/" + x.getMS() + " = "
					+ tich.getTS() + "/" + tich.getMS());
		else
			System.out.println(
					this.getTS() + "/" + this.getMS() + " x " + x.getTS() + "/" + x.getMS() + " = " + tich.getTS());
		return tich;
	}

	public Fraction Divi(Fraction x) { // chia
		int tu = this.getTS() * x.getMS();
		int mau = this.getMS() * x.getTS();
		Fraction thuong = new Fraction(tu, mau);
		Simplify(thuong);
		if (thuong.getMS() != 1)
			System.out.println(this.getTS() + "/" + this.getMS() + " / " + x.getTS() + "/" + x.getMS() + " = "
					+ thuong.getTS() + "/" + thuong.getMS());
		else
			System.out.println(
					this.getTS() + "/" + this.getMS() + " / " + x.getTS() + "/" + x.getMS() + " = " + thuong.getTS());
		return thuong;
	}

	public boolean equals(Fraction x) { // sosanh
		
		if(x instanceof Fraction )
		{
		if (this.getTS() * x.getMS() == this.getMS() * x.getTS()) {
			System.out.println(this.getTS() + "/" + this.getMS() + " = " + x.getTS() + "/" + x.getMS());
			return true;
		} else {
			System.out.println(this.getTS() + "/" + this.getMS() + " # " + x.getTS() + "/" + x.getMS());
			return false;
		}
		
		}
     return false;
	}

}
