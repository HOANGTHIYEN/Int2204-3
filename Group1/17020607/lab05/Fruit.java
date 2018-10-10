/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week5;

public class Fruit {
    protected String Price, Date, Number, Origin;

    public String getPrice() {
        return Price;
    }

    public String getDate() {
        return Date;
    }

    public String getNumber() {
        return Number;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public void setNumber(String Number) {
        this.Number = Number;
    }

    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }
    public Fruit(String price, String date, String number, String origin){
        this.Price = price;
        this.Date = date;
        this.Number = number;
        this.Origin = origin;
    }
    public Fruit(){
        this.Price = "";
        this.Date = "";
        this.Number = "";          
        this.Origin = "";
    }
    
}

