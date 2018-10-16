public class Main {

    public static void main(String[] args) {
        // bai 1
        /* HoaQua hq = new HoaQua();
        QuaTao qt = new QuaTao();
        QuaCam qc = new QuaCam();
        CamCaoPhong ccp = new CamCaoPhong();
        CamSanh cs = new CamSanh();

        ccp.setGiaBan1kg(100);
        ccp.setNgayNhap("10/10/2018");
        ccp.setNguonGoc("Hung Yen");
        ccp.setSoCanBan1ngay(100);

        cs.setNgayNhap("9/10/2018");
        cs.setNguonGoc("Ha Noi");
        cs.setGiaBan1kg(50);
        cs.setSoCanBan1ngay(120);

        qc.setSoCanBan(ccp.getSoCanBan1ngay() + cs.getSoCanBan1ngay());
        qc.setSoLoai(2);

        qt.setGiaBan1kg(150);
        qt.setNguonGoc("SaPa");
        qt.setSoLuong(200);
        qt.setNgayNhap("1/10/2018");

        if(qt.getSoLuong() > qc.getSoCanBan()){
            hq.setBanChay("Qua Tao");
        } else if(qt.getSoLuong() == qc.getSoCanBan()) {
            hq.setBanChay("Bang Nhau");
        } else {
            hq.setBanChay("Qua Cam");
        }

        hq.setSoloai(1+qc.soLoai);

        System.out.println("Hoa Qua ban chay giua cam va tao la: " + hq.getBanChay());
        System.out.println("So loai hoa qua la: " + hq.getSoloai());
        */

        //Bai 2

        Rectangle hcn = new Rectangle(2.5, 3.5, "red", true);
        Square hv = new Square(5.0, "yellow", true);
        Circle htr = new Circle(3.5, "", false);

        System.out.println("Dien tich hinh chu nhat la: " + hcn.getArea());
        System.out.println("Chu vi hinh chu nhat la: " + hcn.getPerimeter());

        System.out.println("Dien tich hinh vuong la: " + hv.getArea());
        System.out.println("Chu vi hinh vuong la: " + hv.getPerimeter());


        System.out.println("Dien tich hinh tron la: " + htr.getArea());
        System.out.println("Chu vi hinh tron la: " + htr.getPerimeter());
    }
}
