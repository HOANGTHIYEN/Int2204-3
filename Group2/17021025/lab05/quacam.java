public class quacam extends HoaQua{
    private  int somui;
    public void setSomui(int somui){
        this.somui=somui;
    }
    public int getSomui(){
        return somui;
    }
    public void printInfoOrange() {
        System.out.println("đây gọi là quả cam " + getInfo() + " có " + getSomui() + "múi / 1 quả");
    }
}
