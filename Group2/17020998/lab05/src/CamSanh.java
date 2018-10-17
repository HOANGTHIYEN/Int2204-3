public class CamSanh extends QuaCam{
    private String nguonGoc;
    private String ngayNhap;
    private int giaBan1kg;
    protected int soCanBan1ngay;

    public int getGiaBan1kg() {
        return giaBan1kg;
    }

    public void setGiaBan1kg(int giaBan1kg) {
        this.giaBan1kg = giaBan1kg;
    }

    public int getSoCanBan1ngay() {
        return soCanBan1ngay;
    }

    public void setSoCanBan1ngay(int soCanBan1ngay) {
        this.soCanBan1ngay = soCanBan1ngay;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public String getNguonGoc() {
        return nguonGoc;
    }

    public void setNguonGoc(String nguonGoc) {
        this.nguonGoc = nguonGoc;
    }
}