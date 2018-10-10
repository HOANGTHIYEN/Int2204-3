class fruits{
    protected long price;
    protected String date;
    protected int quantity;

    public long getPrice(){
        return price;
    }
    public void setPrice(long price){
        this.price = price;
    }

    public String getDate(){
        return date;
    }
    public void setDate(String date){
        this.date = date;
    }

    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    void fruits(long price, String date, int quantity){
        this.price = price;
        this.date = date;
        this.quantity = quantity;
        System.out.println("Price: " + price +"\nDate: " + date +"\nQuantity: " + quantity);
    }
}

class Orange extends fruits{
    protected String id;
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public void id(String id){
        this.id = id;
        System.out.println("ID: " + id);
    }
}

class Apple extends fruits{
    protected String gender;
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void gender(String gender){
        this.gender = gender;
        System.out.println("Gender: " + gender + "\n");
    }
}

class CaoPhongorange extends Orange{
    protected String condition;
    public String getCondition(){
        return condition;
    }
    public void setCondition(String condition){
        this.condition = condition;
    }
    public void condition(String condition){
        this.condition = condition;
        System.out.println("Condition: " + condition + "\n");
    }
}

class Kingorange extends Orange{
    protected String source;
    public String getSource(){
        return source;
    }
    public void setSource(String source){
        this.source = source;
    }
    public void source(String source){
        this.source = source;
        System.out.println("Source: " + source);
    }
}
public class Fruit {
    public static void main(String[] args){
        Apple ap = new Apple();
        ap.fruits(50000, "20/01/2018", 100);
        ap.gender("Abcxyz");

        CaoPhongorange org = new CaoPhongorange();
        org.fruits(100000, "27/06/2018", 50);
        org.id("17020719");
        org.condition("Temperature: 20-25C");

        Kingorange orgK = new Kingorange();
        orgK.fruits(150000, "25/10/2018", 20);
        orgK.id("17020120");
        orgK.source("VietNam");
    }
}
