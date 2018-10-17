
//Hình chữ nhật

public class Rectangle extends Shape {

    private ToaDo dinhGocTren;
    private ToaDo dinhGocDuoi;

    public Rectangle() {
    }

    public Rectangle(ToaDo dinhGocTren, ToaDo dinhGocDuoi) {
        super();
        this.dinhGocTren = dinhGocTren;
        this.dinhGocDuoi = dinhGocDuoi;
    }

    public Rectangle(String color, boolean filled, ToaDo dinhGocTren, ToaDo dinhGocDuoi) {
        super(color, filled);
        this.dinhGocTren = dinhGocTren;
        this.dinhGocDuoi = dinhGocDuoi;
    }

    public ToaDo getTop_left() {
        return dinhGocTren;
    }

    public void setTop_left(ToaDo dinhGocTren) {
        this.dinhGocTren = dinhGocTren;
    }

    public ToaDo getBot_right() {
        return dinhGocDuoi;
    }

    public void setBot_right(ToaDo dinhGocDuoi) {
        this.dinhGocDuoi = dinhGocDuoi;
    }

    public int getArea() {
        return (dinhGocDuoi.getX() - dinhGocTren.getX()) * (dinhGocDuoi.getY() - dinhGocTren.getY());
    }

    public int getPerimeter() {
        return (dinhGocDuoi.getX() - dinhGocTren.getX()) + (dinhGocDuoi.getY() - dinhGocTren.getY()) * 2;
    }

    public void move(int x, int y) {
        dinhGocTren.setX(dinhGocTren.getX() + x);
        dinhGocTren.setY(dinhGocTren.getY() + y);
        dinhGocDuoi.setX(dinhGocDuoi.getX() + x);
        dinhGocDuoi.setY(dinhGocDuoi.getY() + y);
    }
}