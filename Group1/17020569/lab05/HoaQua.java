package lab5;
public class HoaQua {
    private int giabantrenkg;
    private int soluongkg;
    private String nguongoc;
    
    public void setGia(int a){
        this.giabantrenkg = a;
    }
    public void setSoluong(int b){
        this.soluongkg = b;
    }
    public void setNguongoc(String n){
        this.nguongoc = n;
    }
    public int getGia(){
        return this.giabantrenkg;
    }
    public int getSoluong(){
        return this.soluongkg;
    }
    public String getNguongoc(){
        return this.nguongoc;
    }
    public int Tinhtien(){
        return this.giabantrenkg*this.soluongkg;
    }
    @Override
    public String toString(){
        return this.nguongoc+" "+this.Tinhtien();
    }
}
