/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baithuchanhcau3;

/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) {
        Father Dad = new Father();
        Dad.setName("Do The Thien");
        Dad.setNgheNghiep("Bo doi");
        Dad.setAge(50);
        Dad.setContent("Chuc vu Thuong ta ,nau an rat gioi");
        System.out.println(Dad.getinfo());
        /////////////////////////
        Mother Mom = new Mother();
        Mom.setName("Phan Thi Huong");
        Mom.setNgheNghiep("Giao vien");
        Mom.setAge(46);
        Mom.setContent("Giao vien tieu hoc ,nau an rat gioi");
        System.out.println(Mom.getinfo());
        ////////////////////////
        Conmeo meo = new Conmeo();
        meo.setName("Elsa");
        meo.setAge(18);
        meo.setMaulong("Tam the");
        meo.setCongdung("Bat chuot , thu cung");
        System.out.println(meo.getinfo());
        /////////////////////////
        Giaovien Gv = new Giaovien();
        Gv.setName("Do Thi Hue");
        Gv.setAge(58);
        Gv.setGiangvienmon("the duc");
        Gv.setTrinhdohocvan("Tien si");
        System.out.println(Gv.getinfo());
        ////////////////////////
        laptrinhvien ltv = new laptrinhvien();
        ltv.setMatdanh("Be loss the boss");
        ltv.setAge(20);
        ltv.setChucvu("master coder");
        ltv.setCongviec("Lap trinh game");
        System.out.println(ltv.getinfo());
        ////////////////////////
        Bacsi Bs = new Bacsi();
        Bs.setName("Do The Hoc");
        Bs.setAge(58);
        Bs.setChucvu("giam doc benh vien Bach Mai");
        Bs.setNganhchinh("Bac si phau thuat");
        System.out.println(Bs.getinfo());
        ////////////////////////
        Nongdan nd = new Nongdan();
        nd.setName("Do ngoc Tu Cam");
        nd.setAge(50);
        nd.setViecchinh("Lam Nong trong rau");
        nd.setViecthuongngay("Noi cho , viec nha");
        System.out.println(nd.getinfo());
        ////////////////////////
        hocsinh hs = new hocsinh();
        hs.setName("Do Tu Can");
        hs.setAge(17);
        hs.setTrinhdohocvan(" Lop 12");
        hs.setViecthuongngay("An , Ngu , Choi Game");
        System.out.println(hs.getinfo());
        ////////////////////////
        Streamer st = new Streamer();
        st.setBietdanh("PEW PEW");
        st.setAge(30);
        st.setCongviec("live stream Choi game ,chem gio");
        st.setKhoitaisan("studio PEW PEW");
        System.out.println(st.getinfo());
        /////////////////////////
        Casi cs = new Casi();
        cs.setName("Son tung MTP");
        cs.setAge(25);
        cs.setTheloai("POP music");
        cs.setThanhTuu("Ca si co MV dung top 1 tab thinh hanh youtube trong tuan ra mat");
        System.out.println(cs.getinfo());
}
}
