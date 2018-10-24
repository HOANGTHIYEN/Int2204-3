package JavaWeek7;

abstract class Shape {
    protected String color;
    protected boolean filled;
    protected double pos_x;
    protected double pos_y;
    
    public Shape(String color, boolean filled, double pos_x, double pos_y){
        this.color = color;
        this.filled = filled;
        this.pos_x = pos_x;
        this.pos_y = pos_y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public double getPos_x() {
        return pos_x;
    }

    public void setPos_x(double pos_x) {
        this.pos_x = pos_x;
    }

    public double getPos_y() {
        return pos_y;
    }

    public void setPos_y(double pos_y) {
        this.pos_y = pos_y;
    }

    public void moveTo(double x, double y){
        this.pos_x = x;
        this.pos_y = y;
    }
    @Override
    public String toString() {
        return color+" "+filled;
    }
    
}


