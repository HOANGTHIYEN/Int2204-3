import java.io.*;

public class classMain {
    public static void main(String[] args){
        String abc = readContentFromFile("C:/Users/ADMIN/Desktop/lab.9/src/data.txt");
        System.out.println(abc);
        writeContentToFile("C:/Users/ADMIN/Desktop/lab.9/src/data.txt");
        String bcd = readContentFromFile("C:/Users/ADMIN/Desktop/lab.9/src/data.txt");
        System.out.println(bcd);
        writeContentToFileAgain("C:/Users/ADMIN/Desktop/lab.9/src/data.txt");
        finlFileByName("C:/Users/ADMIN/Desktop/lab.9/src", "data1.txt");
        System.out.println("\" + ");
    }
    private static String readContentFromFile(String path) {
        String text = "";
        String line= System.getProperty("line.separator");
        try{
            BufferedReader brTest = new BufferedReader(new FileReader(path));
            text =  brTest.readLine();
        }
        catch(IOException err){
            System.out.println(err);
        }
        return text;
    }
    private static void writeContentToFile(String path)  {
        try{
            BufferedWriter brTest = new BufferedWriter(new FileWriter(path));
            brTest.write("Hello abc");
            brTest.close();
        }
        catch(IOException err){
            System.out.println(err);
        }
    }
    private static void writeContentToFileAgain(String path){
        try{
            BufferedWriter brTest = new BufferedWriter(new FileWriter(path, true));
            brTest.write("\nHello abcdef");
            brTest.close();
        }

        catch(IOException err){
            System.out.println(err);
        }
    }
    private static File finlFileByName(String folder, String filename){
        if(new File(folder).isDirectory()){
            File file = new File(folder);
            String[] listFile = file.list();
            for(int i=0; i<listFile.length;i++){
                if(listFile[i].equals(filename)){
                    System.out.println("ok");
                    return new File(file.getAbsolutePath() + "/" + filename);
                }
            }
            System.out.println("Can't find");
        }
        else{
            System.out.println("Can't find");
        }
        return null;
    }
}


