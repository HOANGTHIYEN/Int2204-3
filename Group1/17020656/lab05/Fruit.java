package fruit;
class HoaQua
{
    protected String name,color,taste;
    protected int size;
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        this.name=n;
    }
    public String getColor()
    {
        return color;
    }
    public void setColor(String n)
    {
        this.color=n;
    }
    public String getTaste()
    {
        return taste;
    }
    public void setTaste(String n)
    {
        this.taste=n;
    }
    public int getSize()
    {
        return size;
    }
    public void setSize(int n)
    {
        this.size=n;
    }
}
class QuaCam extends HoaQua
{
    protected int price;
    public int getPrice()
    {
        return price;
    }
    public void setPrice(int n)
    {
        this.price=n;
    }
}
class QuaTao extends HoaQua
{
    protected String source;
    public String getSource()
    {
        return source;
    }
    public void setSource(String n)
    {
        this.source=n;
    }
}
class CamCaoPhong extends QuaCam
{
    protected int DateImport;
    public int getDate()
    {
        return DateImport;
    }
    public void setDate(int n)
    {
        this.DateImport=n;
    }
}
class CamSanh extends QuaCam
{
    protected int amount;
    public int getAmouunt()
    {
        return amount;
    }
    public void setAmount(int n)
    {
        this.amount=n;
    }
}
public class Fruit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QuaCam C =new QuaCam();
        QuaTao T =new QuaTao();
        CamCaoPhong CP =new CamCaoPhong();
        CamSanh CS =new CamSanh();
    }
    
}
