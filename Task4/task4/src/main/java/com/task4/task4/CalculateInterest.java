package com.task4.task4;

public class CalculateInterest {
	//Calculating Simple Interest
	public float calculateSimpleInterest(float Principle,float Time,float Rate)
	{
		float Simple_Interest;
		Simple_Interest=(Principle*Time*Rate)/100;
		return Simple_Interest;
	}
	//Calculating Compound Interest
	public float calculateCompoundInterest(float Principle,float Time,float Rate)
	{
		float Compound_Interest;
		Compound_Interest = (float)(Principle*(Math.pow((1+Rate/100),Time)));        
		return Compound_Interest;
	}
}