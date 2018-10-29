
package lab7;

import java.util.Vector;
import java.util.Vector;

public class Layer extends Vector<Shape> {

    protected boolean visible;

    public void setVisible(boolean a) {
        this.visible = a;
    }

    public boolean getVisble() {
        return this.visible;
    }

    public Layer(int initialCapacity) {
        super(initialCapacity);     //gọi hàm khởi tạo của lớp Shape
    }

    public Layer() {
        super(0);
    }
    public void rutgon (Layer t){  // xoa cac hinh giong nhau trong Layer
          for (int i = 0; i < t.size();i++){ 
              for (int j = 0; j < t.size();j++){ 
                  if(t.elementAt(i).equals(elementAt(j))){
                      t.remove(j);
                      j--;
                  }
              }
          }
      }
    public Layer Hinhtron(Layer t){ // Luu cac hinh tron vao 1 layer khac
        Layer ht = new Layer();
        for (int i = 0; i < t.size();i++){    
            if (t.elementAt(i) instanceof Circle ) {
                ht .add (t.elementAt(i));
                 t.remove(i);
                 i--;
            }
        }
        return ht;    
    }
    public Layer HinhCN(Layer t){ // Luu cac hinh CN vao 1 layer khac
        Layer hcn = new Layer();
        for (int i = 0; i < t.size();i++){    
            if (t.elementAt(i) instanceof Rectangle ) {
                hcn .add (t.elementAt(i));
                 t.remove(i);
                 i--;
            }
        }
        return hcn;    
    }
     public Layer HinhTG(Layer t){ // Luu cac hinh tam giac vao 1 layer khac
        Layer htg = new Layer();
        for (int i = 0; i < t.size();i++){    
            if (t.elementAt(i) instanceof Triangle ) {
                htg .add (t.elementAt(i));
                 t.remove(i);
                 i--;
            }
        }
        return htg;    
    }
      public Layer HinhKhac(Layer t){ // Luu cac hinh con  lai vao 1 layer moi
        Layer hk = new Layer();
        for (int i = 0; i < t.size();i++){    
                hk .add (t.elementAt(i));
                 t.remove(i);
                 i--;  
        }
        return hk;    
    }
      
}



