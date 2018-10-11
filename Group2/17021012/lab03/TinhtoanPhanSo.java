/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhtoanphanso;


public class TinhtoanPhanSo {

    
    public static void main(String[] args) {
        PhanSo ps1= new PhanSo(2,5);
        PhanSo ps2= new PhanSo(3,5);
        PhanSo tong= ps1.Cong(ps2);
        PhanSo hieu=ps1.Tru(ps2);
        PhanSo tich=ps1.Nhan(ps2);
        PhanSo thuong=ps1.Chia(ps2);
        System.out.println("Tong cua hai phan so la: ");
        tong.Xuat();
        System.out.println("\n");
        System.out.println("Hieu cua hai phan so la: ");
        hieu.Xuat();
        System.out.println("\n");
        System.out.println("Tich cua hai phan so la: ");
        tich.Xuat();
        System.out.println("\n");
        System.out.println("Thuong cua hai phan so la: ");
        thuong.Xuat();
        System.out.println("\n");
        System.out.println(ps1.equals(ps2));
    }
    
}
