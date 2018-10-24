package lab06;

import java.util.Vector;

public class Diagram extends Vector<Layer> {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void deleteCircle (){
        for (int i=0;i<this.size();i++){
            for (int j=0;j<this.elementAt(i).size();j++)
            if (this.elementAt(i).elementAt(j) instanceof Circle){
                this.elementAt(i).remove(j);
                j--;
            }
        }
    }

}
