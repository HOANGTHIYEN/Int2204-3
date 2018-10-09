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
public class emgai {
    private String tuoi;
    private String chieucao;
    private String cannang;

    public String getTuoi() {
        return tuoi;
    }

    public String getChieucao() {
        return chieucao;
    }

    public String getCannang() {
        return cannang;
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

    public emgai(String tuoi, String chieucao, String cannang) {
        this.tuoi = tuoi;
        this.chieucao = chieucao;
        this.cannang = cannang;
    }
    
}
