package com.company;

public class Main {

    public static void main(String[] args) {

            cam_cao_phong Cam = new cam_cao_phong();
            Cam.tenqua ="Cam Cao Phong";
            Cam.getInfo();
            Cam.nguongocxuatsu ="Hòa Bình";
            Cam.giaban = 40000;
            Cam.ngaynhap ="5/6/2018";
            Cam.soluong = 100;
            System.out.println(Cam.getInfo());
            cam_sanh Cam1 = new cam_sanh();
            Cam1.tenqua ="Cam Sanh";
            Cam1.getInfo();
            Cam1.nguongocxuatsu ="Viet Nam";
            Cam1.giaban = 35000;
            Cam1.ngaynhap ="22/9/2018";
            Cam1.soluong = 400;
            System.out.println(Cam1.getInfo());
            quatao Tao = new quatao();
            Tao.tenqua ="Táo";
            Tao.LoaiTao ="Táo envy ";
            Tao.getinfo();
            Tao.nguongocxuatsu ="NEWZELAND";
            Tao.giaban =120000;
            Tao.ngaynhap ="23/6/2018";
            System.out.println(Tao.getInfo());
        }
    }

