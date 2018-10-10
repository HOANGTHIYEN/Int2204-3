/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhtoanphanso;

import static java.lang.Math.abs;


public class PhanSo {
    private int tu;
    private int mau;
    public PhanSo (){}
public PhanSo(int tu, int mau){
    this.tu=tu;
    this.mau=mau;
}
    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }
    public void Xuat(){
        System.out.println(tu+"/"+mau);
    }
public PhanSo Cong(PhanSo ps){
    PhanSo tong= new PhanSo();
    tong.tu= this.tu*ps.getMau()+this.mau*ps.getTu();
    tong.mau= this.mau*ps.getMau();
    tong.rutgon();
    return tong;
}
public PhanSo Tru(PhanSo ps){
    PhanSo tru= new PhanSo();
    tru.tu= this.tu*ps.getMau()-this.mau*ps.getTu();
    tru.mau= this.mau*ps.getMau();
    tru.rutgon();
    return tru;
}
public PhanSo Nhan(PhanSo ps){
    PhanSo nhan = new PhanSo();
    nhan.tu= this.tu*ps.getTu();
    nhan.mau= this.mau*ps.getMau();
    nhan.rutgon();
    return nhan;
}
public PhanSo Chia(PhanSo ps){
    PhanSo chia= new PhanSo();
    chia.tu= this.tu*ps.getMau();
    chia.mau= this.mau*ps.getTu();
    chia.rutgon();
    return chia;
}
public boolean equals(Object obj){
    if(obj instanceof PhanSo)
    {
        PhanSo ps2 = ((PhanSo) obj);
        float t1=ps2.getTu()/ps2.getMau();
        float t2=this.tu/this.mau;
        if(t1==t2)
        { return true;}
        else 
        {return false;}
    }
    else return false;
}
public int UCLN (int num1, int num2)
    {
        if(num1==0 || num2==0)
            return 1;
        num1=abs(num1);
        num2=abs(num2);
        
        while (num1 !=num2)
        {
            if(num1>num2) num1-=num2;
            else          num2-=num1;
        }
        return num1;
    }
public void rutgon(){
    int UC= UCLN(tu,mau);
    this.tu= getTu()/UC;
    this.mau= getMau()/UC;
}
}