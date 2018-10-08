package com.company;

public class bai3{
    public class teacher {
        private String name;
        private int age;
        private String subject;
        private String school;
        public String  getName()
        {
            return name;
        }
        public void setName( String name)
        {
            this.name = name;
        }
        public String getSubject()
        {
            return subject;
        }
        public void setSubject( String subject)
        {
            this.subject = subject;
        }
        public String getSchool()
        {
            return school;
        }
        public void setSchool( String school)
        {
            this.school = school;
        }
        public int  getAge()
        {
            return age;
        }
        public void setAge(int age)
        {
            this.age = age;
        }
    }
    public class laptop{
        public String CPU;
        public String GPU;
        public String RAM;
        public String cost;

        public String getCPU() {
            return this.CPU;
        }
        public void setCPU (String a) {
            this.CPU = a;
        }

        public String getGPU() {
            return this.GPU;
        }
        public void setGPU (String a) {
            this.GPU = a;
        }

        public String getRAM() {
            return this.RAM;
        }
        public void setRAM (String a) {
            this.RAM = a;
        }

        public String getCost() {
            return this.cost;
        }
        public void setCost (String a) {
            this.cost = a;
        }
    }

    public class house{
        public int number;
        public int S;
        public String kind;
        public String cost;

        public int getNumber() {
            return this.number;
        }
        public void setNumber (int a) {
            this.number = a;
        }

        public int getS() {
            return this.S;
        }
        public void setS (int a) {
            this.S = a;
        }

        public String getKinofroom() {
            return this.kind;
        }
        public void setKindofroom (String a) {
            this.kind = a;
        }

        public String getCost() {
            return this.cost;
        }
        public void setCost (String a) {
            this.cost = a;
        }
    }



    public class bag{ // cai tui
        private String kind;// Loai cap (balo)
        private int size; // kich co
        private int cost; // gia thanh (vnd)

        public String getKind() {
            return this.kind;
        }
        public void setKind (String a) {
            this.kind = a;
        }

        public int getSize() {
            return this.size;
        }
        public void setSize (int a) {
            this.size = a;
        }

        public int getCost() {
            return this.cost;
        }
        public void setCost (int a) {
            this.cost = a;
        }

        public boolean isCheap () { // re hay dat
            if (this.cost < 200) return true;
            else return false;
        }
    }

    public class shirt{ //cai ao
        private String kind;// Loai ao
        private String size; // co (S M L)
        private String color; // mau sac
        private int cost; // gia thanh (vnd)

        public String getKind() {
            return this.kind;
        }
        public void setKind (String a) {
            this.kind = a;
        }

        public String getSize() {
            return this.size;
        }
        public void setSize (String a) {
            this.size = a;
        }

        public int getCost() {
            return this.cost;
        }
        public void setCost (int a) {
            this.cost = a;
        }

        public String getColor() {
            return this.color;
        }
        public void setcolor (String a) {
            this.color = a;
        }
    }
    public class dog{ // con cho
        public String kind; // loai cho
        public String color; // mau long
        public int weight; // can nang
        public String exclaim; // tieng keu

        public String getKind() {
            return this.kind;
        }
        public void setKind(String a) {
            this.kind = a;
        }

        public String getColor() {
            return this.color;
        }
        public void setColor (String a) {
            this.color = a;
        }

        public int getWeight() {
            return this.weight;
        }
        public void setWeight (int a) {
            this.weight = a;
        }

        public String getExclaim() {
            return this.exclaim;
        }
        public void setExclaim (String a) {
            this.exclaim = a;
        }
        public boolean heathycat() { // con meo co khoe manh hay khong?
            if (this.exclaim.equals("gau gau"))
                return true ;
            else return false;
        }
    }
    public class student{ //  sv
        private String name;//  ten
        private int high; // chieu cao
        private String colorhair; // mau toc
        private int GPA; // diem gpa

        public String getName() {
            return this.name;
        }
        public void setName (String a) {
            this.name = a;
        }

        public int getHigh() {
            return this.high;
        }
        public void setHigh (int a) {
            this.high = a;
        }

        public int getGPA() {
            return this.GPA;
        }
        public void setGPA (int a) {
            this.GPA = a;
        }

        public String getColorhair() {
            return this.colorhair;
        }
        public void setcolor (String a) {
            this.colorhair = a;
        }
    }

    public class Road{ // con duong
        private String name;//  ten duong
        private int large; // do rong con duong
        private int leight; // chieu dai
        private int nameOfRoad; // ten con duong

        public String getName() {
            return this.name;
        }
        public void setName (String a) {
            this.name = a;
        }

        public int getLarge() {
            return this.large;
        }
        public void setLarge (int a) {
            this.large = a;
        }

        public int getLeight() {
            return this.leight;
        }
        public void setLeight (int a) {
            this.leight = a;
        }

        public int getCar() {
            return this.nameOfRoad;
        }
        public void setCar (int a) {
            this.nameOfRoad = a;
        }
        public boolean TacDuong () { // co tac duong hay khong
            if (this.nameOfRoad == 10) return true;
            else return false;
        }
    }

    public class comestic{ // my pham
        private String name;//  ten
        private String kind; // loai
        private String color; // mau
        private int prize; // gia

        public String getName() {
            return this.name;
        }
        public void setName (String a) {
            this.name = a;
        }

        public String getKind() {
            return this.kind;
        }
        public void setHigh (String a) {
            this.kind = a;
        }

        public int getPrize() {
            return this.prize;
        }
        public void setPrize (int a) {
            this.prize = a;
        }

        public String getColor() {
            return this.color;
        }
        public void setcolor (String a) {
            this.color = a;
        }
    }

    public class School { // truong hoc
        private String name;//  ten truong
        private String address; // dia chi
        private int students; // so hoc sinh
        private int HocPhi; // hoc phi

        public String getName() {
            return this.name;
        }
        public void setName (String a) {
            this.name = a;
        }

        public String getAddress() {
            return this.address;
        }
        public void setAddress (String a) {
            this.address = a;
        }

        public int getStudents() {
            return this.students;
        }
        public void setStudents (int a) {
            this.students = a;
        }

        public int getHocPhi() {
            return this.HocPhi;
        }
        public void setHocPhi (int a) {
            this.HocPhi = a;
        }
    }
}