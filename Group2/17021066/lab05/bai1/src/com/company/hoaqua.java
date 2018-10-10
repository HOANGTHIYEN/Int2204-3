package com.company;

public class hoaqua {

        public String tenqua;
        public float giaban;
        public String nguongocxuatsu;
        public String ngaynhap;
        public int soluong;

        public String gettenqua() {
            return tenqua;
        }

        public void settenqua(String tenqua) {
            this.tenqua = tenqua;
        }

        public float getgiaban() {
            return giaban;
        }

        public void setGiaban(float giaban) {
            this.giaban = giaban;
        }

        public String getnguongocxuatsu() {
            return nguongocxuatsu;
        }

        public void setnguongocxuatsu(String nguongocxuatsu) {
            this.nguongocxuatsu = nguongocxuatsu;
        }

        public String getngaynhap() {
            return ngaynhap;
        }

        public void setngaynhap(String ngaynhap) {
            this.ngaynhap = ngaynhap;
        }

        public int getsoluong() {
            return soluong;
        }

        public void setsoluong(int soluong) {
            this.soluong = soluong;
        }
        public String getInfo(){
            return gettenqua() +"\n"+getnguongocxuatsu()+"\n"+getgiaban()+"\n"+getngaynhap()+"\n"+getsoluong();
        }
    }


