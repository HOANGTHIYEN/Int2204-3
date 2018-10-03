public class Cellphone {
    private String num; // so dien thoai      
    private String name;
    private double price;//gia tien
    private String madeBy; // hang san xuat

    public Cellphone() {
    }

    public Cellphone(String num, String name, double price, String madeBy) {
        this.num = num;
        this.name = name;
        this.price = price;
        this.madeBy = madeBy;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
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

    public boolean isCheap () {
        if(price < 5000000) return true;
        else return false;
    }
}