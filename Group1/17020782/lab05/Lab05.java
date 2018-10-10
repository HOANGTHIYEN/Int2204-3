/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

class hoaqua {

    private String from;
    private int date;
    private int amount;

    public hoaqua(String from, int date, int amount) {
        this.from = from;
        this.date = date;
        this.amount = amount;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
  
}

class quacam extends hoaqua {

    private int price;

    public quacam(String from, int date, int amount, int price) {
        super(from, date, amount);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

class quatao extends hoaqua {

    private int price;

    public quatao(String from, int date, int amount, int price) {
        super(from, date, amount);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

class camsanh extends quacam {

    private String color;

    public camsanh(String from, int date, int amount, int price, String color) {
        super(from, date, amount, price);
        this.color = color;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}

class camcaophong extends quacam {

    private String color;

    public camcaophong(String from, int date, int amount, int price, String color) {
        super(from, date, amount, price);
        this.color = color;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class lab05 {

    public static void main(String[] args) {
        hoaqua s1=new hoaqua("American",20,900);
        System.out.println(s1.getFrom());
        System.out.println(s1.getAmount());
        System.out.println(s1.getDate());
        
        quacam s2= new quacam("Thai",05,300,20);
        System.out.println(s2.getFrom());
        System.out.println(s2.getAmount());
        System.out.println(s2.getDate());
        System.out.println(s2.getPrice());
        
        quatao s3=new quatao("Chinese",01,250,30);
        System.out.println(s3.getFrom());
        System.out.println(s3.getAmount());
        System.out.println(s3.getDate());
        System.out.println(s3.getPrice());
        
        camcaophong s4=new camcaophong("VietNam",01,250,30,"Yellow");
        System.out.println(s4.getFrom());
        System.out.println(s4.getAmount());
        System.out.println(s4.getDate());
        System.out.println(s4.getPrice());
        System.out.println(s4.getColor());
        
        camsanh s5=new camsanh("VietNam",01,250,30,"orange");
        System.out.println(s5.getFrom());
        System.out.println(s5.getAmount());
        System.out.println(s5.getDate());
        System.out.println(s5.getPrice());
        System.out.println(s5.getColor());
    }
}
