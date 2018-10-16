class Shape{
    protected String color;
    protected boolean filled;
    protected Coordinates center;
    public Shape(){
        color = "red";
        filled = true;
    }

    public Shape(String color, boolean filled, Coordinates center) {
        this.color = color;
        this.filled = filled;
        this.center = center;
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

    public Coordinates getCenter(){
        return center;
    }

    public void setCenter(Coordinates center) {
        this.center = center;
    }
    public void dichuyen(double dodai, String huong){
        switch (huong) {
            case "bac":
                center.setY(center.getY() + dodai);
                break;
            case "nam":
                center.setY(center.getY() - dodai);
                break;
            case "dong":
                center.setX(center.getX() + dodai);
                break;
            case "tay":
                center.setX(center.getX() - dodai);
                break;
            default:
                break;
        }
    }

    public void info(){
        System.out.println("");
    }
}