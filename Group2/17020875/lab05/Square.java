public class Square extends Rectangle{
    public Square()
    {

        super(); // triệu hồi constructor gần nhất của lớp cha
    }
    public Square(double side)
    {


        super(side,side);
    }
    public Square(double side, String color, boolean filled)
    {

        super(side, side, color,filled);
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

    @Override
    public String toString() {
        return super.toString();
    }
}
