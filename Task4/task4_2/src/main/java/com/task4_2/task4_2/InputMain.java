package com.task4_2.task4_2;

import java.util.Scanner;

public class InputMain {
	private static Scanner sc;
	private static int type,option,continue_option;
	private static float total_area_of_house,estimate_amount;	 
	public static void main( String[] args )
    {
		//method to call the 
		houseConstruction();
    }
	
	private static void houseConstruction() {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		HouseEstimationCost obj=new HouseEstimationCost(); 
		System.out.println("---Please enter total area of the house---");
		total_area_of_house = sc.nextFloat();
		System.out.println("---Enter 1 if you opt for a fully automated house otherwise enter 0---");
		type=sc.nextInt();//option to check for a fully automated house
		if(type==1)
		{
			estimate_amount=obj.fullyAutomatedHome(total_area_of_house);
			System.out.println("Your estimated house construction cost is Rs."+estimate_amount);
			System.out.println("Do you want to continue?\nenter 1 to continue otherwise enter 0");
			continue_option=sc.nextInt();
			if(continue_option==1)
				houseConstruction();
			else
				System.out.println("Thank you");
		}
		else if(type==0)
		{
			System.out.println("---PLease select an option for the type of material to be used for construction---");
			System.out.println("---Enter 1 for standard materials---");
			System.out.println("---Enter 2 for above standard materials---");
			System.out.println("---Enter 3 for high standard material---");
			option=sc.nextInt();//option to check for a non-automated house
			if(option==1)
			{
				estimate_amount=obj.Home(total_area_of_house,1200);
				System.out.println("Your estimated house construction cost is Rs."+estimate_amount);
				System.out.println("Do you want to continue?\\nenter 1 to continue otherwise enter 0");
				continue_option=sc.nextInt();
				if(continue_option==1)
					houseConstruction();
				else
					System.out.println("Thank you");
			}
			else if(option==2)
			{
				estimate_amount=obj.Home(total_area_of_house,1500);
				System.out.println("Your estimated house construction cost is Rs."+estimate_amount);
				System.out.println("Do you want to continue?\nenter 1 to continue otherwise enter 0");
				continue_option=sc.nextInt();
				if(continue_option==1)
					houseConstruction();
				else
					System.out.println("Thank you");
			}
			else if(option==3)
			{
				estimate_amount=obj.Home(total_area_of_house,1800);
				System.out.println("Your estimated house construction cost is Rs."+estimate_amount);
				System.out.println("Do you want to continue?\\nenter 1 to continue otherwise enter 0");
				continue_option=sc.nextInt();
				if(continue_option==1)
					houseConstruction();
				else
					System.out.println("Thank you");
			}
		}
		
	}

}
