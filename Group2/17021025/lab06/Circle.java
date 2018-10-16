class Circle extends Shape{
    protected double radius;
    final double pi = 3.14;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled, Coordinates conter) {
        super(color, filled, conter);
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
    public void info(){
        System.out.println("Day la hinh tron: (ban kinh) " + radius);
    }
}
