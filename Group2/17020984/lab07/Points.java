package Shape;

public class Points {
    public int Ox;
    public int Oy;

    public Points(int x, int y){
        Ox = x;
        Oy = y;
    }


    public void setOx(int ox) {
        Ox = ox;
    }

    public void setOy(int oy) {
        Oy = oy;
    }

    public int getOy() {
        return Oy;
    }

    public int getOx() {
        return Ox;
    }
}
