/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

/**
 *
 * @author Admin
 */
import java.awt.Color;
import java.awt.EventQueue;

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater( () -> {     //invokeLater() -> chạy chương trình trong một luồng do EventQueue quản lý.
			Diagram rendered = new Diagram();
			Layer layer = new Layer();
			Layer layernull = new Layer();
			Layer layervisible = new Layer();
                        
			toaDo p1 = new toaDo(0,0);
			toaDo p2 = new toaDo(100,0);
			toaDo p3 = new toaDo(90,100);
                        toaDo A = new toaDo(100,100);
                        toaDo B = new toaDo(0,200);
                        toaDo C = new toaDo(100,300);
                        toaDo D = new toaDo(200,300);
                        toaDo E = new toaDo(300,200);
                        toaDo F = new toaDo(200,100);
                        
                        layer.addShape(new Circle(150));
			layer.addShape(new Rectangle(300,300));
			layer.addShape(new Square(10,10,Color.BLACK,false,30));
			layer.addShape(new Triangle(p1,p2,p3));
			layer.addShape(new Hexagon(A,B,C,D,E,F));
			layernull.addShape(new Hexagon(new toaDo(10,10),new toaDo(0,20),new toaDo(10,30),new toaDo(20,30),new toaDo(30,20),new toaDo(20,10)));
			layernull.getShape(0).reColor(Color.RED);
                        
                        layervisible.addShape(new Circle(150));
			layervisible.addShape(new Circle(150));
			layervisible.addShape(new Circle(150));
                        layervisible.getShape(0).reColor(Color.BLUE);
                        
			layervisible.addShape(new Square(200));
			layervisible.addShape(new Square(200));
			layervisible.addShape(new Rectangle(100,300));
                        
			layervisible.clearAllMatch();
			layernull.clearAllMatch();
			layer.clearAllMatch();
                        
			layervisible.getShape(1).reColor(Color.RED);
			layer.getShape(4).reColor(Color.BLACK);
                        
			rendered.addLayer(layer);
			rendered.addLayer(layernull);
			rendered.addLayer(layervisible);
			rendered.getLayer(0).getShape(3).remove(30, 20);
			rendered.reOrganized();
			rendered.getLayer(1).getShape(1).reColor(Color.GREEN);;
	});
    }

}