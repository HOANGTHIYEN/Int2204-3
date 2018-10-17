import java.util.ArrayList;
import java.util.Vector;
// drawPolygon
public class Diagram
{
    protected ArrayList<Layer> layers = new ArrayList<>();

    public void eraseCricle(){
        for(int j = 0;j < this.size();j ++){
            for(int k = 0;k < this.elementAt(j).size();k ++)
                if(this.elementAt(j).elementAt(k) instanceof Cricle){
                    this.elementAt(j).remove(k);
                    k --;
                }
        }
    }
}
