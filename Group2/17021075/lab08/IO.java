package lab08;

import java.io.IOException;

public class IO {
	public void test() throws IOException{
        throw new IOException();
    }
    public static void main(String[] args){
        try {
            new IO().test();
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
