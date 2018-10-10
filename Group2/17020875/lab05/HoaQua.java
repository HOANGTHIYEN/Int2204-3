public class HoaQua {
    private String mauSac;
    private String nguonGoc;
    private String hinhdang;

    public HoaQua() {
        this.mauSac = "red";
        this.nguonGoc = "Viet Nam";
        this.hinhdang = "around";
    }

    public HoaQua(String mauSac, String nguonGoc, String hinhdang) {
        this.mauSac = mauSac;
        this.nguonGoc = nguonGoc;
        this.hinhdang = hinhdang;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public void setHinhdang(String hinhdang) {
        this.hinhdang = hinhdang;
    }

    public void setNguonGoc(String nguonGoc) {
        this.nguonGoc = nguonGoc;
    }

    public String getMauSac() {
        return mauSac;
    }

    public String getHinhdang() {
        return hinhdang;
    }

    public String getNguonGoc() {
        return nguonGoc;
    }
}
