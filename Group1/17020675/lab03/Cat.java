public class Cat {
    private String color;
    private double weight;
    private String sex;

    public Cat(String color, double weight, String sex) {
        this.color = color;
        this.weight = weight;
        this.sex = sex;
    }

    public Cat() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void voice ()
    {
        System.out.println("meow meow");
    }
}
