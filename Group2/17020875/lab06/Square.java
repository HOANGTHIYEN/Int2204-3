public class Square extends Rectangle{

    public Square(String color, boolean filled,double side, double x1, double x2, double x3, double x4, double y1, double y2, double y3, double y4)
        {

        super(color,filled,side, side, x1, x2, x3, x4, y1, y2, y3, y4 );
    }
    public void setSide(double side)
    {

        width = side;
        length = side;
    }
    public double getSide()
    {
        return super.width;
    }


    @Override
    public void setLength(double side) {
        setSide(side);
    }

    @Override
    public void setWidth(double side) {
        setSide(side);
    }


}