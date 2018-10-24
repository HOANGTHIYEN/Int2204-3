public class Square extends Shape{
    private int size;
    public Square() {}
    public Square(int x, int y,int size) {
        super.x = x;
        super.y = y;
        this.size = size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public int getSize() {
        return size;
    }
    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}