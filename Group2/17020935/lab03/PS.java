public class PS {
    private int tu, mau;
 
    public PS(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }
     
     public int getTu() {
        return tu;
    }
 
    public void setTu(int tu) {
        this.tu = tu;
    }
 
    public int getMau() {
        return mau;
    }
 
    public void setMau(int mau) {
        this.mau = mau;
    }
 
    public int timUCLN(int a, int b){
	if(a<0)a=0-a;
	if(b<0)b=0-b;
	while(a!=b){
            if(a>b)a=a-b;
            if(a<b)b=b-a;
	}
	return a;
    }
     
    public void toiGianPhanSo() {
        int i = timUCLN(this.getTu(), this.getMau());
        if((this.getTu()<0 ) && (this.getMau()<0))
	{
             this.setTu(-this.getTu() / i);
             this.setMau(-this.getMau() / i);
	}
	else {
		this.setTu(this.getTu() / i);
        	this.setMau(this.getMau() / i);
		}
	
    }
     
    public void cong(PS ps) {
        int ts = this.getTu() * ps.getMau() + ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        PS phanSoTong = new PS(ts, ms);
        phanSoTong.toiGianPhanSo();
        System.out.println(phanSoTong.tu + "/" + phanSoTong.mau);
    }
      
    public void tru(PS ps) {
        int ts = this.getTu() * ps.getMau() - ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        PS phanSoHieu = new PS(ts, ms);
        phanSoHieu.toiGianPhanSo();
        System.out.println( phanSoHieu.tu + "/" + phanSoHieu.mau);
    }
     
    public void nhan(PS ps) {
        int ts = this.getTu() * ps.getTu();
        int ms = this.getMau() * ps.getMau();
        PS phanSoTich = new PS(ts, ms);
        phanSoTich.toiGianPhanSo();
        System.out.println(phanSoTich.tu + "/" + phanSoTich.mau);
    }
     
    public void chia(PS ps) {
        int ts = this.getTu() * ps.getMau();
        int ms = this.getMau() * ps.getTu();
        PS phanSoThuong = new PS(ts, ms);
        phanSoThuong.toiGianPhanSo();
        System.out.println(phanSoThuong.tu + "/" + phanSoThuong.mau);
    }
     public boolean equals(Object obj){    
	if(obj instanceof PS){
            PS other=((PS)obj);
            int a=this.tu*other.getMau();
            int b=this.mau*other.getTu();
            if(a==b) return true;
            else return false;
	}
	else return false; 
    }
	public static void main(String[] args) {
        PS phanSo1=new PS(-1,2);    
        PS phanSo2=new PS(-1,3); 
         
        
        phanSo1.cong(phanSo2);
        phanSo1.tru(phanSo2);
        phanSo1.nhan(phanSo2);
        phanSo1.chia(phanSo2);
	System.out.println(phanSo1.equals(phanSo2));
    }
	
}
