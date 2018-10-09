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
public class Travel {
    String diadiem;
    String thoigian;
    int songuoi;
public Travel(String dd, String time, int songuoi){
    this.diadiem=dd;
    this.thoigian=time;
    this.songuoi=songuoi;  
}

    public String getDiadiem() {
        return diadiem;
    }

    public void setDiadiem(String diadiem) {
        this.diadiem = diadiem;
    }

    public String getThoigian() {
        return thoigian;
    }

    public void setThoigian(String thoigian) {
        this.thoigian = thoigian;
    }

    public int getSonguoi() {
        return songuoi;
    }

    public void setSonguoi(int songuoi) {
        this.songuoi = songuoi;
    }

}
