package lab5;

class HoaQua {

    public int cost;
    public int number;
    public String Origin;
    public String day;

    public HoaQua() {
        super();
    }

    public HoaQua(int cost, int number, String Origin, String day) {
        this.cost = cost;
        this.number = number;
        this.Origin = Origin;
        this.day = day;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String origin) {
        Origin = origin;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}

class Cam extends HoaQua {

    public Cam() {
        super();
    }

    public Cam(int cost, int number, String Origin, String day) {
        super(cost, number, Origin, day);
    }
}

class Tao extends HoaQua {

    public Tao() {
        super();
    }

    public Tao(int cost, int number, String Origin, String day) {
        super(cost, number, Origin, day);
    }
}

class CamCaoPhong extends Cam {

    public CamCaoPhong() {
        super();
    }

    public CamCaoPhong(int cost, int number, String Origin, String day) {
        super(cost, number, Origin, day);
    }
}

class CamSanh extends Cam {

    public CamSanh() {
        super();
    }

    public CamSanh(int cost, int number, String Origin, String day) {
        super(cost, number, Origin, day);
    }
}

public class Lab5 {

    public static void main(String[] args) {
        HoaQua hq = new HoaQua(19, 900, "Viet nam", "10.02.18");
        System.out.println("Gia hoa qua: " + hq.getCost() + "k/kg");
        System.out.println("So luong: " + hq.getNumber());
        System.out.println("Xuat xu: " + hq.getOrigin());
        System.out.println("Ngay nhap: " + hq.getDay() + "\n");

        Cam c = new Cam(13, 600, "My", "23.04.18");
        System.out.println("Gia cam: " + c.getCost() + "k/kg");
        System.out.println("So luong: " + c.getNumber());
        System.out.println("Xuat xu: " + c.getOrigin());
        System.out.println("Ngay nhap: " + c.getDay() + "\n");

        Tao ap = new Tao(20, 400, "Indonexia", "23.06.18");
        System.out.println("Gia tao: " + ap.getCost() + "k/kg");
        System.out.println("So luong tao: " + ap.getNumber());
        System.out.println("Xuat xu: " + ap.getOrigin());
        System.out.println("Ngay nhap: " + ap.getDay() + "\n");

        CamCaoPhong ccp = new CamCaoPhong(17, 500, "AnDo", "01.01.18");
        System.out.println("Gia cam Cao Phong: " + ccp.getCost() + "k/kg");
        System.out.println("So luong: " + ccp.getNumber());
        System.out.println("Xuat xu: " + ccp.getOrigin());
        System.out.println("Ngay nhap: " + ccp.getDay() + "\n");

        CamSanh cs = new CamSanh(12, 700, "Viet Nam", "22.12.18");
        System.out.println("Gia cam Sanh: " + cs.getCost() + "k/kg");
        System.out.println("So luong: " + cs.getNumber());
        System.out.println("Xuat xu: " + cs.getOrigin());
        System.out.println("Ngay nhap: " + cs.getDay());

    }
}
