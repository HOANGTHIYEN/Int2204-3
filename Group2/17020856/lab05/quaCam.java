package tuan5.bai1;

public class quaCam extends hoaQua {
    protected String loai;

    public quaCam() {

    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    @Override
    public String toString() {
        return "quaCam{" +
                "loai='" + loai + '\'' +
                ", nguonGoc='" + nguonGoc + '\'' +
                ", chatLuong='" + chatLuong + '\'' +
                '}';
    }
}
