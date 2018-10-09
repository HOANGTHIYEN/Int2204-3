package lab05;

public class CamSanh extends QuaCam{
    String giaBan;
    String nguonGoc;

    public String getGiaBan() {
        return giaBan;
    }

    public String getNguonGoc() {
        return nguonGoc;
    }

    public void setGiaBan(String giaBan) {
        this.giaBan = giaBan;
    }

    public void setNguonGoc(String nguonGoc) {
        this.nguonGoc = nguonGoc;
    }

    public CamSanh(String giaBan, String nguonGoc, String ten, String mauSac) {
        super(ten, mauSac);
        this.giaBan = giaBan;
        this.nguonGoc = nguonGoc;
    }
    public String out()
    {
        return "Ten : " + getTen() + "\nMau Sac : " + getMauSac() + "\nNguon Goc : " + getNguonGoc() + "\nGia Ban : " + getGiaBan();
    }
}