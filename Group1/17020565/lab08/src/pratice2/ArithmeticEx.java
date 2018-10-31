package pratice2;

public class ArithmeticEx{
    public static void main(String[] args) {
        ArithmeticEx arithmeticEx = new ArithmeticEx();
        try{
            arithmeticEx.throwEx();
        }
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }

    }
    public void throwEx() throws ArithmeticException {
        int i = 0/0;
    }
}
