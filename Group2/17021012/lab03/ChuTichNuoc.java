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
public class ChuTichNuoc {
    String tenCT;
    int tuoi;
    String nhiemki;
public ChuTichNuoc(String ten, int tuoi, String nhiemki){
    this.tenCT=ten;
    this.tuoi= tuoi;
    this.nhiemki=nhiemki;
}
    public String getTenCT() {
        return tenCT;
    }

    public void setTenCT(String tenCT) {
        this.tenCT = tenCT;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getNhiemki() {
        return nhiemki;
    }

    public void setNhiemki(String nhiemki) {
        this.nhiemki = nhiemki;
    }
    public void Congviec(){
        System.out.println("Gap cac lanh dao cap cao ");
    }
    
}
