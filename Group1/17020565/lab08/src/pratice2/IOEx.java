package pratice2;

import java.io.IOException;

public class IOEx {
    public static void main(String[] args) {
        IOEx ioEx = new IOEx();
        try {
            ioEx.throwEx();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }

    }

    private void throwEx() throws IOException {

    }
}
