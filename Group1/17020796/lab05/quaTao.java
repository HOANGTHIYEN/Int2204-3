package bai1;

public class quaTao extends hoaQua{
    private String name = "Apple";

    public quaTao(int price, String source,String date, int amount){
        super.setAmount(amount);
        super.setDate(date);
        super.setPrice(price);
        super.setSource(source);
    }
    public  quaTao(){
        super.setAmount(10);
        super.setDate("10/10/2018");
        super.setSource("Trung Quoc");
        super.setPrice(100000);
    }
    public final void show(){
        System.out.println("name's fruit: " + getName());
        super.show();

    }
    public String getName(){
        return name;
    }

}
