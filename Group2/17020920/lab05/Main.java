package Lap5_ex1;

public class Main {
    public static void main(String args[]){
        Qua_Cam cam = new Qua_Cam(30,20);
        cam.ThongSoCam();
        Qua_Tao tao = new Qua_Tao("Triều Tiên",3000);
        tao.ThongSoTao();
        Qua_CamCaoPhong camCaoPhong = new Qua_CamCaoPhong("30/12/2017");
        camCaoPhong.ThongSoCamCaoPhong();
        Qua_CamSanh camSanh=new Qua_CamSanh(100,2,"Hải Phòng");
        camSanh.ThongSoCamSanh();
    }
}
