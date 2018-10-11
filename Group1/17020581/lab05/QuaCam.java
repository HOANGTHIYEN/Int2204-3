package lab05;

public class QuaCam extends HoaQua{
    String mauSac;

    public QuaCam(String ten, String mauSac) {
        super(ten);
        this.mauSac = mauSac;
    }

    public String getMauSac() {
        return mauSac;
    }
    
}