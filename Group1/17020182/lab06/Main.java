package lab6;

public class Main {
    public static void main(String[] args) {
        Diagram d = new Diagram();
        Layer a = new Layer();
        a.add(new Triangle(22, 44, 50,"green",true,new location(3,4)));
        a.add(new Circle(3,"red",false,new location(5,6)));
        a.add(new Rectangle(40, 55,"blue",true,new location(3,4)));
        a.add(new Square(5,"red",true,new location(8,10)));
        
        for(int j = 0;j < a.size();j ++)
        {
        	 a.elementAt(j).show();
        }
           
        
        System.out.println("\n xóa hình tam giác: \n");
        a.eraseTriangle();
        for(int j = 0;j < a.size();j ++)
        {
        	 a.elementAt(j).show();
        }
          
        d.add(a);
        d.eraseCricle();
        System.out.println("\n Xóa hình tròn: \n");
        for(int j = 0;j < d.size();j ++){
            for(int k = 0;k <d.elementAt(j).size();k ++)
            {
            	d.elementAt(j).elementAt(k).show();
            }
                
        }
     
}
}