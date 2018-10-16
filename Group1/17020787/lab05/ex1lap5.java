public class ex1lap5 {
    public static void main(String[] args){
        Quatao quatao=new Quatao();
        quatao.setGia(20000);
        quatao.setNgaynhap("10/10/2018");
        quatao.setNguongoc("Trung quoc");
        quatao.setSoluong(20);
        Camcaophong camcaophong=new Camcaophong();
        camcaophong.setHan(15);
        camcaophong.setLoaiqua("Cam Cao Phong");
        camcaophong.setGia(15000);
        camcaophong.setNgaynhap("5/2/2018");
        camcaophong.setNguongoc("Viet Nam");
        camcaophong.setSoluong(12);
        camcaophong.setThue(0.1);
        Camsanh camsanh=new Camsanh();
        camsanh.setChu_y("Vat nuoc cho them duong uong");
        camsanh.setGia(10000);
        camsanh.setLoaiqua("Cam Sanh");
        camsanh.setNgaynhap("5/8/2018");
        camsanh.setSoluong(10);
        camsanh.setGia(5000);
        camsanh.setNguongoc("Viet nam");
        camsanh.setThue(0.2);
        System.out.println(quatao.han());
        System.out.println(camcaophong.tiennhap()+"vnd");
        System.out.println(camsanh.getChu_y());

    }
}
