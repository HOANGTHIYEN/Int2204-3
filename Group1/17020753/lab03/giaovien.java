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
public class giaovien {

    private String chieucao;
    private String cannang;
    private String tuoi;
    private String monhoc;

    public String getChieucao() {
        return chieucao;
    }

    public String getCannang() {
        return cannang;
    }

    public String getTuoi() {
        return tuoi;
    }

    public String getMonhoc() {
        return monhoc;
    }

    public void setChieucao(String chieucao) {
        this.chieucao = chieucao;
    }

    public void setCannang(String cannang) {
        this.cannang = cannang;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public void setMonhoc(String monhoc) {
        this.monhoc = monhoc;
    }

    public giaovien(String chieucao, String cannang, String tuoi, String monhoc) {
        this.chieucao = chieucao;
        this.cannang = cannang;
        this.tuoi = tuoi;
        this.monhoc = monhoc;
    }
    

}
