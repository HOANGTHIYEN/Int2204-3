
package bai3;

public class con_cho {
   
    private String mauLong;
    private String tuoi;
    private String canNang;

    public String getMauLong() {
        return mauLong;
    }

    public String getTuoi() {
        return tuoi;
    }

    public String getCanNang() {
        return canNang;
    }

    public void setMauLong(String mauLong) {
        this.mauLong = mauLong;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public void setCanNang(String canNang) {
        this.canNang = canNang;
    }

    public con_cho(String mauLong, String tuoi, String canNang) {
        this.mauLong = mauLong;
        this.tuoi = tuoi;
        this.canNang = canNang;
    }
    
}
