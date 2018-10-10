/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week5;

/**
 *
 * @author CCNE
 */
public class Main {

    public static void main(String[] args) {
        Fruit fruit = new Fruit("Giá bán", "Lô hàng", "Số lượng", "Xuất sứ");
        Apple apple = new Apple("2$/1Kilogram", "1/7/2018", "40 Cars ", "England");
        Orange orange = new Orange("50.000 VNĐ/1Kg", "20/6/2018", "30Kg", "Lâm Đồng");
        CaoPhongsOrange Cpo = new CaoPhongsOrange("350.000 Đồng/1 Bao", "9/8/2018", "5 bao", "Vườn nhà em");
        KingOrange Ko = new KingOrange("1.000.000 vnđ/1 lô", "dd/mm/yyyy", "3 lô", "Vinh");
        System.out.println("Táo: ");
        System.out.println("Giá: " +apple.getPrice() + "; Lô: " +apple.getDate() + "; Số lượng: " +apple.getNumber() + "; Xuất sứ: "+ apple.getOrigin());
        System.out.println("Cam: ");
        System.out.println("Giá: " +orange.getPrice() + "; Lô: " +orange.getDate() + "; Số lượng: " +orange.getNumber() + "; Xuất sứ: "+ orange.getOrigin());
        System.out.println("Cam Cao Phong: ");
        System.out.println("Giá: " +Cpo.getPrice() + "; Lô: " +Cpo.getDate() + "; Số lượng: " +Cpo.getNumber() + "; Xuất sứ: "+ Cpo.getOrigin());
        System.out.println("Cam Sành: ");
        System.out.println("Giá: " +Ko.getPrice() + "; Lô: " +Ko.getDate() + "; Số lượng: " +Ko.getNumber() + "; Xuất sứ: "+ Ko.getOrigin());
    }

}
