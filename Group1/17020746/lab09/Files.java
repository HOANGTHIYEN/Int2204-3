package Lab9;

import java.io.*;

public class Files {

    public static void main(String[] args) {
        String path = "src";
        String folderPath = "F:/Lab9/";
        //System.out.println("Ghi lại vào File");
        //writeContentToFile(path, false);
        //System.out.println("Ghi tiếp vào File");
        //writeContentToFile(path, true);
        //System.out.println("Nội dung file mới: ");
        //System.out.println(readContentFromFile(path));

        findFileByName(folderPath, path);
    }

    public static String readContentFromFile(String path) {
        File file = new File(path);

        // Variable count line in file
        int count = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            String str = "";
            // Read data from file, read one line
            while ((line = br.readLine()) != null) {
                str += line + "\n";
                count ++;
            }
            str += "-----------\n Read File Done, " + count +  " line!\n----------";
            br.close();
            return str;
        } catch (IOException e) {
            return "Error: " + e;
        }
    }

    public static void writeContentToFile(String path, Boolean append)
    {
        File file;
        FileWriter fw;
        BufferedWriter bw;
        try {
             file = new File(path);
             // Check file exist then creat new file if not exist
            if (!file.exists())
                file.createNewFile();

            fw = new FileWriter(file, append);
            bw = new BufferedWriter(fw);
            // Write in file
            bw.write("\r\nHiếu pro");
            System.out.println("Done!");
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void findFileByName(String folderPath, String fileName){
        boolean check = true;
        File file = new File(folderPath);
        // Check file or folder exists
        if (!file.exists()) {
            System.out.println("What is this folder???");
        }
        else {
            // Found file or folder
            if (file.getName().compareToIgnoreCase(fileName) == 0){
                    System.out.println("Founded: " + file.getAbsolutePath());
            }
        }
            // Creat list file or folder in source path
            File[] listFile = file.listFiles();
            // Check list null
            if (listFile != null){
                for (File files : listFile){
                        // Recursive method
                        findFileByName(files.getAbsolutePath(), fileName);
                }
            }
        }
    }
