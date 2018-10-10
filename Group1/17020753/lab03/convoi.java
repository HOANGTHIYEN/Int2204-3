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
public class convoi {
    private String tuoi;
    private String cannang;
    private String chieucao;

    public String getTuoi() {
        return tuoi;
    }

    public String getCannang() {
        return cannang;
    }

    public String getChieucao() {
        return chieucao;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public void setCannang(String cannang) {
        this.cannang = cannang;
    }

    public void setChieucao(String chieucao) {
        this.chieucao = chieucao;
    }

    public convoi(String tuoi, String cannang, String chieucao) {
        this.tuoi = tuoi;
        this.cannang = cannang;
        this.chieucao = chieucao;
    }
    
}
