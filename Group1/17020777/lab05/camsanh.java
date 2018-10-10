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
public class camsanh extends Hoaqua {
    
    String dongot;
    
    
    @Override
    public void nhapthongtin() {
        super.nhapthongtin();
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập độ ngọt:");
        dongot=sc.next();
    }
    
    @Override
    public void hienthongtin() {
        super.hienthongtin();
        System.out.print("độ ngọt:"+dongot);
        System.out.println();
    }

    /**
     * @return the dongot
     */
    public String getDongot() {
        return dongot;
    }

    /**
     * @param dongot the dongot to set
     */
    public void setDongot(String dongot) {
        this.dongot = dongot;
    }
    
}
