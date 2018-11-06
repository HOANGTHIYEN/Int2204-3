import java.io.FileNotFoundException;
class creatFileNotFound
{
    void method() throws FileNotFoundException {
        throw new FileNotFoundException();
    }
}
public class ThrowsFileNotFound {
    public static void main(String args[]) throws FileNotFoundException {
        creatFileNotFound m = new creatFileNotFound();
//        m.method();
        try {
            m.method();
        } catch (Exception e) {
            System.out.println("ngoai le duoc xu ly: " + e);
        }
        System.out.println("Luong binh thuong...");
    }
}
