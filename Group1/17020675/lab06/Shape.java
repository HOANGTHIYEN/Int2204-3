public class Shape {
    protected ToaDo toaDo;
    protected double size;
    protected boolean filled;
    String name;
    public Shape() {
    }

    public Shape(ToaDo toaDo, boolean filled) {
        this.toaDo = toaDo;

        this.filled = filled;
    }

    public ToaDo getToaDo() {
        return toaDo;
    }

    public void setToaDo(ToaDo toaDo) {
        this.toaDo = toaDo;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public void fixToado (double x, double y) {
        toaDo = new ToaDo(x,y);

    }
}
