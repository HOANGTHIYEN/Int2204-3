package tuan5;

public class main1 {
    public static void main(String[] args) {
    	QuaTao quatao = new QuaTao("Việt Nam","20/11/2018","1 tấn","50k/kg");
    	QuaCam quacam = new QuaCam("Việt Nam","19/06/2018","0.5 tấn","");
    	CamSanh camsanh = new CamSanh("Hà Nam", "19/06/2018", "0.3 tấn", "60k/kg");
    	CamCaoPhong camphong = new CamCaoPhong("Hà Nội", "19/06/2018", "0.2 tấn", "45k/kg");
    	
    	System.out.println("Thông tin quả táo:");
    	quatao.HoaQua();
    	System.out.println("\nThông tin quả cam:");
    	quacam.HoaQua();
    	System.out.println("\nThông tin quả cam sành:");
    	camsanh.HoaQua();
    	System.out.println("\nThông tin quả cam cao phong:");
    	camphong.HoaQua();
    }
}
