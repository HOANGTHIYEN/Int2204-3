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
public class Casi {
    String Name;
    int Age;
    String Theloai;
    String ThanhTuu;

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

    public String getTheloai() {
        return Theloai;
    }

    public void setTheloai(String Theloai) {
        this.Theloai = Theloai;
    }

    public String getThanhTuu() {
        return ThanhTuu;
    }

    public void setThanhTuu(String ThanhTuu) {
        this.ThanhTuu = ThanhTuu;
    }
    public String getinfo()
    {   return "ten :" +Name +".\ntuoi: " +Age+ ".\nThe loai:"+Theloai +".\n:Thanh tuu"+ThanhTuu+"\n"; 
    }
    public Casi()
    {
    }
}
