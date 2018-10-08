/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

/**
 *
 * @author Genius
 */
class HoaQua{
    int giaBan, soluong;
    String ngayNhap, nguonGoc;

    public HoaQua(){
        
    }
    public HoaQua(int giaBan, int soluong, String ngayNhap, String nguonGoc) {
        this.giaBan = giaBan;
        this.soluong = soluong;
        this.ngayNhap = ngayNhap;
        this.nguonGoc = nguonGoc;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public String getNguonGoc() {
        return nguonGoc;
    }

    public void setNguonGoc(String nguonGoc) {
        this.nguonGoc = nguonGoc;
    }
    public void getInfo(){
        System.out.println(giaBan + " " + soluong + " " + ngayNhap + " " + nguonGoc);
    }
}
class QuaCam extends HoaQua{
    int somuiTB;

    public QuaCam() {
    }

    public QuaCam(int somuiTB) {
        this.somuiTB = somuiTB;
    }

    public QuaCam(int somuiTB, int giaBan, int soluong, String ngayNhap, String nguonGoc) {
        super(giaBan, soluong, ngayNhap, nguonGoc);

        this.somuiTB = somuiTB;
    }
    public int getSomuiTB() {
        return somuiTB;
    }

    public void setSomuiTB(int somuiTB) {
        this.somuiTB = somuiTB;
    }
    @Override
    public void getInfo(){
        System.out.println(somuiTB + " " + giaBan + " " + soluong + " " + ngayNhap + " " + nguonGoc);
    }
    
}
class CamSanh extends QuaCam{
    String dongot;

    public CamSanh() {
    }

    public CamSanh(String dongot) {
        this.dongot = dongot;
    }

    public CamSanh(String dongot, int somuiTB, int giaBan, int soluong, String ngayNhap, String nguonGoc) {
        super(somuiTB, giaBan, soluong, ngayNhap, nguonGoc);
        this.dongot = dongot;
    }

    public String getDongot() {
        return dongot;
    }

    public void setDongot(String dongot) {
        this.dongot = dongot;
    }
    @Override
     public void getInfo(){
        System.out.println(dongot + " " + somuiTB + " " + giaBan + " " + soluong + " " + ngayNhap + " " + nguonGoc);
    }
    
}
class QuaTao extends HoaQua{
    String mauSac;

    public QuaTao() {
    }

    public QuaTao(String mauSac) {
        this.mauSac = mauSac;
    }

    public QuaTao(String mauSac, int giaBan, int soluong, String ngayNhap, String nguonGoc) {
        super(giaBan, soluong, ngayNhap, nguonGoc);
        this.mauSac = mauSac;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }
    @Override
     public void getInfo(){
        System.out.println(mauSac + " " + giaBan + " " + soluong + " " + ngayNhap + " " + nguonGoc);
    }
}
class CamCaoPhong extends QuaCam{
    String ma;

    public CamCaoPhong() {
    }

    public CamCaoPhong(String ma) {
        this.ma = ma;
    }

    public CamCaoPhong(String ma, int somuiTB) {
        super( somuiTB);
        this.ma = ma;
    }

    public CamCaoPhong(String ma, int somuiTB, int giaBan, int soluong, String ngayNhap, String nguonGoc) {
        super(somuiTB, giaBan, soluong, ngayNhap, nguonGoc);
        this.ma = ma;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }
    
    @Override
     public void getInfo(){
        System.out.println(ma + " " + somuiTB + " " + giaBan + " " + soluong + " " + ngayNhap + " " + nguonGoc);
    }
    
}

public class Lab05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CamCaoPhong t = new CamCaoPhong("cp1", 8, 30000, 100, "20/10/2017", "Cao Phong, Viet Nam");
        CamSanh t1 = new CamSanh("rat ngot", 8, 30000, 100, "20/10/2017", "Bac Giang, Viet Nam");
        QuaCam t2 = (QuaCam)t1;
        t.getInfo();
        t1.getInfo();
        t2.getInfo();
        QuaTao t3 = new QuaTao("vang do", 20000, 1000, "1/11/2018", "Trung Quoc");
        t3.getInfo();
        HoaQua t4 = (HoaQua)t3;
        t4.getInfo();
    }
    
}