/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoaqua;

/**
 *
 * @author Admin
 */
public class HoaQua {

    /**
     * @param args the command line arguments
     */
    protected String tenString,nguonGocString,mauString;

    public String getTenString() {
        return tenString;
    }

    public void setTenString(String tenString) {
        this.tenString = tenString;
    }

    public String getNguonGocString() {
        return nguonGocString;
    }

    public void setNguonGocString(String nguonGocString) {
        this.nguonGocString = nguonGocString;
    }

    public String getMauString() {
        return mauString;
    }

    public void setMauString(String mauString) {
        this.mauString = mauString;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
class quaCam extends HoaQua{
    protected String giaTienString;
    public String getgiatienString() {
        return giaTienString;
    }

    public void setGiaTienString(String giaTienString) {
        this.giaTienString = giaTienString;
    }
    public String getGiaTienString() {
        return giaTienString;
    }
}
class camCaoPhong extends quaCam {
    String getInfoString(){
        return tenString + nguonGocString + giaTienString + mauString;
    }
}
class camSanh extends quaCam {
        String getInfoString(){
        return tenString + nguonGocString + giaTienString + mauString;
    }
    }
    class quaTao extends HoaQua {
        protected String loaiTao, giaTien;

        public String getLoaiTao() {
            return loaiTao;
        }

        public void setLoaiTao(String loaiTao) {
            this.loaiTao = loaiTao;
        }

        public String getGiaTien() {
            return giaTien;
        }

        public void setGiaTien(String giaTien) {
            this.giaTien = giaTien;
        }
        String getInfoString(){
        return tenString + nguonGocString + giaTien + mauString + loaiTao;
    }
}
