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
public class bo {
    private String tuoi;
    private String chieucao;
    private String cannang;
    private String nghenghiep;

    public bo(String tuoi, String chieucao, String cannang, String nghenghiep) {
        this.tuoi = tuoi;
        this.chieucao = chieucao;
        this.cannang = cannang;
        this.nghenghiep = nghenghiep;
    }
    

    public String getTuoi() {
        return tuoi;
    }

    public String getChieucao() {
        return chieucao;
    }

    public String getCannang() {
        return cannang;
    }

    public String getNghenghiep() {
        return nghenghiep;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public void setChieucao(String chieucao) {
        this.chieucao = chieucao;
    }

    public void setCannang(String cannang) {
        this.cannang = cannang;
    }

    public void setNghenghiep(String nghenghiep) {
        this.nghenghiep = nghenghiep;
    }
    
}
