/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author Việt Hoàng
 */
public class mainCircle {

    public static void main(String[] args) {
        shape s = new shape();
        System.out.println(s.toString());
        circle c = new circle();
        System.out.println(c.toString());
        rectangle r = new rectangle();
        System.out.println(r.toString());
        square sq = new square();
        System.out.println(sq.toString());
        System.out.println(sq.getLength());
        System.out.println(sq.toString());

    }

}
