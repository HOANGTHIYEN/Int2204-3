/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author admin
 */
public class HoaQua {
    private int giabantrenkg;
    private int soluongkg;
    private String nguongoc;
    
    public void setGia(int a){
        this.giabantrenkg = a;
    }
    public void setSoluong(int a){
        this.soluongkg = a;
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

    /*public HoaQua(int giabantrenkg, int soluongkg, String nguongoc) {
        this.giabantrenkg = giabantrenkg;
        this.soluongkg = soluongkg;
        this.nguongoc = nguongoc;
    }*/
    
    
        

    
    public int Tinhtien(){
        return this.giabantrenkg*this.soluongkg;
    }
    @Override
    public String toString(){
        return this.nguongoc+" "+this.Tinhtien();
    }
}
