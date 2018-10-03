public class PS {
	//Khoi tao tham so
	private int Tu;
	private int Mau;
	
	public void setTu(int a) {
		this.Tu = a;
	}
	public int getTu() {
		return Tu;
	}
	public void setMau(int b) {
		this.Mau = b;
	}
	public int getMau() {
		return Mau;
	}
	
	Public PSo(int a, int b) {
		this.Tu = a;
		this.Mau = b;
	}
	
	//Cac phuong thuc
	public PSo RutgonPS(PSo P0) {
		public int UCLN(int a, int b) {
		if (a<0) a=0-a;
		if (b<0) b=0-b;
		while (a != b) {
			if (a<b) b=b-a;
			else if (a>b) a=a-b;
			}
		return a;
		}
		int temp=P0.Tu;
		P0.Tu=P0.Tu/UCLN(P0.Tu,P0.Mau);
		P0.Mau=P0.Mau/UCLN(temp,P0.Mau);
		return P0;
	}
	
	public PSo CongPS(PSo P1, PSo P2) {
		PSo PStemp = new PSo();
		PStemp.Tu=P1.Tu*P2.Mau + P1.Mau*P2.Tu;
		PStemp.Mau=P1.Mau*P2.Mau;
		PStemp=RutgonPS(PStemp);
		return PStemp;
	}
	
	public PSo TruPS(PSo P1, PSo P2) {
		PSo PStemp = new PSo();
		PStemp.Tu=P1.Tu*P2.Mau - P1.Mau*P2.Tu;
		PStemp.Mau=P1.Mau*P2.Mau;
		PStemp=RutgonPS(PStemp);
		return PStemp;
	}
	public PSo NhanPS(PSo P1, PSo P2) {
		PSo PStemp = new PSo();
		PStemp.Tu=P1.Tu*P2.Tu;
		PStemp.Mau=P1.Mau*P2.Mau;
		PStemp=RutgonPS(PStemp);
		return PStemp;
	}
	public PSo ChiaPS(PSo P1, PSo P2) {
		PSo PStemp = new PSo();
		PStemp.Tu=P1.Tu*P2.Mau;
		PStemp.Mau=P1.Mau*P2.Tu;
		PStemp=RutgonPS(PStemp);
		return PStemp;
	}
	
	public boolean equals(Object obj){                                  
        if(obj instanceof PSo){
			PSo abc = (PSo)obj;
            if(this.getMau() * abc.getTu() == this.getTu() * abc.getMau()){
                    return true;
                }
            }
                return false;
    }
} 