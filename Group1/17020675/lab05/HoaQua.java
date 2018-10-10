public class HoaQua {
    protected double giaBan;
    protected String xuatXu;
    protected String ngayNhap;
    protected double soLuong;

    public HoaQua(double giaBan, String xuatXu, String ngayNhap, double soLuong) {
        this.giaBan = giaBan;
        this.xuatXu = xuatXu;
        this.ngayNhap = ngayNhap;
        this.soLuong = soLuong;
    }

    public HoaQua() {
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public double getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(double soLuong) {
        this.soLuong = soLuong;
    }
}
