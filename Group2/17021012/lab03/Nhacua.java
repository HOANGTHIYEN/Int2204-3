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
public class Nhacua {
    String diachi;
    int nam;
public Nhacua(String add, int nam){
    this.diachi= add;
    this.nam= nam;
}  

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

}
