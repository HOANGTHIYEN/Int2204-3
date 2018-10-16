package bai1;

public class hoaQua {
    private int price;
    private String source;
    private String date;
    private int amount;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    public void show(){
        System.out.println("giá tiền / 1 kg là : " + this.price );
        System.out.println("nguồn gốc: " + this.source);
        System.out.println("ngày nhập: " + this.date);
        System.out.println("số lượng: " + this.amount +"\n");
    }
}
