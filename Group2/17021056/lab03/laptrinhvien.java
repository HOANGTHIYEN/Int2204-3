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
public class laptrinhvien {
    String Matdanh;
    int Age;
    String chucvu;
    String Congviec;

    public void setMatdanh(String Matdanh) {
        this.Matdanh = Matdanh;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public void setCongviec(String Congviec) {
        this.Congviec = Congviec;
    }

    public String getMatdanh() {
        return Matdanh;
    }

    public int getAge() {
        return Age;
    }

    public String getChucvu() {
        return chucvu;
    }

    public String getCongviec() {
        return Congviec;
    }
    public String getinfo(){
        return "Mat danh : " +Matdanh +".\ntuoi: " +Age+ ".\nChucvu:"+ chucvu+".\ncong viec:"+Congviec+"\n";
    }
    public laptrinhvien()
    {
    }
}
