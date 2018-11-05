import java.lang.ArrayIndexOutOfBoundsException;
class creatArrayIndexOutOfBounds
{
    void method() throws ArrayIndexOutOfBoundsException
    {
        throw new ArrayIndexOutOfBoundsException();
    }
}
public class ThrowsArrayIndexOutOfBounds {
    public static void main(String args[]) throws ArrayIndexOutOfBoundsException {
        creatArrayIndexOutOfBounds m = new creatArrayIndexOutOfBounds();
//        m.method();
        try {
            m.method();
        } catch (Exception e) {
            System.out.println("ngoai le duoc xu ly: " + e);
        }
        System.out.println("Luong binh thuong...");
    }
}
