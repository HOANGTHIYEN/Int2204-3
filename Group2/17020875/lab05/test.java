class test {
    public static void main(String args[]) {
        System.out.println("HoaQua");
        HoaQua hoaQua1 = new HoaQua("xanh", "Tu xuyen", "cau");
        System.out.println(hoaQua1.getMauSac() + " " + hoaQua1.getNguonGoc() + " " + hoaQua1.getHinhdang());
        System.out.println(hoaQua1.getNguonGoc());
        System.out.println("Qua cam");
        System.out.println("-------------------------------");


        QuaCam quaCam = new QuaCam();
        quaCam.setVi("ngot");
        System.out.println("Vi cam: " + quaCam.getVi());
        System.out.println("Qua tao");
        System.out.println("----------------------------");


        QuaTao quaTao = new QuaTao();
        System.out.println("so luong:" + quaTao.getSoLuong());

        System.out.println("-----------------------------");

        System.out.println("Qua cam phong");
        CamCaoPhong c = new CamCaoPhong();
        c.setNgayxuat("23/7");
        System.out.println(c.getNgayxuat());


        System.out.println("-----------------------------");
        System.out.println("Cam sanh");
        CamSanh camSanh = new CamSanh();
        System.out.println(camSanh.getGia());
    }
}