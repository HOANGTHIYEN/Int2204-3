/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w6;

import java.util.ArrayList;

/**
 *
 * @author Do Tuan Bac
 */
public  class Layer extends Shape{
   protected ArrayList<Shape> shape=new ArrayList<Shape>();
   
   protected void delete()
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
   }

