import java.io.*;
import java.util.Scanner;

public class bai1 {
    public static String readContentFromFile(String path)
    {
        File file = new File(path);
        FileReader reader = null;
        BufferedReader in = null;
        String s = null;

        try {
            reader = new FileReader(file);
            in = new BufferedReader(reader);

            while ((s = in.readLine()) != null) {
                System.out.println(s);
            }

        } catch (IOException e) {
            System.out.println(e);
        }
        return s;
    }

    public static void writeContentToFile(String path){
        File file = new File(path);
        String s = "Day la \"dong\" moi them";
        FileWriter writer = null;
        BufferedWriter bw = null;

        try
        {
            writer = new FileWriter(file.getAbsoluteFile(), true);
            //writer = new FileWriter(file);
            bw = new BufferedWriter(writer);

            bw.write(s);
            System.out.println("done");
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
        finally {
            try {
                if (bw != null)
                    bw.close();
                if (writer != null)
                    writer.close();
            }
            catch (IOException e)
            {
                System.out.println(e);
            }
        }
    }

    public static File findFileByName(String folderPath, String fileName) {

        File file = null;
        try {
            file = new File(folderPath);

            if (file.isDirectory() == true)
            {
                String[] s = file.list();
                for (String a : s) {
                    if (a.equals(fileName))
                        System.out.println("done");
                        return new File(file.getAbsolutePath() + "\\" + fileName);
                }

            } else {
                System.out.println("Day khong phai la thu muc");
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return null;
    }
    public static void main(String args[])
    {

        try {
            System.out.println(findFileByName("C:\\Users\\Black\\Desktop\\mai", "mai.txt").getAbsolutePath());
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        // he said: "abc"


        String path = "C:\\Users\\Black\\Desktop\\abc.txt";
        System.out.println(readContentFromFile(path));
        writeContentToFile(path);





    }
}