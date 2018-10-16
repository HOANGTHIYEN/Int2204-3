/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoaqua;

import java.util.Scanner;

/**
 *
 * @author MANH HOANG
 */
public class quacam extends Hoaqua {
    
    String kichthuoc;
    

    @Override
    public void nhapthongtin() {
        super.nhapthongtin();
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập kích thước:");
        kichthuoc=sc.next();
    }
    
    @Override
    public void hienthongtin() {
        super.hienthongtin();
        System.out.print("kích thước:"+kichthuoc);
        System.out.println();
    }

    /**
     * @return the kichthuoc
     */
    public String getKichthuoc() {
        return kichthuoc;
    }

    /**
     * @param kichthuoc the kichthuoc to set
     */
    public void setKichthuoc(String kichthuoc) {
        this.kichthuoc = kichthuoc;
    }
    
}