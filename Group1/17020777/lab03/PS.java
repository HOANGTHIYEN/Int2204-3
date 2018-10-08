/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps;

/**
 *
 * @author MANH HOANG
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class PS {

    /**
     * @param args the command line arguments
     */
    private int tu,mau;
    public PS(int tu, int mau) {
       this.tu=tu;
       this.mau=mau;
    }
    
    public void setTU(int tu) {
            this.tu=tu;
    }
    public int getTu(int tu) {
        return tu;
    }
    public void setMau(int mau) {
        this.mau=mau;
    }
    public int getMau(int mau) {
        return mau;
    }
    
    public int ucln(int a,int b) {
        if(a<0)
        {
            a=-a;
        }
        if(b<0)
        {
            b=-b;
        }
        if(a==b)
            return a;
        else if(a>b)
        {
            a=a-b;
            return ucln(a,b);
        }
        else
        {
            b=b-a;
            return ucln(a,b);
        }
    }
    
    public void cong(PS ps) {
        int ts,ms;
        ts=this.tu * ps.mau + this.mau * ps.tu;
        ms=this.mau * ps.mau;
        int dkm=ucln(ts,ms);
        ts=ts/dkm;
        ms=ms/dkm;
        System.out.println(ts + "/" + ms);
    }
    
    public void tru(PS ps) {
        int ts,ms;
        ts=this.tu * ps.mau - this.mau * ps.tu;
        ms=this.mau * ps.mau;
        int dkm=ucln(ts,ms);
        ts=ts/dkm;
        ms=ms/dkm;
        System.out.println(ts + "/" + ms);
    }
    
    public void nhan(PS ps) {
        int ts,ms;
        ts=this.tu * ps.tu;
        ms=this.mau * ps.mau;
        int dkm=ucln(ts,ms);
        ts=ts/dkm;
        ms=ms/dkm;
        System.out.println(ts + "/" + ms);
    }
    
    public void chia(PS ps) {
        int ts,ms;
        if(ps.tu==0) {
            System.out.println("khong chia duoc");
        }
        else {
        ts=this.tu * ps.tu + this.mau * ps.mau;
        ms=this.mau * ps.tu;
        int dkm=ucln(ts,ms);
        ts=ts/dkm;
        ms=ms/dkm;
        System.out.println(ts + "/" + ms);
        }
    }

    
    
    public boolean equals(Object obj) {
        if(obj instanceof PS){
            PS other = (PS) obj;
        
            if(this.tu * other.mau==this.mau*other.tu)
            {
                return true;
            }
            else{
                return false;
            }
        }
       
            
        
        return false;
        
    }
    
    
            
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner hoang = new Scanner(System.in);
        int tu1,mau1,tu2,mau2;
        tu1=hoang.nextInt();
        mau1=hoang.nextInt();
        tu2=hoang.nextInt();
        mau2=hoang.nextInt();
        PS ps1 = new PS(tu1,mau1);
        PS ps2 = new PS(tu2,mau2);
        ps1.cong(ps2);
        System.out.println();
        ps1.tru(ps2);
        System.out.println();
        ps1.nhan(ps2);
        System.out.println();
        ps1.chia(ps2);
    }
    
}
