package lb5;

public class CamCaoPhong extends QuaCam {
    private int sl;
    private String date;

    public int getsl(){
        return sl;
    }
    public void setsl(int sl){
        this.sl = sl;
    }

    public String getdate(){
        return date;
    }
    public void setdate(String date){
        this.date = date;
    }
    public CamCaoPhong(String ten, String loai, String xuatsu, String gia, int sl, String date) {
        super(ten, loai, xuatsu, gia);
        this.sl = sl;
        this.date = date;
    }

    public String toString(){
        return super.toString() + "    Số lượng: " + sl + "    Ngày nhập: " + date;
    }
}
