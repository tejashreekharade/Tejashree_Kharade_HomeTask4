package com.task4.task4;

import java.util.Scanner;

public class Main {
	private static Scanner sc;
	private static float Principle,Time,Rate,Simple_Interest,Compound_Interest;

	public static void main( String[] args )
    {
		sc = new Scanner(System.in);
		System.out.println("Enter principle amount");
		Principle = sc.nextFloat();
		System.out.println("Enter time period");
		Time = sc.nextFloat();
		System.out.println("Enter rate of interest");
		Rate = sc.nextFloat();
		CalculateInterest ci =new CalculateInterest();
		Simple_Interest=ci.calculateSimpleInterest(Principle,Time,Rate);
		Compound_Interest=ci.calculateCompoundInterest(Principle,Time,Rate);
		System.out.println("Your Simple Interest is "+Simple_Interest);
		System.out.println("Your Compound Interest is "+Compound_Interest);
        
    }
}