/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap_05_1;

/**
 *
 * @author Admin
 */
class quacam extends hoa_qua
{
   private String loai;
    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }
}
class quatao extends hoa_qua
{
   private long gia;
   private String diadiem;

    public String getDiadiem() {
        return diadiem;
    }

    public void setDiadiem(String diadiem) {
        this.diadiem = diadiem;
    }
   
    public long getGia() {
        return gia;
    }

    public void setGia(long gia) {
        this.gia = gia;
    }
   public void quatao()
   {
       this.gia=0;
       this.diadiem="";
   }
    
}
class camcaophong extends quacam
{
    long gia;
    String diadiem;

    public String getDiadiem() {
        return diadiem;
    }

    public void setDiadiem(String diadiem) {
        this.diadiem = diadiem;
    }
    
    public long getGia() {
        return gia;
    }

    public void setGia(long gia) {
        this.gia = gia;
    }
    public void camcaophong()
    {
        this.gia=0;
        this.diadiem="";
    }
}
class camsanh extends camcaophong
{
    private String ma;

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }
    public void camsanh()
    {
        this.ma="";
    }
}
public class Lap_05_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        hoa_qua hq=new hoa_qua();
        hq.setChatluong("tot");
        hq.setNguongoc("china");
        System.out.println("hoa qua chat luong :"+hq.getChatluong()+" Nguon goc :"+hq.getNguongoc());
        quacam qc=new quacam();
        qc.setChatluong("tot");
        qc.setNguongoc("china");
        qc.setLoai("cam cao phong va cam sanh");
        System.out.println(qc.getChatluong()+" "+qc.getNguongoc()+" "+qc.getLoai());
        quatao qt=new quatao();
        qt.setChatluong("vua");
        qt.setNguongoc("china");
        qt.setGia(100000);
        qt.setDiadiem("cho long bien");
        System.out.println(qt.getChatluong()+" "+qt.getNguongoc()+" "
        +qt.getGia()+" "+qt.getDiadiem());
        camcaophong ccp=new camcaophong();
        ccp.setChatluong("dac biet");
        ccp.setNguongoc("thanh hoa");
        ccp.setGia(100000);
        ccp.setDiadiem("cho ben thanh");
        System.out.println(ccp.getChatluong()+" "+ccp.getNguongoc()+" "
        +ccp.getGia()+" "+ccp.getDiadiem());
        camsanh cs=new camsanh();
       cs.setChatluong("dac biet");
        cs.setNguongoc("ha noi");
        cs.setGia(100000);
        cs.setDiadiem("cho ben thanh");
        cs.setMa("loai mot");
        System.out.println(cs.getChatluong()+" "+cs.getNguongoc()+" "
        +cs.getGia()+" "+cs.getDiadiem()+" "+cs.getMa());
        
    }
    
}
