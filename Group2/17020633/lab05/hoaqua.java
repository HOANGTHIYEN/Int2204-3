/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05bai1;

/**
 *
 * @author Dell
 */
public class hoaqua {
    protected double giaban;
    protected String nguongoc;
    protected String ngaynhap;
    protected long soluong;
    protected String mausac;
   protected  String loai;
    public double getGiaban()
    {
        return giaban;
    }
    public void setGiaban(double n)
    {
        giaban=n;
    }
    public String getNguongoc()
    {
        return nguongoc;
        
    }
    public void setNguongoc(String n)
    {
        nguongoc=n;
    }
    public String getNgaynhap()
    {
        return ngaynhap;
        
    }
    public void setNgaynhap(String n)
    {
        ngaynhap=n;
    }
     public String getMausac()
    {
        return mausac;
        
    }
    public void setMausac(String n)
    {
        mausac=n;
    }
      public String getLoai()
    {
        return loai;
        
    }
    public void setLoai(String n)
    {
        loai=n;
    }
    public String getInfor()
    {
        return "Loai : "+loai+"\nguongoc : "+nguongoc+"\nngaynhap : "+ngaynhap+"\ngiaban : "+giaban+"\nmausac"+mausac+"\nsoluong"+soluong;
    }
}
