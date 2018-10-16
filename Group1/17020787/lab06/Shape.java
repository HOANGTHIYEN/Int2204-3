package lap6;

abstract class Shape {
    protected String Color;
    protected Boolean filled;
    protected toado center;
    public abstract String toString();
    protected toado[] toadod=new toado[3];

    public Shape() {
        this.Color = "Red";
        this.filled = true;
        center=new toado();
    }

    public Shape(String color, Boolean filled, toado center) {
        this.Color = color;
        this.filled = filled;
        this.center = center;
    }


    public String getColor() {
        return this.Color;
    }

    public void setColor(String color) {
        this.Color = color;
    }

    public Boolean getFilled() {
        return this.filled;
    }

    public toado getCenter() {
        return center;
    }

    public void setCenter(toado center) {
        this.center = center;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public void dichuyen(double dodai, String huong) {
        switch (huong) {
            case "tren":
                center.setY(center.getY() - dodai);
                break;
            case "duoi":
                center.setY(center.getY() + dodai);
                break;
            case "trai":
                center.setX(center.getX() - dodai);
                break;
            case "phai":
                center.setX(center.getX() + dodai);
                break;
            default:
                break;
        }

    }
}
