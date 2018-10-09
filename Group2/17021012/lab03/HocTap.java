/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tonghopdoituong;

/**
 *
 * @author Nguyễn Thúy
 */
public class HocTap {
    String tenmonhoc;
    int sotien;
    int sotrang;
public HocTap(String tenmon, int tien, int sotrang){
    this.tenmonhoc=tenmon;
    this.sotien=tien;
    this.sotrang=sotrang;
    
}    

    public String getTenmonhoc() {
        return tenmonhoc;
    }

    public void setTenmonhoc(String tenmonhoc) {
        this.tenmonhoc = tenmonhoc;
    }

    public int getSotien() {
        return sotien;
    }

    public void setSotien(int sotien) {
        this.sotien = sotien;
    }

    public int getSotrang() {
        return sotrang;
    }

    public void setSotrang(int sotrang) {
        this.sotrang = sotrang;
    }

}
