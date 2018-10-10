public class HoaQua
{
        private String tenqua;
        private String muivi;
        private String hinhdang;
        private String xuatxu;
        private float giaban;
        private int soluong;
        public void setTenqua(String tenqua)
        {
            this.tenqua=tenqua;
        }
        public String getTenqua()
        {
            return this.tenqua;
        }
        public void setMuivi(String muivi)
        {
            this.muivi=muivi;
        }
        public String getMuivi()
        {
            return this.muivi;
        }
        public void setHinhdang(String hinhdang)
        {
            this.hinhdang=hinhdang;
        }
        public String getHinhdang()
        {
            return this.hinhdang;
        }
        public void setXuatxu(String xuatxu)
        {
            this.xuatxu=xuatxu;
        }
        public String getXuatxu()
        {
            return this.xuatxu;
        }
        public void setGiaban(float giaban)
        {
            this.giaban=giaban;
        }
        public float getGiaban()
        {
            return this.giaban;
        }
        public void setSoluong(int soluong)
        {
            this.soluong=soluong;
        }
        public float getSoluong()
        {
            return this.soluong;
        }
        public String getInfo()
        {
            return getTenqua()+ "\t"+getHinhdang()+"\t"+getMuivi()
                    +"\t"+getSoluong()+"\t"+getGiaban()+"\t"+getXuatxu();
        }
}
