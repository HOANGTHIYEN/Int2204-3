package Lab07;

public class Triangle extends Shape{
    private int[] tx = new int[3];
    private int[] ty = new int[3];


    public Triangle(int a1 , int a2, int a3, int b1, int b2, int b3, String n, boolean i, double x, double y){
        super(n,i,x,y);
        this.tx[0] = a1;
        this.tx[1] = a2;
        this.tx[2] = a3;
        this.ty[0] = b1;
        this.ty[1] = b2;
        this.ty[2] = b3;

    }
    public int[] getTX(){
        return this.tx;
    }
    public int[] getTY(){
        return this.ty;
    }
}
