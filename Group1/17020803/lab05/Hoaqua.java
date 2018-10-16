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
public class Hoaqua {

    int gia;
    int soluong;
    String nguongoc;
   
    /**
     * @return the gia
     */
    public int getGia() {
        return gia;
    }

    /**
     * @param gia the gia to set
     */
    public void setGia(int gia) {
        this.gia = gia;
    }

    /**
     * @return the soluong
     */
    public int getSoluong() {
        return soluong;
    }

    /**
     * @param soluong the soluong to set
     */
    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    /**
     * @return the nguongoc
     */
    public String getNguongoc() {
        return nguongoc;
    }

    /**
     * @param nguongoc the nguongoc to set
     */
    public void setNguongoc(String nguongoc) {
        this.nguongoc = nguongoc;
    }

    
    
    public void nhapthongtin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập giá:");
        gia=sc.nextInt();
        System.out.print("nhập số lượng:");
        soluong=sc.nextInt();
        System.out.print("nhập nguồn gốc:");
        nguongoc=sc.next();
        
}
    
    public void hienthongtin() {
        System.out.print("giá:"+gia);
        System.out.print("số lượng:"+soluong);
        System.out.print("nguồn gốc:"+nguongoc);
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        quacam a = new quacam();
        System.out.println("loại:quả cam");
        a.nhapthongtin();
        a.hienthongtin();
        quatao b = new quatao();
        System.out.println("loại:quả táo");
        b.nhapthongtin();
        b.hienthongtin();
        camcaophong c = new camcaophong();
        System.out.println("loại:cam cao phong");
        c.nhapthongtin();
        c.hienthongtin();
        camsanh d = new camsanh();
        System.out.println("loại:cam sành");
        d.nhapthongtin();
        d.hienthongtin();
        
    } 
}
