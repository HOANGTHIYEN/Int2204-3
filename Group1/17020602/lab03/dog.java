package quest3;

public class dog {
        private String ten,mau,loaicho,chu,vitri,nhiemvu,sua;

		public dog(String ten, String mau, String loaicho, String chu, String vitri, String nhiemvu, String sua) {
			super();
			this.ten = ten;
			this.mau = mau;
			this.loaicho = loaicho;
			this.chu = chu;
			this.vitri = vitri;
			this.nhiemvu = nhiemvu;
			this.sua = sua;
		}
		public void Info()
		{
			System.out.println("---Dog---");
			System.out.println("Tên chó : "+ten);
			System.out.println("Màu : "+mau);
			System.out.println("Loài chó : "+loaicho);
			System.out.println("Chủ : "+chu);
			System.out.println("Nhiệm vụ : "+nhiemvu);
			System.out.println("Sủa : "+sua);
			System.out.println("");
			
		}
		public String getTen() {
			return ten;
		}

		public void setTen(String ten) {
			this.ten = ten;
		}

		public String getMau() {
			return mau;
		}

		public void setMau(String mau) {
			this.mau = mau;
		}

		public String getLoaicho() {
			return loaicho;
		}

		public void setLoaicho(String loaicho) {
			this.loaicho = loaicho;
		}

		public String getChu() {
			return chu;
		}

		public void setChu(String chu) {
			this.chu = chu;
		}

		public String getVitri() {
			return vitri;
		}

		public void setVitri(String vitri) {
			this.vitri = vitri;
		}

		public String getNhiemvu() {
			return nhiemvu;
		}

		public void setNhiemvu(String nhiemvu) {
			this.nhiemvu = nhiemvu;
		}

		public String getSua() {
			return sua;
		}

		public void setSua(String sua) {
			this.sua = sua;
		}
}
