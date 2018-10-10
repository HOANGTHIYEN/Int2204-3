
package shape;

public class test {
    public static void main(String args[]){
        // bai1
        
        CamCaoPhong ccp=new CamCaoPhong("Cam","Cam Cao Phong",10000,"Ha Noi","09/07",100,"Ha Noi");
        System.out.println(ccp.toString());
        CamSanh cs=new CamSanh("Chua","cam","Cam Sanh",10000,"Ha Noi","09/07",100);
        System.out.println(cs.toString());
        QuaTao qt=new QuaTao("Qua tao",10000,"Vinh Phuc","23/11",100,"24/11");
        System.out.println(qt.toString());
        
        // bai2
        
        Shape sh=new Shape("den",false);
        System.out.println("Shape: "+sh.toString());
        Circle cr = new Circle(2.0,"red",true);
        System.out.println("Circle: "+cr.toString());
        Rectangle re = new Rectangle(7.0,9.0,"red",true);
        System.out.println("Rectangle: "+re.toString());
        Square sq=new Square(4.0,"red",true);
        System.out.println("Square: "+sq.toString());
    }
}
