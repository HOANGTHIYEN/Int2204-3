import java.util.ArrayList;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Layer {
    boolean visiable;
    ArrayList<Shape> layer = new ArrayList<Shape>();

    public Layer(boolean visiable) {
        this.visiable = visiable;
    }
    public void xoa_hinh_trung() {
        for (int i=0; i<layer.size(); i++)
            for (int j=0; j<layer.size(); j++) {
                if (i!=j && layer.get(i).equals(layer.get(j)) ) {
                    layer.remove(j);
                }
            }
    }
    public boolean getVisiable() {
        return visiable;
    }

    public void setVisiable(boolean visiable) {
        this.visiable = visiable;
    }
}