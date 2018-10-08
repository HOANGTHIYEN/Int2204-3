public class Car {
    private double price; // gia thanh
    private String name; // ten xe
    private String color; // mau xe
    private String madeBy; // hang san xuat
    private double gasHas; // don vi lit

    //constructor
    public Car() {
    }

    public Car(double price, String name, String color, String madeBy, double gasHas) {
        this.price = price;
        this.name = name;
        this.color = color;
        this.madeBy = madeBy;
        this.gasHas = gasHas;
    }
    //getter and setter
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMadeBy() {
        return madeBy;
    }

    public void setMadeBy(String madeBy) {
        this.madeBy = madeBy;
    }

    public double getGasHas() {
        return gasHas;
    }

    public void setGasHas(double gasHas) {
        this.gasHas = gasHas;
    }

    public boolean outOfGas ()
    {
        if (this.gasHas < 5) return true;
        else return false;
    }
    public  boolean fullOfGas ()
    {
        if (this.gasHas >= 60 ) return true;
        else return false;
    }
}
