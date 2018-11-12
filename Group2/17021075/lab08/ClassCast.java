package lab08;

public class ClassCast {
	public double test(Object s) throws ClassCastException{
        return (double)s;
    }
    public static void main(String[] args){
        try {
            System.out.println(new ClassCast().test("3.14"));
        } catch (ClassCastException e) {
            System.out.println("Ep kieu khong hop le");
        }
    }
}
