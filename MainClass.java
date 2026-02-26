package com.calculator;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		while(true) {
			CalInterface c=new CalOperations();
			System.out.println("Enter operation ");
			System.out.println("1.addtion");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.division");
			int n =sc.nextInt();
			System.out.println("Enter value 1");
			int a=sc.nextInt();
			System.out.println("Enter  value 2");
			int b=sc.nextInt();
			CalDTO c1= new CalDTO();
			c1.setA(a);
			c1.setB(b);
			if(n>4 || n<1) {
				System.out.println("Invalid choice");
				break;
			}
			else if(n==1)
				c.sum(c1);
			else if(n==2)
				c.sub(c1);
			else if(n==3)
				c.mul(c1);
			else if(n==4)
				c.div(c1);
			
				
			
			System.out.println("Do you want to perform another operation..?\n1.Yes \n  2.No");
			int ch=sc.nextInt();
			if(ch!=1)
				break;
		}

	}

}
