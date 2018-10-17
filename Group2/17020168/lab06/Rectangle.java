package lab06;

public class Rectangle extends Shape{
    double width;
    double length;
    public Rectangle(){
        width = 1.0;
        length = 1.0;
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled, Location mid) {
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return (width + length)*2;
    }
    public void showInfo(){
        System.out.println("Hình chữ nhật{" + "chiều dài=" + width + ",chiều rộng=" + length + ", màu='" + color + ", filled=" + filled + ", Vị trí=" + mid + '}');
    }

//    @Override
//    public String toString() {
//        return "Rectangle{" +
//                "width=" + width +
//                ", length=" + length +
//                ", color='" + color + '\'' +
//                ", filled=" + filled +
//                ", mid=" + mid +
//                '}';
//    }
}
