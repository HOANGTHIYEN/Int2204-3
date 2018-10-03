package anmi.com;
/**
 * Đây là lớp phân số vói 2 thuộc tính
 * là tử và mẫu 
 * 
 *
 */
public class PhanSo {
	private int tu;
	private int mau;

	public PhanSo()//contructor mặc định 
	{
		
	}
	public PhanSo (int tu ,int mau)
	//constructor truyền đối số 
	{
		this.tu = tu;
		this.mau = mau ;
	}
	// các phương thức get,set
	public int getTu()
	{
		return this.tu;
	}
	public int getMau()
	{
		return this.mau;
	}
	public void setTu(int tu )
	{
		this.tu = tu ;
	}
	public void setMau (int mau )
	{
		this.mau = mau ;
	}
	public int uocChungLonNhat (int a ,int b)
	//hàm tìm ước chung lớn nhất của tử và mẫu 
	{
		int a1  = Math.abs(a);
		int b1 = Math.abs(b);
		if ( a== b )
			return a ;
		else if (a == 0 || b == 0 )
			return a+b;
		else 
		{
			while ( a1!= b1)
			{
				if ( a1 >b1 )
					a1-=b1;
				else 
					b1-=a1;
			}
			return a1 ;
		}
	}
	public PhanSo toiGian ()
	//hàm tối giản 1 phân số 
	{
		PhanSo phanso = new PhanSo();
		phanso.tu = this.tu/uocChungLonNhat(this.tu, this.mau);
		phanso.mau = this.mau/uocChungLonNhat(this.tu, this.mau);
		return phanso;
	}
	public void hienThi ()
	//hàm hiển thị phân số
	{
		if (this.tu == 0 || this.mau == 1)
			System.out.println( this.tu);
		else if (this.tu *this.mau >0)
			System.out.println(Math.abs(this.tu)+"/"+Math.abs(this.mau));
		else if (this.mau <0)
			System.out.println(-1*this.tu+"/"+Math.abs(this.mau));
		else 
			System.out.println( this.tu+"/"+this.mau);
	}
	// các phương thức cộng trừ nhân chia 2 phân số 
	public PhanSo Cong (PhanSo ps1)
	
	{
		PhanSo phanso = new PhanSo ();
		phanso.tu = this.tu * ps1.mau + ps1.tu *this.mau;
		phanso.mau = this.mau * ps1.mau;
		return phanso;
		
	}
	public PhanSo Tru (PhanSo ps1)
	{
		PhanSo phanso = new PhanSo();
		phanso.tu = this.tu*ps1.mau -ps1.tu*this.mau;
		phanso.mau =this.mau *ps1.mau;
		return phanso;
	}
	public PhanSo Nhan (PhanSo ps1)
	{
		PhanSo phanso = new PhanSo ();
		phanso.tu = this.tu *ps1.tu;
		phanso.mau = this.mau *ps1.mau;
		return phanso;
	}
	
	public PhanSo Chia (PhanSo ps1)
	{
		PhanSo phanso = new PhanSo();
		phanso.tu =this.tu *ps1.mau;
		phanso.mau =this.mau *ps1.tu;
		return phanso;
	}
	// phương thức so sánh 2 phân số 
	public boolean equals (Object obj)
	{
		if ( obj instanceof PhanSo)
		{
			PhanSo other =(PhanSo) obj;
			if (this.tu *other .mau == other.tu *this.mau )
				return true; 
		}
		return false;
		
	}
}
