public class Hexagon extends Shape{

    private int x1, y1,
            x2, y2,
            x3, y3,
            x4, y4,
            x5, y5,
            x6, y6;

    public Hexagon(boolean fill, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int x5, int y5, int x6, int y6) {
       super(fill);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
        this.x5 = x5;
        this.y5 = y5;
        this.x6 = x6;
        this.y6 = y6;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getX3() {
        return x3;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public int getY3() {
        return y3;
    }

    public void setY3(int y3) {
        this.y3 = y3;
    }

    public int getX4() {
        return x4;
    }

    public void setX4(int x4) {
        this.x4 = x4;
    }

    public int getY4() {
        return y4;
    }

    public void setY4(int y4) {
        this.y4 = y4;
    }

    public int getX5() {
        return x5;
    }

    public void setX5(int x5) {
        this.x5 = x5;
    }

    public int getY5() {
        return y5;
    }

    public void setY5(int y5) {
        this.y5 = y5;
    }

    public int getX6() {
        return x6;
    }

    public void setX6(int x6) {
        this.x6 = x6;
    }

    public int getY6() {
        return y6;
    }

    public void setY6(int y6) {
        this.y6 = y6;
    }
     public int binh_phuong_do_dai(int x1, int x2, int y1, int y2 ){
        return (x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
    }
    public boolean isTamGiacDeu(Triangle t){
        if(binh_phuong_do_dai(t.getX1(), t.getX2(), t.getY1(), t.getY2()) == binh_phuong_do_dai(t.getX2(), t.getX3(), t.getY2(), t.getY3()) && binh_phuong_do_dai(t.getX1(), t.getX3(), t.getY1(), t.getY3()) == binh_phuong_do_dai(t.getX2(), t.getX3(), t.getY2(), t.getY3()))
            return true;
        return false;
            }
    public boolean isHexagon(){
        int x_td = (x1+x4)/2, y_td = (y1+y4)/2;
        
        if(!isTamGiacDeu(new Triangle(true, x1, y1, x2, y2, x_td, y_td)))
            return false;
        if(!isTamGiacDeu(new Triangle(true, x2, y2, x3, y3, x_td, y_td)))
            return false;
        if(!isTamGiacDeu(new Triangle(true, x3, y3, x4, y4, x_td, y_td)))
            return false;
        if(!isTamGiacDeu(new Triangle(true, x4, y4, x5, y5, x_td, y_td)))
            return false;
        if(!isTamGiacDeu(new Triangle(true, x5, y5, x6, y6, x_td, y_td)))
            return false;
        if(!isTamGiacDeu(new Triangle(true, x6, y6, x1, y1, x_td, y_td)))
            return false;
        return true;
    }

}