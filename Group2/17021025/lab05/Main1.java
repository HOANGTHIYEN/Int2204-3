public class Main1 {
    public static void main(String[] args){
        HoaQua hq=new HoaQua();
        hq.setTenqua("quả dưa hấu");
        hq.setMuivi("thanh mát");
        hq.setHinhdang("to tròn");
        hq.setXuatxu("Quảng Nam");
        hq.setSoluong(150);
        hq.setGiaban(32.5f);
        System.out.println(hq.getInfo());

        quacam qc = new quacam();
        qc.setSomui(10);
        qc.setTenqua("quả cam");
        qc.setMuivi("chua ngọt");
        qc.setHinhdang("tròn");
        qc.setXuatxu("Hà Tĩnh");
        qc.setSoluong(320);
        qc.setGiaban(54);
        qc.printInfoOrange();

        quatao qt =  new quatao();
        qt.setTenqua("quả táo");
        qt.setMuivi("chua");
        qt.setHinhdang("méo");
        qt.setXuatxu("trung quốc");
        qt.setSoluong(876);
        qt.setGiaban(25);
        qt.InfoApple();

        cam_sanh cs = new cam_sanh();
        cs.setTenqua("cam sành");
        cs.setMuivi("ngọt");
        cs.setHinhdang("tròn");
        cs.setXuatxu("Hậu Giang");
        cs.setSoluong(200);
        cs.setGiaban(45.3f);
        cs.printInfoCamsanh();

        cam_cao_phong ccp =  new cam_cao_phong();
        ccp.setTenqua("cam cao phong");
        ccp.setMuivi("chua");
        ccp.setHinhdang("tròn");
        ccp.setXuatxu("Hòa Bình");
        ccp.setSoluong(450);
        ccp.setGiaban(50);
        ccp.printInfoCamcaophong();
        System.out.println(ccp.getInfo());

    }
}
