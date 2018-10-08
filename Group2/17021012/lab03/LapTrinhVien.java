
package tonghopdoituong;


public class LapTrinhVien {
    String tenLTV;
    String id;
    String congviec;
    int tuoi;
    int thoigianlv;
    public LapTrinhVien(String hoten, String id, String cv, int tuoi, int thoigian){
        this.tenLTV=hoten;
        this.id=id;
        this.congviec=cv;
        this.tuoi= tuoi;
        this.thoigianlv= thoigian;
}

    public String getTenLTV() {
        return tenLTV;
    }

    public void setTenLTV(String tenLTV) {
        this.tenLTV = tenLTV;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCongviec() {
        return congviec;
    }

    public void setCongviec(String congviec) {
        this.congviec = congviec;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getThoigianlv() {
        return thoigianlv;
    }

    public void setThoigianlv(int thoigianlv) {
        this.thoigianlv = thoigianlv;
    }
    public void CachLv(){
        System.out.println("Anh ay lam viec kien nhan nhiet tinh va hieu qua");
    }
    
}
