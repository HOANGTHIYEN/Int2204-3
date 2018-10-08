/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap03;

/**
 *
 * @author CCNE
 */
public class PS {

    private int TS;
    private int MS;

    public void setTS(int ts) {
        this.TS = ts;
    }

    public void setMS(int ms) {
        this.MS = ms;
    }

    public int getTS() {
        return TS;
    }

    public int getMS() {
        return MS;
    }

    //caub: cong, tru, nhan, chia phan so   
    public int ucln(int a, int b) {
        if (a < 0) {
            a = -a;
        }
        if (b < 0) {
            b = -b;
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            }
            if (a < b) {
                b = b - a;
            }
        }
        return a;
    }

    public void cong(PS a, PS b) {
        PS tong = new PS();
        tong.MS = a.MS * b.MS;
        tong.TS = a.TS * b.MS + b.TS * a.MS;
        int tmp = ucln(tong.TS, tong.MS);
        System.out.println(tong.TS / tmp);
        System.out.println(tong.MS / tmp);
    }

    public void tru(PS a, PS b) {
        PS hieu = new PS();
        hieu.MS = a.MS * b.MS;
        hieu.TS = a.TS * b.MS - b.TS * a.MS;
        int tmp = ucln(hieu.TS, hieu.MS);
        System.out.println(hieu.TS / tmp);
        System.out.println(hieu.MS / tmp);
    }

    public void nhan(PS a, PS b) {
        PS tich = new PS();
        tich.MS = a.MS * b.MS;
        tich.TS = a.TS * b.TS;
        int tmp = ucln(tich.TS, tich.MS);
        System.out.println(tich.TS / tmp);
        System.out.println(tich.MS / tmp);
    }

    public void chia(PS a, PS b) {
        PS thuong = new PS();
        thuong.TS = a.TS * b.MS;
        thuong.MS = a.MS * b.TS;
        int tmp = ucln(thuong.TS, thuong.MS);
        System.out.println(thuong.TS / tmp);
        System.out.println(thuong.MS / tmp);
    }

    //so sanh 2 phan so
    public boolean equals(Object obj) {
        if (obj instanceof PS) {
            PS temp = (PS) obj;
            if (this.getTS() * temp.getMS() - this.getMS() * temp.getTS() == 0) {
                return true;
            }
        }
        return false;
    }
}
