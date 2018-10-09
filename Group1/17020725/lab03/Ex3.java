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
public class Ex3 {

    class teacher {

        private String kind;
        private int high; //(cm)
        private int Salary; // (vnd)

        public String getKind() {
            return this.kind;
        }

        public void setKind(String a) {
            this.kind = a;
        }

        public int getHigh() {
            return this.high;
        }

        public void setHigh(int a) {
            this.high = a;
        }

        public int getSalary() {
            return this.Salary;
        }

        public void setSalary(int a) {
            this.Salary = a;
        }

        public boolean isCheap() { // re hay dat
            if (this.Salary < 100) {
                return true;
            } else {
                return false;
            }
        }
    }

    class laptop { //cai laptop

        public String CPU; // chip CPU
        public String GPU; // card do hoa
        public String RAM; // dung luong RAM
        public String cost; // gia thanh

        public String getCPU() {
            return this.CPU;
        }

        public void setCPU(String a) {
            this.CPU = a;
        }

        public String getGPU() {
            return this.GPU;
        }

        public void setGPU(String a) {
            this.GPU = a;
        }

        public String getRAM() {
            return this.RAM;
        }

        public void setRAM(String a) {
            this.RAM = a;
        }

        public String getCost() {
            return this.cost;
        }

        public void setCost(String a) {
            this.cost = a;
        }
    }

    class book {

        public int number;
        public int S;
        public String kindofroom; // kieu phong
        public String cost; // gia thanh/thang

        public int getNumber() {
            return this.number;
        }

        public void setNumber(int a) {
            this.number = a;
        }

        public int getS() {
            return this.S;
        }

        public void setS(int a) {
            this.S = a;
        }

        public String getKinofroom() {
            return this.kindofroom;
        }

        public void setKindofroom(String a) {
            this.kindofroom = a;
        }

        public String getCost() {
            return this.cost;
        }

        public void setCost(String a) {
            this.cost = a;
        }
    }

    class box {

        public String kind;
        public String color;
        public int weight;
        public String exclaim;

        public String getKind() {
            return this.kind;
        }

        public void setKind(String a) {
            this.kind = a;
        }

        public String getColor() {
            return this.color;
        }

        public void setColor(String a) {
            this.color = a;
        }

        public int getWeight() {
            return this.weight;
        }

        public void setWeight(int a) {
            this.weight = a;
        }

        public String getExclaim() {
            return this.exclaim;
        }

        public void setExclaim(String a) {
            this.exclaim = a;
        }

        public boolean heathycat() {
            if (this.exclaim.equals("meow meow")) {
                return true;
            } else {
                return false;
            }
        }
    }

    class school {

        private String kind;
        private int size;
        private int cost;

        public String getKind() {
            return this.kind;
        }

        public void setKind(String a) {
            this.kind = a;
        }

        public int getSize() {
            return this.size;
        }

        public void setSize(int a) {
            this.size = a;
        }

        public int getCost() {
            return this.cost;
        }

        public void setCost(int a) {
            this.cost = a;
        }

        public boolean isCheap() { // re hay dat
            if (this.cost < 200) {
                return true;
            } else {
                return false;
            }
        }
    }

    class shirt { //cai ao

        private String kind;// Loai ao
        private String size; // co (S M L)
        private String color; // mau sac
        private int cost; // gia thanh (vnd)

        public String getKind() {
            return this.kind;
        }

        public void setKind(String a) {
            this.kind = a;
        }

        public String getSize() {
            return this.size;
        }

        public void setSize(String a) {
            this.size = a;
        }

        public int getCost() {
            return this.cost;
        }

        public void setCost(int a) {
            this.cost = a;
        }

        public String getColor() {
            return this.color;
        }

        public void setcolor(String a) {
            this.color = a;
        }
    }

    class person {

        private String name;//  ten
        private int high; // chieu cao
        private String colorhair; // mau toc
        private int GPA; // diem gpa

        public String getName() {
            return this.name;
        }

        public void setName(String a) {
            this.name = a;
        }

        public int getHigh() {
            return this.high;
        }

        public void setHigh(int a) {
            this.high = a;
        }

        public int getGPA() {
            return this.GPA;
        }

        public void setGPA(int a) {
            this.GPA = a;
        }

        public String getColorhair() {
            return this.colorhair;
        }

        public void setcolor(String a) {
            this.colorhair = a;
        }
    }

    class Road { // con duong

        private String name;//  ten duong
        private int large; // do rong con duong
        private int leight; // chieu dai
        private int CarsPerSecond; // so xe chay qua trong 1s

        public String getName() {
            return this.name;
        }

        public void setName(String a) {
            this.name = a;
        }

        public int getLarge() {
            return this.large;
        }

        public void setLarge(int a) {
            this.large = a;
        }

        public int getLeight() {
            return this.leight;
        }

        public void setLeight(int a) {
            this.leight = a;
        }

        public int getCar() {
            return this.CarsPerSecond;
        }

        public void setCar(int a) {
            this.CarsPerSecond = a;
        }

        public boolean TacDuong() { // co tac duong hay khong
            if (this.CarsPerSecond == 10) {
                return true;
            } else {
                return false;
            }
        }
    }

    class Dog { // con cho

        private String name;//  ten
        private int high; // chieu cao
        private String color; // mau long
        private int weight; // can nang

        public String getName() {
            return this.name;
        }

        public void setName(String a) {
            this.name = a;
        }

        public int getHigh() {
            return this.high;
        }

        public void setHigh(int a) {
            this.high = a;
        }

        public int getWeight() {
            return this.weight;
        }

        public void setWeight(int a) {
            this.weight = a;
        }

        public String getColor() {
            return this.color;
        }

        public void setcolor(String a) {
            this.color = a;
        }
    }

    class classroom { // truong hoc

        private String name;//  ten truong
        private String address; // dia chi
        private int students; // so hoc sinh
        private int HocPhi; // hoc phi

        public String getName() {
            return this.name;
        }

        public void setName(String a) {
            this.name = a;
        }

        public String getAddress() {
            return this.address;
        }

        public void setAddress(String a) {
            this.address = a;
        }

        public int getStudents() {
            return this.students;
        }

        public void setStudents(int a) {
            this.students = a;
        }

        public int getHocPhi() {
            return this.HocPhi;
        }

        public void setHocPhi(int a) {
            this.HocPhi = a;
        }
    }
}