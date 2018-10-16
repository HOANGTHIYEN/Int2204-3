package lab6;

import java.util.Vector;


class Layer extends Vector <Shape>{
   
    public Layer() {
        super(0);
    }
    public void eraseTriangle(){
        for(int j = 0;j < this.size();j ++)
            if(this.elementAt(j) instanceof Triangle){
                this.remove(j);
                j --;
            }
    }
}

	
	
