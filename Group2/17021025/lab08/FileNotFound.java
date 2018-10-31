import java.io.BufferedReader;
import java.io.FileReader;

public class FileNotFound {

    public static void main(String[] args){
        BufferedReader br = null;
        try{
            String Line;
            br = new BufferedReader(new FileReader("C:\\netbean\\abc.txt"));
            while((Line =  br.readLine())!=null){
                System.out.print(Line);
            }
        }
        catch (java.io.IOException e){
            System.err.print("lỗi abcxyz");
        }
    }
}
