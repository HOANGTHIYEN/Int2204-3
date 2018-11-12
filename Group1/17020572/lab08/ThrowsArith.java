import java.lang.ArithmeticException;
class creatThrowsArith {
    void method() throws ArithmeticException {
        throw new ArithmeticException();
    }
}
public class ThrowsArith {
    public static void main(String args[]) throws ArithmeticException {
        creatThrowsArith m = new creatThrowsArith();
//        m.method();
        try {
            m.method();
        } catch (Exception e) {
            System.out.println("ngoai le duoc xu ly: " + e);
        }
        System.out.println("Luong binh thuong...");
    }
}



