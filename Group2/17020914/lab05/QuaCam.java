/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author admin
 */
public class QuaCam extends HoaQua {
    private boolean voday;
    public QuaCam(int a, int b, String n, boolean i){
        super(a,b,n);
        this.voday = i;
    }
    public void setVo(boolean i){
        this.voday = i;
    }
    public boolean Voday(){
        return this.voday;
    }
    @Override
    public String toString(){
        return this.getNguongoc()+" "+this.Voday()+" "+this.Tinhtien();
    }
}
