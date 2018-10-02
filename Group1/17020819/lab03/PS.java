package huongdo;


public class PS
{
    private int tu, mau;        //khai bao

    //ham tinh UCLN
    private int ucln(int a, int b)
    {
        a=Math.abs(a);
        b=Math.abs(b);
        while(a!=b)
        {
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        return a;
    }

/*constructor*/
    public PS(int tu, int mau)
    {
        this.tu=tu;
        this.mau=mau;
    }

//setter
    public void setTu(int tu)
    {
        this.tu=tu;
    }       //dung de gan 1 thong tin cho thuoc tinh
    public void setMau(int mau)
    {
        this.mau=mau;
    }
//getter
    public int getTu()
    {
        return this.tu;
    }       //dung de lay thong tin tu thuoc tinh
    public int getMau()
    {
        return this.mau;
    }
//rut on phan so
    public  PS rutGon(PS s) {
        if(s.tu==0) {       //truong hop 0/0
            s.mau = 0;
            return s;
        }
        if(s.tu==s.mau) {           //truong hop tu=mau
            s.tu = 1;
            s.mau = 1;
            return s;
        }
        if(s.tu>0&&s.mau<0)         //truong hop mau<0 & tu>0
        {
            s.tu=-(s.tu / PS.ucln( s.tu , s.mau ));             //lay doi so cua tu va tri tuyet doi cua mau + rut gon phan so
            s.mau=Math.abs(s.mau)/PS.ucln( s.tu , s.mau );
            return s;
        }
        s.tu = s.tu / PS.ucln( s.tu ,  s.mau );
        s.mau = s.mau / PS.ucln( s.tu ,  s.mau );
        return s;
    }

/*cac ham tinh toan*/
public  PS congPS(PS s1, PS s2)
{
    PS s = new PS(0, 0);
    if(s1.mau == s2.mau)            //khi 2 phan so cung mau
    {
        s.tu = s1.tu + s2.tu;
        s.mau = s1.mau;
    }
    else                            //khi 2 phan so khac mau -> quy dong phan so
    {
        s.tu = s1.tu * s2.mau + s2.tu * s1.mau;
        s.mau = s1.mau * s2.mau;

    }
    s = rutGon(s);
    return s;
}
    public  PS truPS(PS s1, PS s2)
    {
        PS s = new PS(0, 0);
        if(s1.mau == s2.mau)
        {
            s.tu = s1.tu - s2.tu;
            s.mau = s1.mau;
        }
        else
        {
            s.tu = s1.tu * s2.mau - s2.tu * s1.mau;
            s.mau = s1.mau * s2.mau;

        }
        s = rutGon(s);
        return s;
    }
    public  PS nhanPS(PS s1, PS s2)
    {
        PS s = new PS(0, 0);
        s.tu = s1.tu * s2.tu;
        s.mau = s1.mau * s2.mau;
        s = rutGon(s);
        return s;
    }
    public PS chiaPS(PS s1, PS s2)
    {
        PS s = new PS(0, 0);
        s.tu = s1.tu * s2.mau;          //nhan cheo
        s.mau = s1.mau * s2.tu;
        s = rutGon(s);
        return s;
    }


public boolean equals(Object obj){                                  //so sanh hai phan so

    if(obj instanceof PS) {             //kiem tra xem obj co nam trong lop PS hay ko

        PS other = (PS) obj;                    //tao doi tuong other thuoc lop PS

        if(other.getMau()*this.tu == other.getTu()*this.mau )           //dieu kien de 2 phan so bang nhau
            return true;
        else
            return false;
    }
    return false;                   //obj ko thuoc lop PS
}

    public static void main(String[] args)
    {
        PS ps1 = new PS(3, 3);
        PS ps2 = new PS(5, 3);

        PS ps  = new PS(0, 0);

        ps = ps.congPS(ps1, ps2);
        System.out.println("Tong cua "+ ps1.tu + "/" + ps1.mau + " + " + ps2.tu + "/" + ps2.mau + " = " + ps.tu + "/" + ps.mau);
        ps = ps.truPS(ps1, ps2);
        System.out.println("Hieu cua "+ ps1.tu + "/" + ps1.mau + " - " + ps2.tu + "/" + ps2.mau + " = " + ps.tu + "/" + ps.mau);
        ps = ps.nhanPS(ps1, ps2);
        System.out.println("Tich cua "+ ps1.tu + "/" + ps1.mau + " * " + ps2.tu + "/" + ps2.mau + " = " + ps.tu + "/" + ps.mau);
        ps = ps.chiaPS(ps1, ps2);
        System.out.println("Thuong cua "+ ps1.tu + "/" + ps1.mau + " / " + ps2.tu + "/" + ps2.mau + " = " + ps.tu + "/" + ps.mau);

        if( ps1.equals(ps2)==true)
            System.out.println("2 phan so bang nhau");
        else
            System.out.println("2 phan so khac nhau hoac khong ton tai 2 phan so truyen vao");
    }
}