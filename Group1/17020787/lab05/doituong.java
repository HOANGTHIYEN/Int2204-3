 class hoaqua{
    private double gia,soluong;
    private  String nguongoc,ngaynhap;

     public double getGia() {
         return gia;
     }

     public void setGia(double gia) {
         this.gia = gia;
     }

     public double getSoluong() {
         return soluong;
     }

     public void setSoluong(double soluong) {
         this.soluong = soluong;
     }

     public String getNguongoc() {
         return nguongoc;
     }

     public void setNguongoc(String nguongoc) {
         this.nguongoc = nguongoc;
     }

     public String getNgaynhap() {
         return ngaynhap;
     }

     public void setNgaynhap(String ngaynhap) {
         this.ngaynhap = ngaynhap;
     }
 }
 class Quacam extends hoaqua{
    private String loaiqua="qua cam";
     private double thue;

     public String getLoaiqua() {
         return loaiqua;
     }

     public void setLoaiqua(String loaiqua) {
         this.loaiqua = loaiqua;
     }

     public double getThue() {
         return thue;
     }

     public void setThue(double thue) {
         this.thue = thue;
     }


    public double tiennhap(){
        return getSoluong()*getGia()+getSoluong()*getGia()*thue/100;
    }
 }
 class Quatao extends  hoaqua{
    private String loaiqua="qua tao";
    private String chebien="got vo an";
    private double protein=0.1;
    public double han (){
        double i= protein*getSoluong()*50;
        return i;
    }
 }
 class Camcaophong extends Quacam{
    private double han;

     public double getHan() {
         return han;
     }

     public void setHan(double han) {
         this.han = han;
     }

 }
 class Camsanh extends Quacam{
    private String chu_y;

     public String getChu_y() {
         return chu_y;
     }

     public void setChu_y(String chu_y) {
         this.chu_y = chu_y;
     }
 }
