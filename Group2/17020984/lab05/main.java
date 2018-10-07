public class main{
    public static void main(String[] args){
        CamCaoPhong camCaoPhong = new CamCaoPhong();
        camCaoPhong.setName("Cam Cao Phong");
        camCaoPhong.setColor("Mau Da Cam");
        camCaoPhong.setNoiBan("Ha Noi");
        camCaoPhong.setGia(99.88);
        System.out.println("name: " + camCaoPhong.getName());
        System.out.println("color: " + camCaoPhong.getColor());
        System.out.println("Noi ban: " + camCaoPhong.getNoiBan());
        System.out.println("Gia: " + camCaoPhong.getGia());
        System.out.println("-------------------------------------------------");

        QuaTao quaTao = new QuaTao();
        quaTao.setName("Qua Tao");
        quaTao.setColor("Mau Do");
        quaTao.setNoiTrong("Hai Duong");
        System.out.println("name: " + quaTao.getName());
        System.out.println("color: " + quaTao.getColor());
        System.out.println("Noi trong: " + quaTao.getNoiTrong());

	Square a = new Square();
        Circle b = new Circle();
    }
}