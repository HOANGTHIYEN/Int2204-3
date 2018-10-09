public class Qua_Cam extends Hoa_Qua {                                          //lop Qua_Cam ke thua lop Hoa_Qua
    String loai_cam;
    String vi;
    String cat_hay_boc_vo;
    String mau_sac_khi_chin;

    public String getLoai_cam() {
        return loai_cam;
    }

    public void setLoai_cam(String loai_cam) {
        this.loai_cam = loai_cam;
    }

    public String getVi() {
        return vi;
    }

    public void setVi(String vi) {
        this.vi = vi;
    }

    public String getCat_hay_boc_vo() {
        return cat_hay_boc_vo;
    }

    public void setCat_hay_boc_vo(String cat_hay_boc_vo) {
        this.cat_hay_boc_vo = cat_hay_boc_vo;
    }

    public String getMau_sac_khi_chin() {
        return mau_sac_khi_chin;
    }

    public void setMau_sac_khi_chin(String mau_sac_khi_chin) {
        this.mau_sac_khi_chin = mau_sac_khi_chin;
    }

    @Override
    public String toString() {
        return "Qua_Cam{" + "loai_cam=" + loai_cam + ", vi=" + vi + ", cat_hay_boc_vo=" + cat_hay_boc_vo + ", mau_sac_khi_chin=" + mau_sac_khi_chin + '}';
    }
    
}
