package bai1;

public class quaCam extends hoaQua {
    private final String orange = "orange";
   // private hoaQua p1 = new hoaQua();
    public quaCam(){
        super.setAmount(10);
        super.setDate("10/10/2018");
        super.setSource("Trung Quoc");
        super.setPrice(100000);
    }
    public void show(){
        System.out.println("name's fruit: " + orange);
        super.show();
    }

}
