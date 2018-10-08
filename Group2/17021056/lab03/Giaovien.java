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
public class Giaovien {
    String Name;
    int Age;
    String Giangvienmon;
    String Trinhdohocvan;

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public void setGiangvienmon(String Giangvienmon) {
        this.Giangvienmon = Giangvienmon;
    }

    public void setTrinhdohocvan(String Trinhdohocvan) {
        this.Trinhdohocvan = Trinhdohocvan;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public String getGiangvienmon() {
        return Giangvienmon;
    }

    public String getTrinhdohocvan() {
        return Trinhdohocvan;
    }
     public String getinfo()
    {   return "ten :" +Name +".\ntuoi: " +Age+ ".\nGiang vien mon:"+Giangvienmon +".\nTrinh do hoc van:"+Trinhdohocvan+"\n"; 
    }
    public Giaovien()
    {
    }
}
