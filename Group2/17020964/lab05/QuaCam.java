/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author CCNE
 */
public class QuaCam extends HoaQua{
    private boolean vo;
    public QuaCam(){
        this.setGia(100000);
        this.setNguongoc("Tau");
    }
    public void setVo(boolean i){
        this.vo = i;
    }
    public boolean Vo(){
        return this.vo;
    }
    @Override
    public String toString(){
        return this.getNguongoc()+" "+this.Vo()+" "+this.Tinhtien();
    }
    
}
