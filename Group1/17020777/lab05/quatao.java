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
public class quatao extends Hoaqua{
    
    float nhietdo;
    
    @Override
    public void nhapthongtin() {
        super.nhapthongtin();
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập nhiệt độ:");
        setNhietdo(sc.nextFloat());
    }
    
    @Override
    public void hienthongtin() {
        super.hienthongtin();
        System.out.print("kích thước:"+getNhietdo());
        System.out.println();
    }

    /**
     * @return the nhietdo
     */
    public float getNhietdo() {
        return nhietdo;
    }

    /**
     * @param nhietdo the nhietdo to set
     */
    public void setNhietdo(float nhietdo) {
        this.nhietdo = nhietdo;
    }
    
}