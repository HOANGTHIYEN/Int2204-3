import java.io.IOException;

class creatThrowsIO {
    void method() throws IOException {
        throw new IOException();
    }
}
public class ThrowIO {
    public static void main(String args[]) throws IOException {
        creatThrowsIO m = new creatThrowsIO();
//        m.method();
        try {
            m.method();
        } catch (Exception e) {
            System.out.println("ngoai le duoc xu ly: " + e);
        }
        System.out.println("Luong binh thuong...");
    }
}

