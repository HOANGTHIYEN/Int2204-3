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
public class Bacsi {
    String Name;
    int Age;
    String Chucvu;
    String Nganhchinh;

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public void setChucvu(String Chucvu) {
        this.Chucvu = Chucvu;
    }

    public void setNganhchinh(String Nganhchinh) {
        this.Nganhchinh = Nganhchinh;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public String getChucvu() {
        return Chucvu;
    }

    public String getNganhchinh() {
        return Nganhchinh;
    }
    public String getinfo()
    {   return "ten :" +Name +".\ntuoi: " +Age+ ".\nChuc vu:"+Chucvu +".\nNganh chinh:"+Nganhchinh+"\n"; 
    }
    public Bacsi()
    {
    }
}
