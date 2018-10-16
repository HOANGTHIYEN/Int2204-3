/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HoaQua;

/**
 *
 * @author Quoc
 */
public class HoaQua
{
    private String tenqua;
    private String xuatxu;
    private String hinhdang;
    private int soluong;
    private float giaban;
    public void setTenQua(String tenqua)
    {
        this.tenqua = tenqua;
    }
    public String getTenQua()
    {
        return this.tenqua;
    }
     public void setXuatXu(String xuatxu)
    {
        this.xuatxu = xuatxu;
    }
    public String getXuatXu()
    {
        return this.xuatxu;
    }
     public void setHinhDang(String hinhdang)
    {
        this.hinhdang = hinhdang;
    }
    public String getHinhDang()
    {
        return this.hinhdang;
    }
    public void setSoLuong(int soluong)
    {
        this.soluong=soluong;
    }
    public int getSoLuong()
    {
        return this.soluong;
    }
    public void setGiaBan(float giaban)
    {
        this.giaban=giaban;
    }
    public float getGiaBan()
    {
        return this.giaban;
    }
    public String getInfo()
        {
            return getTenQua()+ "\t"+getXuatXu()+"\t"+getHinhDang()+"\t"+getSoLuong()+"\t"+getGiaBan();
        }
}
