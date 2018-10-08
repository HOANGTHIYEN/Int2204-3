public class Backpack {
    private String seri;
    private String madeBy;
    private double price;

    public Backpack() {
    }

    public Backpack(String seri, String madeBy, double price) {
        this.seri = seri;
        this.madeBy = madeBy;
        this.price = price;
    }

    public String getSeri() {
        return seri;
    }

    public void setSeri(String seri) {
        this.seri = seri;
    }

    public String getMadeBy() {
        return madeBy;
    }

    public void setMadeBy(String madeBy) {
        this.madeBy = madeBy;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isCheap () {
        if (price >= 2000000) return true;
        else return false;
    }
}
