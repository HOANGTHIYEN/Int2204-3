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
public class bacsi {
    private String chieucao;
    private String cannang;
    private String tuoi;

    public String getChieucao() {
        return chieucao;
    }

    public String getCannang() {
        return cannang;
    }

    public String getTuoi() {
        return tuoi;
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

    public bacsi(String chieucao, String cannang, String tuoi) {
        this.chieucao = chieucao;
        this.cannang = cannang;
        this.tuoi = tuoi;
    }
    
}
