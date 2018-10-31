import java.lang.NullPointerException;
class creatNullPoiter
{
    void method() throws NullPointerException {
        throw new NullPointerException();
    }
}
public class ThrowsNullPointer {
    public static void main(String args[]) throws NullPointerException {
        creatNullPoiter m = new creatNullPoiter();
//        m.method();
        try {
            m.method();
        } catch (Exception e) {
            System.out.println("ngoai le duoc xu ly: " + e);
        }
        System.out.println("Luong binh thuong...");
    }
}
