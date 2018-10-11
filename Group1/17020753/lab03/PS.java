package tuan3bai2;

public class PS {

    private int tu;
    private int mau;

    public int getTu() {
        return tu;
    }

    public int getMau() {
        return mau;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    public PS(int a, int b) {
        this.tu = a;
        this.mau = b;
    }

    public int USCLN(int a, int b) {
        a=Math.abs(a);
        b=Math.abs(b);
        if(a==0 || b==0){return a*b;}
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public String getPS() {
        if (this.tu == 0 || this.mau == 1) {
            return " " + this.getTu();
        } else {
            if (Math.abs(this.tu) == Math.abs(this.mau)) {
                return " " + this.tu / this.mau;
            } else {
                return this.getTu() + "/" + this.getMau();
            }
        }

    }

    public void rutgon() {
        int x = USCLN(this.getTu(), this.getMau());
        if(x==0){
            this.setTu(this.getTu()*x );
        this.setMau(this.getMau()*x );
        }
        else{
        this.setTu(this.getTu() / x);
        this.setMau(this.getMau() / x);
        }
    }

    public void cong(PS p2) {
        int b = this.mau * p2.mau;
        int a = this.tu * p2.mau + this.mau * p2.tu;
        PS sum = new PS(a, b);
        sum.rutgon();
        System.out.println("p1+p2="+sum.getPS());
    }

    public void tru(PS p2) {
        int b = this.mau * p2.mau;
        int a = this.tu * p2.mau - this.mau * p2.tu;
        PS hieu = new PS(a, b);
        hieu.rutgon();
       
        System.out.println("p1-p2="+hieu.getPS());
    }

    public void nhan(PS p2) {

        int b = this.mau * p2.mau;

        int a = this.tu * p2.tu;

        PS kq = new PS(a, b);

        kq.rutgon();

        System.out.println("p1*p2="+kq.getPS());
    }

    public void chia(PS p2) {
        int b = this.mau * p2.tu;
        int a = this.tu * p2.mau;
        PS kq = new PS(a, b);
        kq.rutgon();
        System.out.println("p1/p2="+kq.getPS());
    }

    public boolean equals(Object obj) {
        if (obj instanceof PS) {
            PS other = (PS) obj;
            if (this.tu * other.mau == this.mau * other.tu) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        PS p1 = new PS(1, 3);
        PS p2 = new PS(2, 3);
        System.out.println("ps1:" + p1.getPS());
        System.out.println("ps2:" + p2.getPS());
        if (p1.equals(p2) == true) {
            System.out.println(" p1 = p2");
        } else {
            System.out.println(" p1 != p2");
        }
        p1.cong(p2);
        p1.nhan(p2);
        p1.chia(p2);
        p1.tru(p2);

    }
}
