public class phanSo {
    private int tu;
    private int mau;


    //constructor
    public phanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public phanSo() {
    }

    //getter and setter
    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public phanSo toiGian() {
        int n = UCLN(tu, mau);
        tu = tu / n;
        mau = mau / n;
        return this;
    }

    public int UCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            }
            else {
                b = b - a;
            }
        }
        return a;
    }

    public int BCNN(int a, int b) {
        return a * b / UCLN(a, b);
    }

    public phanSo cong(phanSo p) {
        phanSo result = new phanSo();
        result.mau = BCNN(this.mau, p.mau);
        result.tu = result.mau / this.mau * this.tu + result.mau / p.mau * p.tu;
        return result.toiGian();
    }

    public phanSo tru(phanSo p) {
        phanSo result = new phanSo();
        result.mau = BCNN(this.mau, p.mau);
        result.tu = result.mau / this.mau * this.tu - result.mau / p.mau * p.tu;
        return result;

    }

    public phanSo nhan(phanSo p) {
        phanSo result = new phanSo();
        result.tu = this.tu * p.tu;
        result.mau = this.mau * p.mau;
        return result.toiGian();
    }

    public phanSo chia(phanSo p) {
        phanSo result = new phanSo();
        result.tu = this.tu * p.mau;
        result.mau = this.mau * p.tu;
        return result.toiGian();
    }

//    public boolean equals(phanSo p) {
//        if (this.tru(p).tu == 0)
//            return true;
//        else
//            return false;
//    }

    public void display() {

        if (mau != 1 && tu != 0) {
            this.toiGian();
            System.out.println(tu + "/" + mau);
        } else if (mau == 1) {
            this.toiGian();
            System.out.println(tu);
        } else if (tu == 0)
            System.out.println(0);
    }

    public boolean equals(Object obj){
        if (obj instanceof phanSo) {
            phanSo other = (phanSo) obj;
            if (this.tru( other).tu == 0) return true;
        }
        return false;
    }
}
