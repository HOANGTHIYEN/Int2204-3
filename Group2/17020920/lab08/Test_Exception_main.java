package lap8;



public class Test_Exception_main {
    public void NullPointerException(){
        String text=null;
        try{
            int x = text.length();
            System.out.println(x);
        }catch(NullPointerException e){
            System.out.println("Co gang truy cap null");
        }
    }
    public void ArrayIndexOfBoundException(){
        int[] x = {1,2,3};
        
        try{
            int s = x[4];
            System.out.println();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Loi truy cap ngoai du lieu");
        }
    }
    
    public void ArithmeticException() {
        try{

            System.out.println(10/0);
        }catch(ArithmeticException e){
            System.out.println("Loi chia cho 0");
        }
    }
    
    
    
    
    
    public static void main(String args[]) {
        Test_Exception_main a = new Test_Exception_main();
        a.NullPointerException();
        a.ArrayIndexOfBoundException();
        a.ArithmeticException();
    }
}

