/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucln;

/**
 *
 * @author MANH HOANG
 */

import java.util.Scanner;

public class UCLN {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int a,b;
	a=input.nextInt();
	b=input.nextInt();
	int c=a;
	while(b!=0)
	{
		c=a%b;
		a=b;
		b=c;
	}
	System.out.println(a);
}

}
    
    

