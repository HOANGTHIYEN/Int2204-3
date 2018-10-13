/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;


public class hoaqua {
  protected String xuatxu;
  protected double gia;
  protected String day;

    public hoaqua() {
        super();
    }
   
   public hoaqua(String xuatxu,double gia,String day)
   {
       this.xuatxu=xuatxu;
       this.gia=gia;
       this.day=day;
       
   }
   public void setxx(String xuatxu)
   {
       this.xuatxu=xuatxu;
       
   }
   public void setday(String day)
   {
       this.day=day;
   }
   public void setgia(double gia)
   {
       this.gia=gia;
       
   }
   public String getxx()
   {
       return xuatxu;
   }
   public String getday()
   {
       return day;
   }
   public double getgia()
   {
       return gia;
   }
}
