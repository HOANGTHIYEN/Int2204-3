package lb5;

public class main {
    public static void main(String[] args) {
        HoaQua hoaqua = new HoaQua("Hoa Quả", "Vị", "Xuất sứ", "Giá bán");
        QuaCam quacam = new QuaCam("Quả Cam", "Ngọt", "Nhập khẩu", "Tùy loại");
        QuaTao tao = new QuaTao("Táo tàu", "Ngọt", "Trung Quốc", "30000/kg");
        CamSanh cs = new CamSanh("Cam Sành", "Ngọt", "Việt Nam", "24000/kg", 10000, "10/2018");
        CamCaoPhong ccp = new CamCaoPhong("Cam Cao Phong", "Chua ngọt", "Việt Nam", "30000/kg", 15000, "10/2018");
        System.out.println(hoaqua.toString());
        System.out.println(tao.toString());
        System.out.println(cs.toString());
        System.out.println(ccp.toString());
    }
}
