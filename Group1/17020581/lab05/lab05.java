package lab05;

public class lab05 {
    public static void main(String[] args) {
      //Bai 1
      CamCaoPhong cCP = new CamCaoPhong("15k", "Hoa Binh", "Qua Cam - Cam Cao Phong", "vang xanh");
      cCP.dacDiem();
      System.out.println(cCP.out() + "\n");
      
      CamSanh cS = new CamSanh("20k", "Các tỉnh miền Tây", "Quả Cam - Cam Sành", "vàng cam");
      cS.dacDiem();
      System.out.println(cS.out() + "\n");
      
      QuaTao t = new QuaTao("Quả Táo", "xanh hoặc đỏ");
      t.dacDiem();
      System.out.println(t.out() + "\n");
      
      //Bai 2
        Circle c = new Circle();
        System.out.println("Circle : ");
        System.out.println("Color : " +c.getColor() + "\nFilled : " + c.isFilled());
        System.out.println(c.toString() + "\n");
        
        Rectangle r = new Rectangle(1.5, 3.2, "pink", false);
        System.out.println("Rectangle : ");
        System.out.println("Color : " +r.getColor() + "\nFilled : " + r.isFilled());
        System.out.println(r.toString() + "\n");
        
        Square s = new Square();
        s.setLength(5);
        System.out.println("Square : ");
        System.out.println("Color : " + s.getColor());
        System.out.println("Filled : " + s.isFilled());
        System.out.println("Side : " + s.getWidth());    
        System.out.println(s.toString());

    }
}
