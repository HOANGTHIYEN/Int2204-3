import static java.lang.Math.sqrt;

public class Triangle extends Shape{
    protected double edge1;
    protected double edge2;
    protected double edge3;
    protected Coordinates[] tr = new Coordinates[3];
    public Triangle(){

    }
    public Triangle(double edge1, double edge2, double edge3){
        super();
        this.edge1=edge1;
        this.edge2=edge2;
        this.edge3=edge3;
    }
    public Triangle(double edge1,double edge2, double edge3,String color,boolean filled, Coordinates center){
        super(color,filled,center);
        this.edge1=edge1;
        this.edge2=edge2;
        this.edge3=edge3;
    }

    public double getEdge1() {
        return edge1;
    }

    public void setEdge1(double edge1) {
        this.edge1 = edge1;
    }

    public double getEdge2() {
        return edge2;
    }

    public void setEdge2(double edge2) {
        this.edge2 = edge2;
    }

    public double getEdge3() {
        return edge3;
    }

    public void setEdge3(double edge3) {
        this.edge3 = edge3;
    }
    public double getArea(){
        double p = (edge1 + edge2 + edge3)/2;
        return sqrt(p*(p - edge1)*(p - edge2)*(p - edge3));
    }
    public double getPerimeter(){
        return (edge1 + edge2 + edge3);
    }
    @Override
    public void info(){
        System.out.println("Day la hinh tam giac: (do dai 3 canh) " + edge1 + " " + edge2 + " " + edge3);
    }
}
