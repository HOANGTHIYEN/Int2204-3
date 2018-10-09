public class Student {
    private String name;
    private int age;
    private String id;
    private String classroom;
    private boolean sex; //gioi tinh : 1 = nam, 0 = nu
    private double GPA;

    public Student() {
    }

    public Student(String name, int age, String id, String classroom, boolean sex, double GPA) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.classroom = classroom;
        this.sex = sex;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public boolean isXuatSac() {
        if (GPA >= 3.6) return true;
        else return false;
    }

    public boolean isGioi() {
        if (GPA >= 3.2 && GPA < 3.6) return true;
        else return false;
    }
}
