import java.util.ArrayList;
import java.util.Vector;

public class Layer{
    protected ArrayList<Shape> shapes = new ArrayList<>();

    public void eraseTriangle()
    {
        int i = 0;
        for(i = 0; i < shapes.size(); i++)
        {
            if(shapes.get(i) instanceof  Triangle)
            {
                shapes.remove(i);
                i--;
            }
        }
    }
}
