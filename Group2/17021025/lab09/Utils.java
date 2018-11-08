import java.io.*;

public class Utils {
        public static String readFile(String path) throws IOException
        {
            FileReader fileReader = new FileReader(path);
            try (BufferedReader br = new BufferedReader(fileReader)) {
                String sCurrentLine;
                while ((sCurrentLine = br.readLine()) != null) {
                    System.out.println(sCurrentLine);
                }
                return "";
            } catch (IOException e) {
                e.printStackTrace();
            }
            return "";
        }
        public static void writenFile(String path) throws IOException {
            FileWriter fileWriter = new FileWriter(path,false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("something");
            bufferedWriter.close();
        }
        public static void writenFileAdd(String path) throws IOException {
            FileWriter fileWriter = new FileWriter(path,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("\nthay duong");
            bufferedWriter.close();
        }
    public static File findFileByName(String folderPath, String fileName){
        File file = new File(folderPath);
        if(file.isDirectory()) {
            String [] l= file.list();
            for(String s : l){
                if(s.equals(fileName)){
                    return new File(file.getAbsolutePath()+"\\"+fileName);
                }
            }
        }
        return null;
    }
}

