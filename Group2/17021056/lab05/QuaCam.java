/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau1.Lab05;

/**
 *
 * @author Administrator
 */
public class QuaCam  extends HoaQua{ 
    String LoaiCam; //thể loại cam
    
    public String getLoaiCam() {
        return LoaiCam;
    }

    public void setLoaiCam(String LoaiCam) {
        this.LoaiCam = LoaiCam;
    }
    public void getinfo() {
        System.out.println(LoaiCam +"\n");
    }
}
