package lab6;



class Circle extends Shape{
    protected double radius;
    final double pi = 3.14;
    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled, location mid) {
        super(color, filled, mid);
        this.radius = radius;
    }
     public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
     public double getArea(){
        return radius*radius*pi;
    }
    public double getPerimeter(){
        return 2*radius*pi;
    }
    @Override
    public void show(){
        System.out.println("Hình tròn bán kính :" + radius);
    }
}