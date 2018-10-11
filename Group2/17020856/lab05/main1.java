package tuan5.bai1;

public class main1 {
    public static void main(String[] args) {
        hoaQua hq = new hoaQua();
        hq.setChatLuong("Tot");
        hq.setNguonGoc("Viet Nam");
        System.out.println(hq.toString());

        quaCam qc = new quaCam();
        qc.setChatLuong("Tot");
        qc.setNguonGoc("Viet Nam");
        qc.setLoai("Cam Cao Phong va cam Sanh");
        System.out.println(qc.toString());

        camCaoPhong ccp = new camCaoPhong();
        System.out.println(ccp.getInfor());

        camSanh cs = new camSanh();
        System.out.println(cs.getInfor());
    }
}
