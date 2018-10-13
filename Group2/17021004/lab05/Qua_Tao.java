public class Qua_Tao extends Hoa_Qua {                                          //Lop Qua_Tao ke thua lop Hoa_Qua
    String loai_tao;
    boolean co_hat;
    String vi;

    public String getLoai_tao() {
        return loai_tao;
    }

    public void setLoai_tao(String loai_tao) {
        this.loai_tao = loai_tao;
    }

    public boolean isCo_hat() {
        return co_hat;
    }

    public void setCo_hat(boolean co_hat) {
        this.co_hat = co_hat;
    }

    public String getVi() {
        return vi;
    }

    public void setVi(String vi) {
        this.vi = vi;
    }

    public Qua_Tao(String loai_tao, boolean co_hat, String vi) {
        this.loai_tao = loai_tao;
        this.co_hat = co_hat;
        this.vi = vi;
    }

    @Override
    public String toString() {
        return "Qua_Tao{" + "loai_tao=" + loai_tao + ", co_hat=" + co_hat + ", vi=" + vi + '}';
    }

    
    
}
