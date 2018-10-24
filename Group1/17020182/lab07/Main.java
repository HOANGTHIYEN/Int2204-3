package lab6;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        Diagram d = new Diagram();
        Layer a = new Layer();
        a.add(new Triangle(22, 44, 50,"green",true,new location(3,4)));
        a.add(new Circle(3,"red",false,new location(5,6)));
        a.add(new Circle(3,"red",false,new location(5,6)));
        a.add(new Rectangle(40, 55,"blue",true,new location(3,4)));
        a.add(new Square(5,"red",true,new location(8,10)));
        a.add(new Hexagon(2, 2, 3, 6, 2, 7, 8, 0, 7, 6, 5, 4, "red", false, 6, 8));
        
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
        d.eraseSameCricle();
        for(int j = 0;j < d.size();j ++){
            for(int k = 0;k <d.elementAt(j).size();k ++)
            {
            	d.elementAt(j).elementAt(k).show();
            }    
        }
        System.out.println("\n Xóa hình trung nhau \n");
        a.deleteSameObject();
        
        for(int j = 0;j < d.size();j ++){
            for(int k = 0;k <d.elementAt(j).size();k ++)
            {
            	d.elementAt(j).elementAt(k).show();
            }    
        }
        GiaoDien m=new GiaoDien();  
        JFrame f=new JFrame();  
        f.add(m); 
       // f.add(new TestPane());
        f.setSize(400,400);  
     // f.setLayout(null);  
        f.setVisible(true); 
        
        
     
}
}