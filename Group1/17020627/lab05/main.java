package tuan5;

public class main {
    public static void main(String[] args) {
    	QuaTao quatao = new QuaTao("Mỹ","10/07/2018","10 tấn","50k/kg");
    	QuaCam quacam = new QuaCam("Việt Nam","10/07/2018","50 tấn","50k/kg");
    	CamSanh camsanh = new CamSanh("Vĩnh Long", "10/07/2018", "20 tấn", "60k/kg");
    	CamCaoPhong camphong = new CamCaoPhong("Hòa Bình", "10/07/2018", "20 tấn", "40k/kg");
    	
    	System.out.println("Thông tin táo:");
    	quatao.HoaQua();
    	System.out.println("\nThông tin cam:");
    	quacam.HoaQua();
    	System.out.println("\nThông tin cam sành:");
    	camsanh.HoaQua();
    	System.out.println("\nThông tin cam cao phong:");
    	camphong.HoaQua();
        
        
        
    }
}
