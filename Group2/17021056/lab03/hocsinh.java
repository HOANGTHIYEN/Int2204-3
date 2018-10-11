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
public class hocsinh {
    String Name;
    int Age;
    String Trinhdohocvan;
    String Viecthuongngay;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getTrinhdohocvan() {
        return Trinhdohocvan;
    }

    public void setTrinhdohocvan(String Trinhdohocvan) {
        this.Trinhdohocvan = Trinhdohocvan;
    }

    public String getViecthuongngay() {
        return Viecthuongngay;
    }

    public void setViecthuongngay(String Viecthuongngay) {
        this.Viecthuongngay = Viecthuongngay;
    }
    public String getinfo()
    {   return "ten :" +Name +".\ntuoi: " +Age+ ".\nViecthuongngay:"+Viecthuongngay +".\nTrinh do hoc van:"+Trinhdohocvan+"\n"; 
    }
    public hocsinh()
    {
    }
}
