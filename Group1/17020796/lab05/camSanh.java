package bai1;

public class camSanh extends quaCam{
    private final String cam = "cam sành";
    public camSanh(){
        super.setAmount(10);
        super.setDate("10/10/2018");
        super.setSource("Trung Quoc");
        super.setPrice(100000);
    }
    public final void show(){
        System.out.println("name's orange: " + cam);
        super.show();
    }
}
