package com.company;


import java.util.Scanner;


public class PS {
    private int TS;
    private int MS;

    public void setTS (int n) {
        this.TS = n;
    }
    public int getTS () {
        return this.TS;
    }
    public void setMS(int m) {
        if (m == 0) {
            System.out.println("loi!");
            return ;
        }
        this.MS = m;
    }
    public int getMS() {
        return this.MS;
    }
    public void xuatManHinh() {
        if (this.getMS()<0 ) {
            this.setTS(-this.getTS());
            this.setMS(-this.getMS());
        }
        if (this.getMS()== 1)
            System.out.println(this.getTS());
        else
        if (this.getTS() == 0 )
            System.out.println(this.getTS());
        else

            System.out.println(this.getTS() + " / "  + this.getMS());
    }
    public int UCN(int a, int b) {
        if (a<0) a = Math.abs(a);
        if (b < 0) b = Math.abs(b);
        if (a== 0) return b;
        else if (b == 0 ) return a;
        else {

            while (a!=b) {
                if (a > b) a = a - b;
                else b = b - a;
            }
            return a;
        }
    }
    public  PS congPS(PS ps1) {
        PS ps = new PS();

        int ts = ps1.getTS() * this.getMS() + ps1.getMS() * this.getTS();
        int ms = ps1.getMS()*this.getMS();
        int temp = UCN(ts, ms);

        ps.setTS(ts/temp);
        ps.setMS(ms/temp);

        return ps;
    }

    public  PS truPS( PS ps2) {
        PS ps = new PS();

        int ts = this.getTS() * ps2.getMS() - this.getMS() * ps2.getTS();
        int ms = this.getMS()*ps2.getMS();
        int temp = UCN(ts, ms);

        ps.setTS(ts/temp);
        ps.setMS(ms/temp);

        return ps;
    }
    public  PS nhanPS(PS ps1) {
        PS ps = new PS();

        int ts = ps1.getTS() * this.getTS();
        int ms = ps1.getMS()*this.getMS();
        int temp = UCN(ts, ms);

        ps.setTS(ts/temp);
        ps.setMS(ms/temp);

        return ps;
    }
    public  PS chiaPS( PS ps2) {
        PS ps = new PS();

        int ts = this.getTS() * ps2.getMS();
        int ms = this.getMS()*ps2.getTS();
        int temp = UCN(ts, ms);

        ps.setTS(ts/temp);
        ps.setMS(ms/temp);

        return ps;
    }
    public  boolean equals ( Object obj) {
        if(obj instanceof PS){
            PS temp=(PS)obj;
            if ( this.getTS() * temp.getMS() - this.getMS() * temp.getTS() == 0) return true;
        }
        return false;
    }
    public static void main(String args[]) {
        PS temp = new PS();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        PS ps1 = new PS();
        ps1.setTS(a);
        ps1.setMS(b);
        int c = sc.nextInt();
        int d = sc.nextInt();
        PS ps2 = new PS();
        ps2.setTS(c);
        ps2.setMS(d);


        PS ps0 = new PS();
        ps0= ps2.congPS(ps1);
        System.out.print("Tong: " );
        ps0.xuatManHinh();
        System.out.println("");


        ps0= ps1. truPS(ps2);
        System.out.print("Hieu: " );
        ps0.xuatManHinh();
        System.out.println("");


        ps0= ps1.nhanPS( ps2);
        System.out.print("Tich: " );
        ps0.xuatManHinh();
        System.out.println("");

        if (ps2.getTS()== 0) {
            System.out.println("loi!");
        }
        else {
            ps0= ps1.chiaPS(ps1);
            System.out.print("Thuong: " );
            ps0.xuatManHinh();
            System.out.println("");
        }

        if (ps1.equals (ps2) == true) {
            System.out.print("chuan!" );
        }
        else
            System.out.print("sai!" );

    }
}