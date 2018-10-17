/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05bai1;

/**
 *
 * @author Dell
 */
public class Lab05bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        quatao tao;
        tao = new quatao();
        tao.loai="tao";
        tao.nguongoc="viet nam";
        tao.ngaynhap="1/1/2018";
        tao.huongvi="ngot";
        tao.mausac="do";
        tao.soluong=1000;
        tao.giaban=50.000;
        System.out.println(tao.getInfor());
        
    }
    
}
