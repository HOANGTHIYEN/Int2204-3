/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;
public class Fruit {
    int gia;    
    String made;
    int sl;
    String ngay;

    public int getGia() {
        return gia;
    }

    public Fruit(int gia, String made, int sl, String ngay) {
        this.gia = gia;
        this.made = made;
        this.sl = sl;
        this.ngay = ngay;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }
  
    
    
    
}
