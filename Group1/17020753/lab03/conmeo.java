/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

/**
 *
 * @author duongvanhoa
 */
public class conmeo {
     private String maulong;
     private String cannang;
     private String tuoi;

    public String getMaulong() {
        return maulong;
    }

    public String getCannang() {
        return cannang;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setMaulong(String maulong) {
        this.maulong = maulong;
    }

    public void setCannang(String cannang) {
        this.cannang = cannang;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public conmeo(String maulong, String cannang, String tuoi) {
        this.maulong = maulong;
        this.cannang = cannang;
        this.tuoi = tuoi;
    }
     
}
