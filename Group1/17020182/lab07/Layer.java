package lab6;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Label;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


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
    public static void mainGiaoDien(String[] args) {  
        GiaoDien m=new GiaoDien();  
        JFrame f=new JFrame();  
        f.add(m);  
        f.setSize(400,400);  
     // f.setLayout(null);  
        f.setVisible(true);  
    }  
    
    //xóa tất cả các hình trùng nhau
    public void deleteSameObject(){
        for (int i=0;i<this.size()-1;i++){
            for (int j=i+1;j<this.size();j++){
                if (this.get(i) instanceof Circle){
                    if (this.get(j) instanceof Circle){
                            if (((Circle)this.get(i)).radius==((Circle)this.get(j)).radius){
                                this.remove(j);
                                j--;
                            }
                        
                    }
                }
                
                if (this.get(i) instanceof Triangle){
                    if (this.get(j) instanceof Triangle){
                        if (((Triangle)this.get(i)).getPerimeter()==((Triangle)this.get(j)).getPerimeter()){
                            this.remove(j);
                            j--;
                        }
                    }
                }
                
                if (this.get(i) instanceof Rectangle){
                    if (this.get(j) instanceof Rectangle){
                        if (((Rectangle)this.get(i)).getPerimeter()==((Rectangle)this.get(j)).getPerimeter()){
                                    this.remove(j);
                                    j--;
                        }
                    }
                }
            
             }
        }
    }
    

   
    

}



	
	
