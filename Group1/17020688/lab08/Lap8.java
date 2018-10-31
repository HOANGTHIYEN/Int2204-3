/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap8;

/**
 *
 * @author My PC
 */
public class Lap8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Numeral number0=new Numeral(1);
            Numeral number1=new Numeral(0);
            Numeral number2=new Numeral(2);
            Numeral number3=new Numeral(3);
            Numeral number10=new Numeral(10);
        try {
            Expression chia=new chia(number0,number1);
            System.out.println(chia.evaluate());
                    
        } catch (Exception e) {
            System.err.println("loi chia cho 0");
        }
          
            Square kq = new Square(new Addition(new tru(new Square(number10), number1), new nhan(number2, number3)));
            //System.out.println(kq.evaluate());
            
        }
       
    }

    
    

