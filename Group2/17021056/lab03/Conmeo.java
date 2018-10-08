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
public class Conmeo {
    String Name;
    int Age;
    String Maulong;
    String Congdung;

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public void setMaulong(String Maulong) {
        this.Maulong = Maulong;
    }

    public void setCongdung(String Congdung) {
        this.Congdung = Congdung;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public String getMaulong() {
        return Maulong;
    }

    public String getCongdung() {
        return Congdung;
    }
    public String getinfo()
    {   return "ten :" +Name +".\ntuoi: " +Age+ ".\nMau long:"+ Maulong+".\ncong dung:"+Congdung+"\n"; 
    }
    public Conmeo()
    {
    }
}
