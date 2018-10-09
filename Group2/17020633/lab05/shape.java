/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05bai2;

/**
 *
 * @author Dell
 */
public class shape {
   protected String mausac;
    protected boolean filled;
    public String getMausac()
    {
        return mausac;
        
    }
    public void setMausac(String n)
    {
        mausac=n;
    }
    public boolean isFilled()
    {
        return filled;
    }
    public void setFilled(boolean n)
    {
        filled=n;
    }
    public shape()
    {
        this.mausac="red";
        this.filled=true;
    }
    public shape(String mausac,boolean filled)
    {
        this.mausac=mausac;
        this.filled=filled;
    }
    public String toString()
    {
        return "mau sac la : "+getMausac()+"\ndung hay sai : "+isFilled();
    }
}
