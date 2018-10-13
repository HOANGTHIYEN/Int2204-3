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
public class camcaophong extends Hoaqua {
    
    String mausac;
    
    @Override
    public void nhapthongtin() {
        super.nhapthongtin();
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập màu sắc:");
        setMausac(sc.next());
    }
    
    @Override
    public void hienthongtin() {
        super.hienthongtin();
        System.out.print("mausac:"+mausac);
        System.out.println();
    }

    /**
     * @return the mausac
     */
    public String getMausac() {
        return mausac;
    }

    /**
     * @param mausac the mausac to set
     */
    public void setMausac(String mausac) {
        this.mausac = mausac;
    }
    
}
