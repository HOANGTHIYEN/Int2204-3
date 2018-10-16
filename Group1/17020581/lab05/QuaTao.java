package lab05;

public class QuaTao extends HoaQua{
   String mauSac;

    public QuaTao(String ten, String mauSac) {
        super(ten);
        this.mauSac = mauSac;
    }

    public String getMauSac() {
        return mauSac;
    }
    public String out() {
        return "Tên : " + getTen() + "\nMau Sac : " + getMauSac();
    }
}