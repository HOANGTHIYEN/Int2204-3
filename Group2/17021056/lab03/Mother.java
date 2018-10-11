/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baithuchanhcau3;

/**
 *
 * @author Administrator
 */
public class Mother{
   String Name;
   String NgheNghiep;
   int Age;
   String content;

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setNgheNghiep(String NgheNghiep) {
        this.NgheNghiep = NgheNghiep;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return Name;
    }

    public String getNgheNghiep() {
        return NgheNghiep;
    }

    public int getAge() {
        return Age;
    }

    public String getContent() {
        return content;
    
    }
   public String getinfo()
    {   return "ten :" +Name +".\ntuoi: " +Age+ ".\nNghe Nghiep:"+ NgheNghiep+".\ncontent:"+content+"\n"; 
    }
    public Mother()
   {   
   }
    
    
    
}
