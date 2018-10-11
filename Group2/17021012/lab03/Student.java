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
public class Student {
    String tenSV;
    String maSV;
    String hocluc;
    int tuoi;
public Student(String ten, String maSV, String hocluc, int tuoi){
    this.tenSV= ten;
    this.maSV= maSV;
    this.hocluc=hocluc;
    this.tuoi= tuoi;
}

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHocluc() {
        return hocluc;
    }

    public void setHocluc(String hocluc) {
        this.hocluc = hocluc;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public void Lambai(){
        System.out.println("Hoc sinh ngoi nghe giang cham chu va nghiem tuc");
    }
    
}
