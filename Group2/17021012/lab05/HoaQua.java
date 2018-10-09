/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_lap05;

/**
 *
 * @author Nguyen Thai
 */
//Doi tuong Hoa qua la chinh
public class HoaQua {
    float giaBan;
    String nguonGoc;
    String ngayNhap;
    float soLuong;
    
    public HoaQua( float giaBan , String nguonGoc , String ngayNhap , float soLuong)
    {
        this.giaBan = giaBan;
        this.ngayNhap = ngayNhap;
        this.nguonGoc = nguonGoc;
        this.soLuong = soLuong;
    }
    
    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public String getNguonGoc() {
        return nguonGoc;
    }

    public void setNguonGoc(String nguonGoc) {
        this.nguonGoc = nguonGoc;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }
    
    
}
