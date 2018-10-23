/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

import java.util.ArrayList;


public class Layer {
  
  protected ArrayList<Shape> shapes;

   
 private String name;


   
 protected int chiso;

  
  Layer(){
        shapes = new ArrayList<>();
    }

   
 public int getChiso() {
        return chiso;
    }

   
 public void setChiso(int n) {
        
     this.chiso = n;
 
   }

   
 public String getName() {
        return name;
    }

   
 public void setName(String name) {
        this.name = name;
   
 }


    
public void drawCircle(Shape Circle){
       

 int size = shapes.size();
   
     System.out.println(size);
      
  Circle.setChiso(size);
       
     shapes.add(Circle);
        Circle.vehinh();
    }

  
  public void drawRectangle(Shape Rectangle){
     
   int size = shapes.size();
    
    Rectangle.setChiso(size);
      
  shapes.add(Rectangle);
  
      Rectangle.vehinh();
    }

  
  public void drawSquare(Shape Square){
  
      int size = shapes.size();Square.setChiso(size);
      
  shapes.add(Square);
        Square.vehinh();
    }

  
  public void drawTriangle(Shape Triangle){

  
      int size = shapes.size();
     
   Triangle.setChiso(size);
      
  shapes.add(Triangle);
        Triangle.vehinh();
    }

   
 public Shape getShape(int index){
       
 return shapes.get(index);
    }

   
 public boolean deleteAllTriangle(){
     
   for(int i = 0; i<shapes.size(); i++){
         
        if(shapes.get(i) instanceof Triangle){
   
             shapes.remove(i);
            }
        }
    
    for (int i = 0; i<shapes.size(); i++){
        
    if(shapes.get(i) instanceof Triangle){
        
   
             return false;
            }
        }
   
     return true;
    }


   
 public boolean deleteAllCircle(){
       
 for(int i = 0; i<shapes.size(); i++){
           
        if(shapes.get(i) instanceof Circle){
    
            shapes.remove(i);
            }
        }
  
      for (int i = 0; i<shapes.size(); i++){
    
        if(shapes.get(i) instanceof Triangle){
       
         System.out.println("Still have circle");
   
             return false;
            }
        }
  
      return true;
    }

}

