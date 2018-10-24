public class Square extends Rectangle{


    public Square(double side) {
        super(side, side);
        name = "vuong";
    }

    public Square(ToaDo toaDo, boolean filled, double side) {
        super(toaDo, filled, side, side);
        name = "vuong";
    }

    public Square() {
        name = "vuong";
    }

    public double getSide (){
        return height;
    }

    public void setSide( double side){
        height = side;
        width = side;
    }
    public void setHeight ( double side){
        height = side;
        width = side;
    }
    public void setWidth ( double side){
        height = side;
        width = side;
    }
    public void setSize (){
        size = getSide()*getSide();
    }
    public double getSize(){
        return size;
    }
}
