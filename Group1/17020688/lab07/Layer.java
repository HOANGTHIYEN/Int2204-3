import java.util.ArrayList;
import javafx.scene.shape.Rectangle;
import javax.sound.midi.Receiver;

public class Layer {
    boolean  visible ;
    
            
	ArrayList<Shape> layer = new ArrayList<>();
	public void addShape(String shape) {
		switch(shape) {
		case "circle":
			Shape s = new Circle();
			this.layer.add(s);
			break;
		case "triangle":
			Shape s1 = new Triangle();
			this.layer.add(s1);
			break;
		case "retangle":
			Shape s2 = new Retangle();
			this.layer.add(s2);
			break;
		case "square":
			Shape s3 = new Square();
			this.layer.add(s3);
			break;
		default:
			break;
		}
	}
	
	public void deleteTriangle() {
		for (int i=0; i<this.layer.size(); i++){
			if (this.layer.get(i) instanceof Triangle) { 
				this.layer.remove(i);
				i--;
			}
		}
	}
	public void deleteCircle() {
		for (int i=0; i<this.layer.size(); i++){
			if (this.layer.get(i) instanceof Circle) {
				this.layer.remove(i);
				i--;
			}
		}
	}
        public void deletesame()
        {
            for(int i=0;i<this.layer.size()-1;i++)
            {
                for(int j=i+1;j<this.layer.size();j++)
                {
                    if ((this.layer.get(i) instanceof Circle) && (this.layer.get(j) instanceof Circle))
                    {
				   if (((Circle)this.layer.get(i)).r==((Circle)this.layer.get(j)).r)
                                  {
                                      this.layer.remove(j);
                                      
                                  }
			}
                    
                     if ((this.layer.get(i) instanceof Triangle) && (this.layer.get(j) instanceof Triangle))
                    {
				   if ((((Triangle)this.layer.get(i)).cd==((Triangle)this.layer.get(j)).cd)&&(((Triangle)this.layer.get(i)).c==((Triangle)this.layer.get(j)).c)&&(((Triangle)this.layer.get(i)).h==((Triangle)this.layer.get(j)).h))
                                  {
                                      this.layer.remove(j);
                                      
                                  }
			}
                   
                    
                }
            }
        }
}