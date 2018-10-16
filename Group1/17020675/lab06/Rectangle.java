public class Rectangle extends Shape {
    protected double width;
    protected double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        name = "chu nhat";
    }

    public Rectangle(ToaDo toaDo, boolean filled, double width, double height) {
        super(toaDo, filled);
        this.width = width;
        this.height = height;
        name = "chu nhat";
    }

    public Rectangle() {
        name = "chu nhat";
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public void setSize (){
        this.size = height * width ;
    }
    public double getSize(){
        return size;
    }
}
