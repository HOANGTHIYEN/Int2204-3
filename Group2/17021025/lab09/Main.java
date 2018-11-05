import java.io.*;
public class Main {
    public static void main(String[] args){
        Utils utils = new Utils();
        try{
            utils.readFile("src\\test.txt");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        try {
            utils.writenFile("src\\test.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            // he said: "abc"

        }
        System.out.println("he said: \"abc\"");
        try{
            utils.writenFileAdd("src\\test.txt");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        if(utils.findFileByName("src","test.txt")!=null) {
            System.out.println(utils.findFileByName("src","test.txt").getAbsolutePath());
        }
    }

}
