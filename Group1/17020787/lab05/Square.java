package lap5;
class Square extends Rectangle {

   public  Square(){
       super();
   }

    public Square(String color, Boolean filled, double side) {
        super(color, filled, side,side);
    }

    public Square(double side) {
        super(side,side);
    }

    public double getSide(){
        if(getLength()==getWidth())
            return getLength();
        else return -1;
    }

    public void setSide(double side){
        this.length =side;
        this.Width=side;
    }
    public void setWidth(double side){
       setSide(side);
    }
    public void setLength(double side){
        setSide(side);
    }

    @Override
    public String toString() {
        return "Square{"+"side"+getSide()+'}';
    }
}
