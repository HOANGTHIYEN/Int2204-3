public class Square extends Rectangle{
    private int x, y, canh;
    

    public Square(boolean fill, int x, int y,int canh) {
        super(fill, x, y, canh, canh);
        this.canh = canh;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getCanh() {
        return canh;
    }

    public void setCanh(int canh) {
        this.canh = canh;
    }
    public boolean ok(Square s){
        if(this.x == s.x && this.y == s.y && this.canh == s.canh)
            return true;
        return false;
    }
    public void move(int x_new, int y_new){
       
        this.x = x_new;
        this.y = y_new;
    }
    
}