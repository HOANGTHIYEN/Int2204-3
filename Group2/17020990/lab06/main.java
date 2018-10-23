/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author Quoc
 */
public class main {

	public static void main(String[] args) {
	Diagram diagram = new Diagram();
        Layer layer = new Layer();
        layer.add(new Triangle(3, 4, 5,"red",true,new Toadodiem(5,8)));
        
        layer.add(new Circle(3,"red",false,new Toadodiem(8,10.5)));
        
        layer.add(new Rectangle(8,14, "blue",true,new Toadodiem(4,8)));
        
        layer.add(new Square(5,"red",true,new Toadodiem(4,5)));
        
        for(int j = 0;j < layer.size();j ++)
        	
        	layer.elementAt(j).info();
        	layer.eraseTriangle();
        	
        System.out.println("Xoa hinh tam giac: \n");
        
        for(int j = 0;j < layer.size();j ++)
           layer.elementAt(j).info();
        		diagram.add(layer);
        		diagram.eraseCricle();
        		
        System.out.println("Sau khi xoa hinh tron:\n");
        for(int j = 0;j < diagram.size();j ++){
        	
            for(int k = 0;k <diagram.elementAt(j).size();k ++)
            diagram.elementAt(j).elementAt(k).info();
        }
        
}

}