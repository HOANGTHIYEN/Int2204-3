package bai1;

public class camCaoPhong extends quaCam{
    private final String cam = "cam Cao Phong";
    public camCaoPhong(){
        super.setAmount(10);
        super.setDate("10/10/2018");
        super.setSource("Hoa binh");
        super.setPrice(100000);
    }
    public final void show(){
        System.out.println("name's orange: " + cam);
        super.show();
    }
}
