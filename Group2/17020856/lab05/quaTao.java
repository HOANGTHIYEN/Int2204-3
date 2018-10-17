package tuan5.bai1;


public class quaTao extends hoaQua {
    protected String loai;
    protected String xuatXu;
    protected int gia;


    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    @Override
    public String toString() {
        return "quaTao{" +
                "loai='" + loai + '\'' +
                ", xuatXu='" + xuatXu + '\'' +
                ", gia=" + gia +
                ", nguonGoc='" + nguonGoc + '\'' +
                ", chatLuong='" + chatLuong + '\'' +
                '}';
    }
}
