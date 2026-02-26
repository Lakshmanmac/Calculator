package com.calculator;

public class CalOperations implements CalInterface {
	
	@Override
	public void sum(CalDTO c1) {
		// TODO Auto-generated method stub
		 int a=c1.getA();
		 int b=c1.getB();
		System.out.println("Addition : "+(a+b));
		
	}

	@Override
	public void sub(CalDTO c1) {
		// TODO Auto-generated method stub
		 int a=c1.getA();
		 int b=c1.getB();
		System.out.println("Subtraction : "+(a-b));
		
		
	}

	@Override
	public void mul(CalDTO c1) {
		// TODO Auto-generated method stub
		 int a=c1.getA();
		 int b=c1.getB();
		System.out.println("Multiplication : "+(a*b));
		
	}

	@Override
	public void div(CalDTO c1) {
		// TODO Auto-generated method stub
		int a=c1.getA();
		int b=c1.getB();
		System.out.println("Division : "+(a/b));
		
	}
	
		

}
