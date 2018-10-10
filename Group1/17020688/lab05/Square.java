/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;




public class Square extends Rectangle{
    
   double side;

    

    public Square()
    {

      
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        
        super.setWidth(side);
        super.setlength(side);
                
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        super.setLength(side);
                
     super.setWidth(side);
    }
       public Square(double side,String color, boolean filled) 
    {
               super(side,side,color,filled);
                
                
    
    }
   @Override
         public String toString()
    {
        return super.toString();
    }
}
    
       
    


      
     
    
   
    
        
    
         
    
    
     

   

   
  
    
    
    
    
    
    
    

