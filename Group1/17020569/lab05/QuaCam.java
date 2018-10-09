package lab5;
public class QuaCam extends HoaQua {
    private boolean voday;
    public QuaCam(){
        this.setGia(12000);
        this.setNguongoc("Vietnam");
    }
    public void setVo(boolean i){
        this.voday = i;
    }
    public boolean Voday(){
        return this.voday;
    }
    @Override
    public String toString(){
        return this.getNguongoc()+" "+this.Voday()+" "+this.Tinhtien();
    }
}
