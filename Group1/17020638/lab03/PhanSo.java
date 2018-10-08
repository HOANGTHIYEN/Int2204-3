class PhanSo {

    private int tu, mau;

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    public int getTu() {
        return this.tu;
    }

    public int getMau() {
        return this.mau;
    }

    public int UCLN(int a, int b) {
        if(a<0) a=-a;
        if(b<0) b=-b;
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public void rutGonPS() {
        int i = UCLN(this.getTu(), this.getMau());
        this.setTu(this.getTu() / i);
        this.setMau(this.getMau() / i);
    }

    public void congPS(PhanSo ps) {
        int a = (this.getTu() * ps.getMau()) + (ps.getTu() * this.getMau());
        int b = ps.getMau() * this.getMau();
        PhanSo k = new PhanSo(a, b);
        k.rutGonPS();
        System.out.println("Kq cộng " + k.tu + "/" + k.mau);
    }

    public void truPS(PhanSo ps) {
        int a = (this.getTu() * ps.getMau()) - (ps.getTu() * this.getMau());
        int b = ps.getMau() * this.getMau();
        PhanSo k = new PhanSo(a, b);
        k.rutGonPS();
        System.out.println("Kq trừ " + k.tu + "/" + k.mau);
    }

    public void nhanPS(PhanSo ps) {
        int a = ps.tu * this.tu;
        int b = ps.mau * this.mau;
        PhanSo k = new PhanSo(a, b);
        k.rutGonPS();
        System.out.println("Kq nhân " + k.tu + "/" + k.mau);
    }

    public void chiaPS(PhanSo ps) {
        int a = this.tu * ps.mau;
        int b = this.mau * ps.tu;
        PhanSo k = new PhanSo(a, b);
        k.rutGonPS();
        System.out.println("Kq chia " + k.tu + "/" + k.mau);
    }

    public boolean equals(Object obj) {
        if (obj instanceof PhanSo) {
            PhanSo other = (PhanSo) obj;
            if ((this.getTu() * other.mau) == (other.tu * this.getMau())) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        PhanSo ps = new PhanSo(11, 23);
        PhanSo ps1 = new PhanSo(7, 9);
        ps.congPS(ps1);
        ps.truPS(ps1);
        ps.nhanPS(ps1);
        ps.chiaPS(ps1);
        if (ps.equals(ps1)) {
            System.out.println("bang nhau");
        } else {
            System.out.println("khac nhau");
        }
    }

}