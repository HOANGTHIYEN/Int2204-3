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
public class Nongdan {
    String Name;
    int Age;
    String Viecthuongngay;
    String Viecchinh;

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

    public String getViecthuongngay() {
        return Viecthuongngay;
    }

    public void setViecthuongngay(String Viecthuongngay) {
        this.Viecthuongngay = Viecthuongngay;
    }

    public String getViecchinh() {
        return Viecchinh;
    }

    public void setViecchinh(String Viecchinh) {
        this.Viecchinh = Viecchinh;
    }
     public String getinfo()
    {   return "ten :" +Name +".\ntuoi: " +Age+ ".\nViec thuong ngay:"+Viecthuongngay +".\nViec chinh:"+Viecchinh+"\n"; 
    }
    public Nongdan()
    {
    }

}
