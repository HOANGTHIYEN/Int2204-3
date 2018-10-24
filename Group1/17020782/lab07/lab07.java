
package lab07;

import java.util.ArrayList;
import java.util.Scanner;

 class Diagram {
    Layer Circle = new Layer();
    Layer Rectangle = new Layer();
    Layer Square = new Layer();
    Layer Triangle = new Layer();
    Layer Hexagon = new Layer();
    
    
    ArrayList<Layer> listlayer = new ArrayList<>();
    
    public void intoado(int n) {
        for(int i = 0; i < n; i++) {
            Layer layer = new Layer();
            layer.input();
            listlayer.add(layer);
        }
    }
    
    public void outtoado() {
        for (int i = 0; i < listlayer.size(); i++) {
            for (int j = 0; j < listlayer.get(i).getLayer().size(); j++) {
                listlayer.get(i).getLayer().get(j).output();
            }
        }
    }
    
    public void xoaCircleDiagram() {
        for (int i = 0; i < listlayer.size(); i++) {
            for (int j = 0; j < listlayer.get(i).getLayer().size(); j++) {
                if (listlayer.get(i).getLayer().get(j) instanceof circle)
                listlayer.get(i).getLayer().remove(j);
                
            }
        }
    }
    
    public void inLayer() {
        for(int i = 0; i < listlayer.size(); i++){
            for(int j = 0; j < listlayer.get(i).layer.size(); j++){
                if(listlayer.get(i).layer.get(j) instanceof circle){
                    Circle.layer.add(listlayer.get(i).layer.get(j));
                }else if(listlayer.get(i).layer.get(j) instanceof Rectangle){
                    Rectangle.layer.add(listlayer.get(i).layer.get(j));
                }else if(listlayer.get(i).layer.get(j) instanceof Square){
                    Square.layer.add(listlayer.get(i).layer.get(j));
                }else if(listlayer.get(i).layer.get(j) instanceof Triangle){
                    Triangle.layer.add(listlayer.get(i).layer.get(j));
                } else if(listlayer.get(i).layer.get(j) instanceof hexagon){
                    Hexagon.layer.add(listlayer.get(i).layer.get(j));
                }
            }
        }
    }
   
    
}
 class shape {
	    protected int x;
	    protected int y;
	    Scanner scan = new Scanner(System.in);
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
	    public void input() {
			
			System.out.println("Nhap x ");
			 x = scan.nextInt();
			System.out.println("Nhap y ");
			 y = scan.nextInt(); 
		}
		public void output() {
			
			System.out.println("x " + x);
			System.out.println("y " + y);
		}
		public void move( int x, int y) {
			this.x = x;
			this.y = y;
		}
		public void paint() {
	            
		}
	}
 class Layer {
    public ArrayList<shape> layer = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    private boolean visible;


    public ArrayList<shape> getLayer() {
        return layer;
    }

    public void setLayer(ArrayList<shape> layer) {
        this.layer = layer;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    
    public void input() {
        int luachon;
        OUTER:
        do {
            System.out.println("Nhap thuoc tinh TRUEorFALSE: ");
            visible = scan.nextBoolean();
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Triangle");
             System.out.println("5. Hexagon");
            System.out.println("6. Thoat");
            do {
                System.out.println("Nhap lua chon: ");
                luachon = scan.nextInt();
                if ( luachon < 0 || luachon > 6) {
                    System.out.println("Ko hop le");
                }
            } while (luachon < 0 || luachon > 6);
            switch (luachon) {
                case 1:
                    {
                        shape sh = new circle();
                        sh.input();
                        layer.add(sh);
                        break;
                    }
                case 2:
                    {
                        shape sh = new Rectangle();
                        sh.input();
                        layer.add(sh);
                        break;
                    }
                case 3:
                    {
                        shape sh = new Square();
                        sh.input();
                        layer.add(sh);
                        break;
                    }
                case 4:
                    {
                        shape s = new Triangle();
                        s.input();
                        layer.add(s);
                        break;
                    }
                case 5:
                {
                    shape s = new hexagon();
                    s.input();
                    layer.add(s);
                }
                case 6:
                    break OUTER;
                default:
                    break;
            }
        } while (luachon > 0 && luachon < 6);
    }
    
    public void output() {
        for (int i = 1; i <= layer.size(); i++) {
            layer.get(i).output();
        }
    }
    
    public void xoaTriangle() {
        for (int i = 1; i < layer.size(); i++) {
            if (getLayer().get(i) instanceof Triangle) {
                getLayer().remove(i);
                i--;
            }
        }
    }
    
    public boolean sameShape(shape s1, shape s2) {
        if (s1 instanceof circle && s2 instanceof circle) {
            if (((circle)s1).sameCircle((circle)s2)) {
                return true;
            }
        }
        
        if (s1 instanceof Rectangle && s2 instanceof Rectangle) {
            if (((Rectangle)s1).sameRectangle((Rectangle)s2)) {
                return true;
            }
        }
        
        if (s1 instanceof Triangle && s2 instanceof Triangle) {
            if (((Triangle)s1).sameTriangle((Triangle)s2)) {
                return true;
            }
        }
        
        if (s1 instanceof Square && s2 instanceof Square) {
            if (((Square)s1).sameSquare((Square)s2)) {
                return true;
            }
        }
        
        if (s1 instanceof hexagon && s2 instanceof hexagon) {
            if (((hexagon)s1).sameHexagon((hexagon)s2)) {
                return true;
            }
        }
        return false;    
        
    }
    
    public void removeShape() {
        for (int i = 0; i < layer.size(); i++) {
            for (int j = i+1; j < layer.size(); j++) {
                if ((sameShape(layer.get(i), layer.get(j))) == true) {
                    layer.remove(j);
                    j--;
                }
            }
        }
    }
}
  
   class Triangle extends shape{
		double bottom;
		double height;
	        public double getBottom() {
			return bottom;
		}
		public void setBottom(double bottom) {
			this.bottom = bottom;
		}
		public double getHeight() {
			return height;
		}
		public void setHeight(double height) {
			this.height = height;
		}
		public boolean sameTriangle(Triangle tr1) {
			if(x == tr1.x && y == tr1.y && height == tr1.height
				&& bottom == tr1.bottom	) {
			return true;}
			
			return false;
		}
		public void Input() {
			super.input();
			System.out.println("Nhap chieu dai: ");
			setHeight(super.scan.nextDouble());
			System.out.println("Nhap chieu rong: ");
			setBottom(super.scan.nextDouble());	
		}
		public void Output() {
			super.output();
			System.out.println("Chieu dai: " + getBottom());
			System.out.println("Chieu rong: " +getHeight() );
		}
	}
  
   class Rectangle extends shape{
	    protected double width = 1.0;
	    protected double length = 1.0;
	    public double getWidth() {
	        return width;
	    }

	    public void setWidth(double width) {
	        this.width = width;
	    }

	    public double getLength() {
	        return length;
	    }

	    public void setLength(double length) {
	        this.length = length;
	    }
	    
	    public boolean sameRectangle(Rectangle re)//xem 2 hinh chu nhat giong nhau k
	            
	    {
		if(x == re.x && y == re.y && width == re.width && length == re.width)
		return true;
			
		return false;
		}
	    @Override
	    public void input(){
	     super.input();
	        System.out.println("Nhap chieu dai ");
		setLength(super.scan.nextDouble());
		System.out.println("Nhap chieu rong ");
		setWidth(super.scan.nextDouble());
	    }
	    public void output() {
			
		System.out.println("hinh chu nhat");
		super.output();
		System.out.println("Chieu dai " + getLength());
		System.out.println("Chieu rong " + getWidth());
		
	    }
   }    
   class Square extends Rectangle{
	    private double side;

	    public double getSide() {
	        return side;
	    }

	    public void setSide(double side) {
	        this.side = side;
	    }
	    public boolean sameSquare(Square sq1) {
			
	    	return x == sq1.x && y == sq1.y && side == sq1.side;
	        }
	    @Override
	    public void input(){
	        super.input();
	        System.out.println("nhap canh hinh vuong");
	        side = super.scan.nextDouble();
	    }
	    @Override
	    public void output() {		
		super.output();
		System.out.println("Do dai canh la  " + length);
		}
	}
  class hexagon extends shape {
	    
		
		public int Length;
		public boolean sameHexagon(hexagon hx1) {
			
			return x == hx1.x && y == hx1.y && Length == hx1.Length;
		}
		public void Input() {
			
			super.input();
			System.out.println("Nhap chieu dai canh: ");
			Length = super.scan.nextInt();
			
		}
		
		public void Output() {
			super.output();
			System.out.println("Chieu dai canh: " + Length);
			
		}

		public int getLength() {
			return Length;
		}

		public void setLength(int length) {
			Length = length;
		}
	}
  class circle extends shape {
	    private double radius;

	    public double getRadius() {
	        return radius;
	    }

	    public void setRadius(double radius) {
	        this.radius = radius;
	    }
	    public boolean sameCircle(circle c) {// 2 hinh tron giong nhau hay khong
			
			if(x == c.x && y == c.y && radius == c.radius) {
				return true;
			}
			return false;
	    }
	    @Override
	    public void input() {
	        super.input();
	        System.out.println("Nhap ban kinh hinh tron ");
	        setRadius(super.scan.nextDouble());
		}
	    @Override
	    public void output() {	
	        System.out.println("hinh tron");
	        super.output();
	        System.out.println("Ban kinh la: " + radius);
		}
	}
public class lab07
{
	public void main(String[] args) {
       
    }
}
