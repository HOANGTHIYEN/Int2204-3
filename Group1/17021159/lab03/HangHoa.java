/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

/**
 *
 * @author Admin
 */
import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;
public class HangHoa implements Serializable{
    private String maHang,tenHang,nsx;
    private double gia;

    public String getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public String getNsx() {
        return nsx;
    }

    public double getGia() {
        return gia;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public void setNsx(String nsx) {
        this.nsx = nsx;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public HangHoa() {
    }
    public HangHoa(String maHang)
    {
        this.maHang = maHang;
    }
    public HangHoa(String maHang, String tenHang, String nsx, double gia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.nsx = nsx;
        this.gia = gia;
    }
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ten hang: ");
        this.setTenHang(sc.nextLine());
        System.out.print("Nha san xuat: ");
        this.setNsx(sc.nextLine());
        System.out.print("Gia: ");
        this.setGia(sc.nextDouble());
    }
    public void xuat()
    {
        System.out.printf("%10s %10s %10s %10.0f",this.getMaHang(),this.getTenHang(),this.getNsx(),this.getGia());
    }
}