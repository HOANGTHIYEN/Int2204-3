package lab6;

class location{
    private double x, y;
     public location() {
    }
     public location(double x, double y) {
        this.x = x;
        this.y = y;
    }
     public double getX() {
        return x;
    }
     public void setX(double x) {
        this.x = x;
    }
     public double getY() {
        return y;
    }
     public void setY(double y) {
        this.y = y;
    }
    public String toString()
    {
        return ("( " + x +", " + y +" )");
    }
} 
