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
public class Dodac {
    String tendd;
    String noiSX;
    String namht;
public Dodac(String tendd, String noiSX, String namht){
    this.tendd= tendd;
    this.noiSX= noiSX;
    this.namht= namht;
}

    public String getTendd() {
        return tendd;
    }

    public void setTendd(String tendd) {
        this.tendd = tendd;
    }

    public String getNoiSX() {
        return noiSX;
    }

    public void setNoiSX(String noiSX) {
        this.noiSX = noiSX;
    }

    public String getNamht() {
        return namht;
    }

    public void setNamht(String namht) {
        this.namht = namht;
    }

}