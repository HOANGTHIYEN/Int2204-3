package lab06;


public class Square extends Rectangle {
    double size;
    public Square() {
    }

    public Square(double size) {
        super(size, size);
        this.size=size;
    }

    public Square(String color, boolean filled,XY xy, double size) {
        super(color, filled,xy, size, size);
        this.size= size;
    }

    public double getsize() {
        return size;
    }

    public void setsize(double size) {
        this.length= size;
        this.width = size;
    }
    @Override
    public void setWidth (double size){
        this.length= size;
        this.width = size;
    }

    @Override
    public void setLength(double size) {
        this.length= size;
        this.width = size;
    }

    @Override
    public String toString() {
        return "Square{" + "size=" + size + '}';
    }

}
