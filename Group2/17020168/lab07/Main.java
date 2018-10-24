package Lab07;

public class Main {
    public static void main(String[] args) {
        Diagram d = new Diagram();
        Layer ly = new Layer();
        ly.add(new Triangle(22, 44, 50,"green",true,new Location(3,4)));
        ly.add(new Circle(3,"red",false,new Location(5,6)));
        ly.add(new Rectangle(40, 55,"blue",true,new Location(3,4)));
        ly.add(new Square(5,"red",true,new Location(8,10)));
//        for(int j = 0;j < ly.size();j ++)
//        {
//            ly.elementAt(j).toString();
//        }
        for (int i = 0; i < ly.size(); i++) {
            ly.elementAt(i).showInfo();
        }
        System.out.println("\n xóa hình tam giác: \n");
        ly.eraseTriangle();
        for(int j = 0;j < ly.size();j ++)
        {
            ly.elementAt(j).showInfo();
        }
        d.add(ly);
        d.eraseCricle();
        System.out.println("\n Xóa hình tròn: \n");
        for(int j = 0;j < d.size();j ++){
            for(int k = 0;k <d.elementAt(j).size();k ++)
            {
                d.elementAt(j).elementAt(k).showInfo();
            }
        }

    }
}
