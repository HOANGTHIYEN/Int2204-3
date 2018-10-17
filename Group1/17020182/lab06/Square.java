package lab6;


class Square extends Rectangle{
    protected double side;
    public Square(){
        
    }
    public Square(double side){
        super(side, side);
        this.side = side;
    }    
     public Square(double side, String color, boolean filled, location mid) {
        super(side, side, color, filled, mid);
        this.side = side;
    }
    
    public double getSide() {
        return side;
    }
     public void setSide(double side) {
        this.side = side;
        this.width = side;
        this.length = side;
    }
 
    public void show(){
        System.out.println("Hinh vuong: " + side+" "+color  + " " + mid);
    }
}