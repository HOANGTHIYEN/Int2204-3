package quest3;

public class main {
      static public void main(String[] args)
      {
    	  doctor BS=new doctor("H1431","Lê Văn A","Bệnh viện 198","Răng-hàm-mặt","12/1/1981","37");
    	  congan CA=new congan("C1280","Lê Văn B","Giao thông","Xuân Thủy-Cầu Giấy","25","30 năm");
    	  Sinhvien SV=new Sinhvien("17020602","Đỗ Tuấn Bắc","Đại học Công Nghệ","K62CD","2017","6 năm");
    	  Laptop LT=new Laptop("Asus","GL553VD","Core i7","8GB","1900:1080","Đỗ Tuấn Bắc","24.000.000 VND","30/6","2 năm");
    	  phone PH=new phone("Iphone","6s plus","2GB","600:800","Viettel","01696499321","Đỗ Tuấn Bắc","14,000,000 VND","2017","2 năm");
    	  music MS=new music("Hành tinh song song","Vũ","Vũ","616.319","2018");
    	  dog DG=new dog("Tíu","Đen","Chó cảnh","Đỗ Tuấn Bắc","Xuân Thủy","Trông nhà","Gâu Gâu");
    	  nguoiyeu NY=new nguoiyeu("Unknown","Unknown","Unknown","Unknown");
    	  thuoc TH=new thuoc("Vitamin","Vit5496","50.000 VND","Loãng xương","Không có tác dụng với bệnh khác","2 năm");
          lol LOL=new lol("dotuanbac999","100","2014","3218 ngày","Kayn","20000 IP","0 RP","Vàng");
          
          System.out.println("---------Example---------");
          SV.Info();
          LOL.Info();
          NY.Info();
          LT.Info();
          PH.Info();
          System.out.println("------------End------------");
         
         
          
      }
} 
