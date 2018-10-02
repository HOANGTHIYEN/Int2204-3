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
public class Streamer {
    String Bietdanh;
    int Age;
    String Congviec;
    String Khoitaisan;

    public String getBietdanh() {
        return Bietdanh;
    }

    public void setBietdanh(String Bietdanh) {
        this.Bietdanh = Bietdanh;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getCongviec() {
        return Congviec;
    }

    public void setCongviec(String Congviec) {
        this.Congviec = Congviec;
    }

    public String getKhoitaisan() {
        return Khoitaisan;
    }

    public void setKhoitaisan(String Khoitaisan) {
        this.Khoitaisan = Khoitaisan;
    }
    public String getinfo()
    {   return "Biet danh :" +Bietdanh +".\ntuoi: " +Age+ ".\nCong viec:"+Congviec +".\nKhoi tai san:"+Khoitaisan+"\n"; 
    }
    public Streamer()
    {
    }
}
