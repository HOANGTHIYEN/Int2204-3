/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagram123;

import java.util.ArrayList;

/**
 *
 * @author Xuan Dung
 */
public class Layer {
    public ArrayList<Shape> shape;
    public Layer(){
        shape = new ArrayList<>();
    }
    
    //hàm xóa hình tam giác
    public void del_Triangle(){
        for(int i = 0; i < shape.size(); i++){
            if(shape.get(i) instanceof Triangle) shape.remove(i);
        }
    }
    
    // hàm Visible
    public void SetVisible(boolean drawing){
        for(int i=0;i<shape.size();i++){
            shape.get(i).show(drawing);
        }
    }    
   
    //hàm xóa nếu trùng loại, trùng vị trí, trùng thuộc tính, có thể không trùng m
      public void del_equals(){
        for(int i=0;i<shape.size()-1;i++){
            for(int j=i+1;j<shape.size();j++){
                if(shape.get(i).sameLoc(shape.get(j)) && shape.get(i).equals(shape.get(j))){
                    shape.remove(j);
                }
            }
        }
    }
}