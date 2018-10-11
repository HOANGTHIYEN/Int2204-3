public class Laptop {
    private String name;
    private double price;
    private String madeBy;

    public Laptop() {
    }

    public Laptop(String name, double price, String madeBy) {
        this.name = name;
        this.price = price;
        this.madeBy = madeBy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMadeBy() {
        return madeBy;
    }

    public void setMadeBy(String madeBy) {
        this.madeBy = madeBy;
    }

    public boolean isStrong () {
        if(price >= 20000000) return true;
        else return false;
    }
}
