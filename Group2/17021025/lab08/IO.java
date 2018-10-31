import java.io.IOException;

public class IO {
    public void write() throws IOException{
        throw new IOException();
    }
    public static void main(String[] args){
        try {
            IO io = new IO();
            io.write();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}