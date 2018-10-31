package lab8;

public class ExpressionTest {

    public static void main(String args[]) {

        Expression n1 = new Numeral(6); 
        Expression n2=new Numeral(2);
        Expression n3=new Numeral(0);
        
        Expression s1 = new Square(n1); 
       
        Expression a1 = new Addition(n1, n2); 
        Expression m1 = new Multiplication(n1,n2);
        Expression sub1 = new Subtraction(n1,n2);
        Expression d1 = new Division(n1,n2);
        

        System.out.println(n1);
       System.out.println(n2);
       System.out.println(n3);
       
        System.out.println(m1+" "+m1.evaluate());
        System.out.println(sub1+" "+sub1.evaluate());
       System.out.println(d1+" "+d1.evaluate());
        
        try {
            int  d2 = new Division(n1,n3).evaluate();
        } catch (Exception e) {
            System.out.println("lỗi chia cho 0");
        }
        
        
        try {
            String s=null;
            s.toString();
        } catch (Exception e) {
            System.out.println("NullPointerException");
        }
        
        try {
              String[] strs = new String[] { "One", "Two", "Three" };
        
        String str1 = strs[5];
 
        } catch (Exception e) {
            System.out.println("ArrayIndexOfBoundException");
        }
        
        try {
            int i=1/0;
        } catch (Exception e) {
           System.out.println(" ArithmeticException");
        }
        
        try {
            
        } catch (Exception e) {
        }
    }
}
