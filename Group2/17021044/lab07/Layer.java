/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;


public  class Layer extends Shape{
   protected ArrayList<Shape> shape=new ArrayList<Shape>();
   protected boolean visible=true;
   
   protected void deleteTriangle()
   {
       int i=0;
      while(i!=shape.size())
      {
          
           if(shape.get(i) instanceof Triangle)
           {
               shape.remove(i);
               i=0;
           }
           else i++;
          }
       }
   protected void deletedSameAS()
   {
       for(int i=0;i<shape.size();i++)
       {
          for(int j=i;j<shape.size();j++)
            {
               if(shape.get(i) instanceof Circle &&  shape.get(j) instanceof Circle)
                    {
                            if(((Circle)shape.get(i)).radius==((Circle)shape.get(j)).radius && ((Circle)shape.get(i)).X==((Circle)shape.get(j)).X && ((Circle)shape.get(i)).Y==((Circle)shape.get(j)).Y) 
                            {
                                shape.remove(j);
                            }
                            j--;
                                    
                    }
             }
       }
       for(int i=0;i<shape.size();i++)
       {
          for(int j=i;j<shape.size();j++)
            {
               if(shape.get(i) instanceof Triangle &&  shape.get(j) instanceof Triangle)
                    {
                            if(((Triangle)shape.get(i)).x1==((Triangle)shape.get(j)).x1 &&((Triangle)shape.get(i)).x2==((Triangle)shape.get(j)).x2 &&((Triangle)shape.get(i)).x3==((Triangle)shape.get(j)).x3
                                  &&((Triangle)shape.get(i)).y1==((Triangle)shape.get(j)).y1 &&((Triangle)shape.get(i)).y2==((Triangle)shape.get(j)).y2 && ((Triangle)shape.get(i)).y3==((Triangle)shape.get(j)).y3) 
                            {
                                shape.remove(j);
                            }
                            j--;
                                    
                    }
             }
       }
        for(int i=0;i<shape.size();i++)
       {
          for(int j=i;j<shape.size();j++)
            {
               if(shape.get(i) instanceof Rectangle &&  shape.get(j) instanceof Rectangle)
                    {
                            if(((Rectangle)shape.get(i)).width==((Rectangle)shape.get(j)).width&& ((Rectangle)shape.get(i)).length==((Rectangle)shape.get(j)).length && ((Rectangle)shape.get(i)).X==((Rectangle)shape.get(j)).X&&((Rectangle)shape.get(i)).Y==((Rectangle)shape.get(j)).Y) 
                            {
                                shape.remove(j);
                            }
                            j--;
                                    
                    }
             }
       }
         for(int i=0;i<shape.size();i++)
       {
          for(int j=i;j<shape.size();j++)
            {
               if(shape.get(i) instanceof Square &&  shape.get(j) instanceof Square)
                    {
                            if(((Square)shape.get(i)).Y==((Square)shape.get(j)).Y&& ((Square)shape.get(i)).X==((Square)shape.get(j)).X && ((Square)shape.get(i)).side==((Square)shape.get(j)).side) 
                            {
                                shape.remove(j);
                            }
                            j--;
                                    
                    }
             }
       }
           for(int i=0;i<shape.size();i++)
       {
          for(int j=i;j<shape.size();j++)
            {
               if(shape.get(i) instanceof Hexagon &&  shape.get(j) instanceof Hexagon)
                    {
                            if(((Hexagon)shape.get(i)).x==((Hexagon)shape.get(j)).x && ((Hexagon)shape.get(i)).y==((Hexagon)shape.get(j)).y&& ((Hexagon)shape.get(i)).side==((Hexagon)shape.get(j)).side) 
                            {
                                shape.remove(j);
                            }
                            j--;
                                    
                    }
             }
       }
    }
  }
   