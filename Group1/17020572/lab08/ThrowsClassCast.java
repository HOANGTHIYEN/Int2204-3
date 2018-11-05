import java.lang.ClassCastException;
class creatClassCast
{
    void method() throws ClassCastException
    {
        throw new ClassCastException();
    }
}
public class ThrowsClassCast {
    public static void main(String args[]) throws ClassCastException {
        creatClassCast m = new creatClassCast();
//        m.method();
        try {
            m.method();
        } catch (Exception e) {
            System.out.println("ngoai le duoc xu ly: " + e);
        }
        System.out.println("Luong binh thuong...");
    }
}
