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
public class GiaoVien {
    String hoten;
    String diachi;
    String monday;
    int tuoi;
public GiaoVien(String hoten, String diachi, String monday, int tuoi){
    this.hoten=hoten;
    this.diachi=diachi;
    this.monday=monday;
    this.tuoi= tuoi;
}
    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getMonday() {
        return monday;
    }

    public void setMonday(String monday) {
        this.monday = monday;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    
    public void GiangBai(String hoten){
        System.out.println(hoten+" giang bai de hieu, rat hieu qua va y nghia");
    }
    
}
